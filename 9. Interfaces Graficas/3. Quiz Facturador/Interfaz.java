import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Interfaz extends JFrame{

	// Atributos
	private Persona listaClientes [];
	private Persona listaVendedores [];
	private JLabel datosCliente;
	private JLabel cedulaCli;
	private JLabel nombresCli;
	private JLabel direccionCli;
	private JLabel datosVendedor;
	private JLabel cedulaVen;
	private JLabel nombresVen;
	private JLabel productos;
	private JLabel id;
	private JLabel nombre;
	private JLabel cant;
	// private JLabel etq_btn_producto;
	// private JLabel etq_resultado;
	// private JLabel etq_total;
	private JTextField campo_cedulaCli;
	private JTextField campo_nombreCli;
	private JTextField campo_direccionCli;
	private JTextField campo_cedulaVen;
	private JTextField campo_nombreVen;
	private JTextField idproducto;
	private JTextField nombreproducto;
	private JTextField cantproducto;
	private JButton btn_BuscarCli;
	private JButton btn_BuscarVen;
	private JButton agregarpro;
  private JTextArea AreaProductos;

	// Metodos
	public Interfaz(Persona[] listaClientes, Persona[] listaVendedores){
        this.listaClientes = listaClientes;
		this.listaVendedores = listaVendedores;

		initComponent();
	}

	public void initComponent(){

        //Contenedores
        JPanel contenedorFactura = new JPanel();
        JPanel encabezadoDC = new JPanel();
        JPanel panelDatosCliente = new JPanel();
        JPanel encabezadoDV = new JPanel();
        JPanel panelDatosVendedor = new JPanel();
        JPanel encabezadoPRO = new JPanel();
        JPanel busquedaProductos = new JPanel();

        //----------------------------------Añadidos a los contenedores---------------------------------//

        //Panel Principal de la factura
        GridLayout layoutPrincipal = new GridLayout(8,1);
        contenedorFactura.setLayout(layoutPrincipal);
        Color fondoFactura = new Color(0xFFFFFF);
        contenedorFactura.setBackground(fondoFactura);
        contenedorFactura.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20) );


        //Panel del encabezado "Datos Cliente"
        GridLayout layoutDC = new GridLayout(1,4);
        encabezadoDC.setLayout(layoutDC);
        JLabel datosCliente = new JLabel("DATOS CLIENTE : ");
        encabezadoDC.add(datosCliente);
        encabezadoDC.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
        datosCliente.setFont( new Font("Arial", Font.BOLD, 20) );


        //Panel de imputs y labels "Datos Cliente"
        GridLayout layoutDatosCliente = new GridLayout(3,2);
        panelDatosCliente.setLayout(layoutDatosCliente);
        JLabel cedulaCli = new JLabel("Cedula: ");
        JLabel nombresCli = new JLabel("Nombres: ");
        JLabel direccionCli = new JLabel("Direccion: ");
        JButton btn_BuscarCli = new JButton("BUSCAR");
        campo_cedulaCli = new JTextField();
        campo_nombreCli = new JTextField();
        campo_direccionCli = new JTextField();
        JPanel campoybtn = new JPanel();
        GridLayout campYbtnLayout = new GridLayout(1,2);
        campoybtn.setLayout(campYbtnLayout);
        panelDatosCliente.add(cedulaCli);
        panelDatosCliente.add(campoybtn);
        campoybtn.add(campo_cedulaCli);
        campoybtn.add(btn_BuscarCli);
        panelDatosCliente.add(nombresCli);
        panelDatosCliente.add(campo_nombreCli);
        panelDatosCliente.add(direccionCli);
        panelDatosCliente.add(campo_direccionCli);
        panelDatosCliente.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );


        //Panel del encabezado "Datos Vendedor"
        GridLayout layoutDV = new GridLayout(1,4);
        encabezadoDV.setLayout(layoutDC);
        JLabel datosVendedor = new JLabel("DATOS VENDEDOR: ");
        encabezadoDV.add(datosVendedor);
        encabezadoDV.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
        datosVendedor.setFont( new Font("Arial", Font.BOLD, 20) );


        //Panel de imputs y labels "Datos Vendedor"
        GridLayout layoutDatosVendedor = new GridLayout(2,2);
        panelDatosVendedor.setLayout(layoutDatosVendedor);
        JLabel cedulaVen = new JLabel("Cedula: ");
        JLabel nombresVen = new JLabel("Nombres: ");
        JButton btn_BuscarVen = new JButton("BUSCAR");
        campo_cedulaVen = new JTextField();
        campo_nombreVen = new JTextField();
        JPanel campoybtn2 = new JPanel();
        GridLayout campYbtnLayout2 = new GridLayout(1,2);
        campoybtn2.setLayout(campYbtnLayout2);
        panelDatosVendedor.add(cedulaVen);
        panelDatosVendedor.add(campoybtn2);
        campoybtn2.add(campo_cedulaVen);
        campoybtn2.add(btn_BuscarVen);
        panelDatosVendedor.add(nombresVen);
        panelDatosVendedor.add(campo_nombreVen);
        panelDatosVendedor.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );


        //Panel del encabezado "Productos"
        GridLayout layoutPRO = new GridLayout(1,4);
        encabezadoPRO.setLayout(layoutPRO);
        JLabel productos = new JLabel("PRODUCTOS: ");
        encabezadoPRO.add(productos);
        encabezadoPRO.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10));
        productos.setFont( new Font("Arial", Font.BOLD, 20) );

        //Panel de busqueda de productos
        GridLayout layoutProductos = new GridLayout(2,4);
        busquedaProductos.setLayout(layoutProductos);
        JLabel id = new JLabel("ID");
        JLabel nombre = new JLabel("NOMBRE");
        JLabel cant = new JLabel("CANTIDAD");
        JLabel espaciado = new JLabel(" ");
        idproducto = new JTextField();
        nombreproducto = new JTextField();
        cantproducto = new JTextField();
        JButton agregarpro = new JButton("AGREGAR");
        busquedaProductos.add(id);
        busquedaProductos.add(nombre);
        busquedaProductos.add(cant);
        busquedaProductos.add(espaciado);
        busquedaProductos.add(idproducto);
        busquedaProductos.add(nombreproducto);
        busquedaProductos.add(cantproducto);
        busquedaProductos.add(agregarpro);
        busquedaProductos.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );


        //PANEL DE PRODUCTOS
        AreaProductos = new JTextArea();
        AreaProductos.setFont( new Font("Arial", Font.ITALIC, 15) );
        AreaProductos.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        agregarpro.addActionListener(e -> agregarTexto());

        
        //Diseño front-end a botones
        Color fondoboton1 = new Color(0xB4EBFF);
        String hexcolor1 = "#0097FF";
        int rgb1 = Integer.parseInt(hexcolor1.substring(1), 16);
        Color color1 = new Color(rgb1);
        btn_BuscarCli.setBackground(fondoboton1);
        btn_BuscarCli.setBorder(BorderFactory.createLineBorder(color1, 2));

        Color btn_fondo2 = new Color(0xFFE2B4);
        String hexcolor2 = "#FF9B00";
        int rgb2 = Integer.parseInt(hexcolor2.substring(1), 16);
        Color color2 = new Color(rgb2);
        btn_BuscarVen.setBackground(btn_fondo2);
        btn_BuscarVen.setBorder(BorderFactory.createLineBorder(color2, 2));

        Color btn_fondo3 = new Color(0x96FF49);
        agregarpro.setBackground(btn_fondo3);


        //Contenedores Terminados para añadir a la ventana
        contenedorFactura.add(encabezadoDC);
        contenedorFactura.add(panelDatosCliente);
        contenedorFactura.add(encabezadoDV);
        contenedorFactura.add(panelDatosVendedor);
        contenedorFactura.add(encabezadoPRO);
        contenedorFactura.add(busquedaProductos);
        contenedorFactura.add(AreaProductos);

    this.campo_nombreCli.setEnabled(false);
		this.campo_direccionCli.setEnabled(false);
		deshabilitarInput(this.campo_nombreCli);
		deshabilitarInput(this.campo_direccionCli);

    this.campo_nombreVen.setEnabled(false);
    deshabilitarInput(this.campo_nombreVen);

        //Metodos De la Ventana
        add(contenedorFactura);
        pack();
        setTitle("Factura");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        ActionListener evento_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarCliente();
			}
		};
		btn_BuscarCli.addActionListener( evento_01 );

        ActionListener evento_02 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarVendedor();
			}
		};
		btn_BuscarVen.addActionListener( evento_02 );
		
		
    }

    public void buscarVendedor(){
		String texto = campo_cedulaVen.getText();
		boolean encontrado = false;
		for (int i=0; i<this.listaVendedores.length; i++) {
			if(this.listaVendedores[i]!=null && this.listaVendedores[i].getCedula().equalsIgnoreCase(texto)){
				this.campo_nombreVen.setText( this.listaVendedores[i].getNombres() );
				encontrado = true;
				break;
			}
		}

		if(encontrado){
			deshabilitarInput(this.campo_nombreVen);
			this.idproducto.requestFocus();
		}else{
			habilitarInput(this.campo_nombreVen);
			this.campo_nombreVen.requestFocus();
		}	
	}

	public void buscarCliente(){
		String texto = campo_cedulaCli.getText();
		boolean encontrado = false;
		for (int i=0; i<this.listaClientes.length; i++) {
			if(this.listaClientes[i]!=null && this.listaClientes[i].getCedula().equalsIgnoreCase(texto)){
				this.campo_nombreCli.setText( this.listaClientes[i].getNombres() );
				this.campo_direccionCli.setText( this.listaClientes[i].getDireccion() );
				encontrado = true;
				break;
			}
		}

		if(encontrado){
			deshabilitarInput(this.campo_nombreCli);
			deshabilitarInput(this.campo_direccionCli);
			this.campo_cedulaVen.requestFocus();
		}else{
			habilitarInput(this.campo_nombreCli);
			habilitarInput(this.campo_direccionCli);
			this.campo_nombreCli.requestFocus();
		}	
	}

	public void deshabilitarInput(JTextField input){
		input.setEditable(false);
		input.setEnabled(false);
		input.setDisabledTextColor(Color.black);
	}

	public void habilitarInput(JTextField input){
		input.setText("");
		input.setEditable(true);
		input.setEnabled(true);
	}

  private void agregarTexto() {
        String id = idproducto.getText();
        String texto = nombreproducto.getText();
        String canti = cantproducto.getText();
        AreaProductos.append(id+ " | " + texto + " | "+ canti + "\n");
        idproducto.setText("");
        nombreproducto.setText("");
        cantproducto.setText("");
  }

}