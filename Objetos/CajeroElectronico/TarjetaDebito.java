
public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private String newPassword="00270";
	private int saldo;

	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
	}
	
	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			return true;
		}else{
			// registrar en log de la tarjeta
			return false;
		}
	}

	public boolean aumentarSaldo(int valorEnvio){
		if (valorEnvio>0) {
			this.saldo += valorEnvio;
			// registrar en log de tarjeta
			return true;
		}else{
			// registrar en log de la tarjeta
			return false;
		}
	}

	public int getSaldo(){
		return this.saldo;
	}

	public String getNumero(){
		return this.numero;
	}

	public String setPassword(String newPassword){
		return this.password=newPassword;
	}

	public String getPassword(){
		return this.password;
	}

	public String getNewPassword(){
		return this.newPassword;
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}

}