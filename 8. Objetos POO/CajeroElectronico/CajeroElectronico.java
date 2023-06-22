import java.util.Date;

public class CajeroElectronico{

	// Atributos
	private int tipo_lectura;				// 1.chip   2.NFC   3.Chip y NFC
	private int capacidad_total;
	private int cant_dinero_disponible;
	private int transferencia_maxima;
	private int cant_10;
	private int cant_20;
	private int cant_50;
	private int cant_100;
	private String nombre_banco;
	private String [] lista_transacciones;
	private String user_admin;
	private String clave_admin;
	private int valorEnvio;
	// private int billete_10;
	// private int billete_20;
	// private int billete_50;
	// private int billete_100;

	// Metodos
	public CajeroElectronico(int tipo_lectura, int capacidad_total, int cant_dinero_disponible, int transferencia_maxima, int cant_10, int cant_20, int cant_50, int cant_100, String nombre_banco, String user_admin, String clave_admin){
		this.tipo_lectura = tipo_lectura;
		this.capacidad_total = capacidad_total;
		this.cant_dinero_disponible = cant_dinero_disponible;
		this.transferencia_maxima = transferencia_maxima;
		this.cant_10 = cant_10;
		this.cant_20 = cant_20;
		this.cant_50 = cant_50;
		this.cant_100 = cant_100;
		this.nombre_banco = nombre_banco;
		this.user_admin = user_admin;
		this.clave_admin = clave_admin;
		this.lista_transacciones = new String[5];
	}
	public int getTransMax(){
		return this.transferencia_maxima;
	}

	public void retirarDineroTarjeta(TarjetaDebito tarjeta, String clave, int valor){
		if(valor%10000 == 0){
			// Verificar clave
			if ( tarjeta.verificarPassword(clave) ) {
				// Verificar si la tarjeta tiene el dinero suficiente
				if (tarjeta.getSaldo() >= valor) {
					// Verificar si el cajero tiene el dinero suficiente
					if ( this.cant_dinero_disponible >= valor ) {
						if ( this.actualizarCantidadBilletes(valor) ) {
							tarjeta.disminuirSaldo(valor);
							this.cant_dinero_disponible -= valor;
							this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "OK:200");
						}else{
							this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error:No hay billetes suficientes para el monto solicitado.");
						}
					}else{
						this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: Dinero Cajero Insuficiente");
					}
				}else{
					this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: Saldo Tarjeta Insuficiente");
				}
			}else{
				this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: clave");
			}
		}else{
			this.registrarLog("RETIRO", tarjeta.getNumero(), valor, "Error: Valor debe ser multiplo de 10.000");
		}

	}

	public void consignarDineroTarjeta(TarjetaDebito tarjeta, String clave, int cantB10, int cantB20, int cantB50, int cantB100){
		int billete_10 = cantB10*10000;
		int billete_20 = cantB20*20000;
		int billete_50 = cantB50*50000;
		int billete_100 = cantB100*100000;

		this.cant_10 += cantB10;
		this.cant_20 += cantB20;
		this.cant_50 += cantB50;
		this.cant_100 += cantB100;

		this.valorEnvio=billete_10+billete_20+billete_50+billete_100;
		if(this.valorEnvio%10000 == 0){
			// Verificar clave
			if ( tarjeta.verificarPassword(clave) ) {
				// Verificar si el cajero recibe el dinero suficiente
				if ( this.transferencia_maxima >= valorEnvio ) {
					if ( this.actualizarCantidadBilletes(valorEnvio) ) {
						tarjeta.aumentarSaldo(valorEnvio);
						this.cant_dinero_disponible += valorEnvio;
						this.registrarLog("CONSIGNACION", tarjeta.getNumero(), valorEnvio, "OK:200");
					}else{
						this.registrarLog("CONSIGNACION", tarjeta.getNumero(), valorEnvio, "Error:No hay billetes suficientes para el monto solicitado.");
					}
				}else{
					this.registrarLog("CONSIGNACION", tarjeta.getNumero(), valorEnvio, "Error: El Cajero no puede recibir ese monto");
				}
			}else{
				this.registrarLog("CONSIGANACION", tarjeta.getNumero(), valorEnvio, "Error: clave");
			}
		}else{
			this.registrarLog("CONSIGNACION", tarjeta.getNumero(), valorEnvio, "Error: Valor debe ser multiplo de 10.000");
		}
	}

	public void consultarSaldoTarjeta(TarjetaDebito tarjeta, String clave){
		if ( tarjeta.verificarPassword(clave) ) {
			this.registrarLogT("CONSULTA SALDO", tarjeta.getNumero(), tarjeta.getSaldo(), "OK:200");
		} else{
			this.registrarLogT("CONSULTA SALDO", tarjeta.getNumero(), 0, "ERROR:403");
		}
	}

	public void cambiarClave(TarjetaDebito tarjeta, String clave){
		if ( tarjeta.verificarPassword(clave) ) {
			this.registrarLogT("CAMBIO CLAVE", tarjeta.getNumero(), tarjeta.getSaldo(), "OK:200");
		} else{
			this.registrarLogT("CAMBIO CLAVE", tarjeta.getNumero(), 0, "ERROR:403");
		}
	}

	public void registrarLogT(String tipo, String numero_t, int saldo,  String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+numero_t+" || "+String.valueOf(saldo)+" || "+estado;
		
		if (this.lista_transacciones[ this.lista_transacciones.length-1 ] == null) {
			for(int i=0; i<this.lista_transacciones.length; i++){
				if (this.lista_transacciones[i]==null) {
					this.lista_transacciones[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.lista_transacciones.length-1; i++) {
				this.lista_transacciones[i] = this.lista_transacciones[i+1];
			}
			this.lista_transacciones[this.lista_transacciones.length-1] = log;
		}
	}

	public void actualizarTotalCajero(String usuario, String password, int valortotal, int cant_10, int cant_20, int cant_50, int cant_100){
		// Validar el usuario
		if (this.user_admin.equals(usuario) && this.clave_admin.equals(password)) {
			// Validar que el dinero total coincida con las cantidades de billetes 
			int resultado = (10000*cant_10)+(20000*cant_20)+(50000*cant_50)+(100000*cant_100);
			if (resultado==valortotal) {
				this.cant_dinero_disponible = resultado;
				this.cant_10 = cant_10;
				this.cant_20 = cant_20;
				this.cant_50 = cant_50;
				this.cant_100 = cant_100;
				this.registrarLog("ABASTECER", "0000000000000000", valortotal, "OK:200");
				System.out.println(" ===== OK - PROCESO REALIZADO CON EXITO =====");
			}else{
				this.registrarLog("ABASTECER", "0000000000000000", valortotal, "Error:404");
				System.out.println(" ===== ERROR - EL TOTAL INGRESADO NO ES CONSISTENTE =====");
			}	
		}else{
			this.registrarLog("ABASTECER", "0000000000000000", valortotal, "Error:403");
			System.out.println(" ===== ERROR - USUARIO O PASSWORD INCORRECTO =====");
		}
	}

	public void registrarLog(String tipo, String numero_t, int valorTotal,  String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+numero_t+" || "+String.valueOf(valorTotal)+" || "+estado;
		
		if (this.lista_transacciones[ this.lista_transacciones.length-1 ] == null) {
			for(int i=0; i<this.lista_transacciones.length; i++){
				if (this.lista_transacciones[i]==null) {
					this.lista_transacciones[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.lista_transacciones.length-1; i++) {
				this.lista_transacciones[i] = this.lista_transacciones[i+1];
			}
			this.lista_transacciones[this.lista_transacciones.length-1] = log;
		}
	}

	public void imprimirDatosCajero(){
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-- tipo_lectura: "+this.tipo_lectura);
		System.out.println("-- capacidad_total: "+this.capacidad_total);
		System.out.println("-- cant_dinero_disponible: "+this.cant_dinero_disponible);
		System.out.println("-- cant_10: "+this.cant_10);
		System.out.println("-- cant_20: "+this.cant_20);
		System.out.println("-- cant_50: "+this.cant_50);
		System.out.println("-- cant_100: "+this.cant_100);
		System.out.println("-- nombre_banco: "+this.nombre_banco);
		System.out.println("-- user_admin: "+this.user_admin);
		System.out.println("-- clave_admin: "+this.clave_admin);
		System.out.println("-- lista_transacciones: ");
		for (int i=0; i<this.lista_transacciones.length; i++) {
			if (this.lista_transacciones[i] != null) {
				System.out.println("     => "+this.lista_transacciones[i]);
			}
		}
		System.out.println("-----------------------------------------\n");
	}

	public boolean actualizarCantidadBilletes(int valor){
		int nuevo_valor = 0;

		// Calcular billetes de $100.000
		int temp_100 = valor/100000;
		if (this.cant_100>=temp_100) {
			nuevo_valor = valor - (temp_100*100000);
		}else{
			temp_100 = 0;
		}
		System.out.println("Billetes de 100: "+temp_100);

		// Calcular billetes de $ 50.000
		int temp_50 = nuevo_valor/50000;
		if(this.cant_50>=temp_50){
			nuevo_valor = nuevo_valor - (temp_50*50000);
		}else{
			temp_50 = 0;
		}
		System.out.println("Billetes de 50: "+temp_50);

		// Calcular billetes de $ 20.000
		int temp_20 = nuevo_valor/20000;
		if(this.cant_20>=temp_20){
			nuevo_valor = nuevo_valor - (temp_20*20000);
		}else{
			temp_20 = 0;
		}
		System.out.println("Billetes de 20: "+temp_20);

		// Calcular billetes de $ 10.000
		int temp_10 = nuevo_valor/10000;
		if(this.cant_10>=temp_10){
			nuevo_valor = nuevo_valor - (temp_10*10000);
		}else{
			temp_10 = 0;
		}
		System.out.println("Billetes de 10: "+temp_10);


		if (nuevo_valor==0) {
			this.cant_100 -= temp_100;
			this.cant_50 -= temp_50;
			this.cant_20 -= temp_20;
			this.cant_10 -= temp_10;
			return true;
		}else{
			return false;
		}
	}

}