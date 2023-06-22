import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Moneda extends JFrame{
    
    //Atributos 
    public int numero; 

    public Moneda(){
        this.numero = 0;
        initComponent();
    }

    public void initComponent(){

        Toolkit info_sistema = Toolkit.getDefaultToolkit(); 
        Dimension pantalla = info_sistema.getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;

        //Paneles y grid de la ventana
        JPanel contenedor1 = new JPanel();
        JPanel contenedor2 = new JPanel();
        GridLayout capa1 = new GridLayout(2,1);
        GridLayout capa2 = new GridLayout(1,3);
        contenedor1.setLayout(capa1);
        contenedor2.setLayout(capa2);
        contenedor2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        Color BackgroundDatos = new Color(0xFFFFFF);
        Color BackgroundResultado = new Color(0xCACACA);

        contenedor1.setBackground(BackgroundResultado);
        contenedor2.setBackground(BackgroundDatos);


        //OBJETOS DE LA VENTANA

        //Seccion de datos
        JLabel etiqueta_cantidad = new JLabel("CANTIDAD");
        JTextField campo_numero = new JTextField();
        JButton btn_Ejecutar = new JButton("CONVERTIR VALOR");

        etiqueta_cantidad.setFont( new Font("Arial", Font.BOLD, 15) );
        campo_numero.setFont( new Font("Arial", Font.BOLD, 15) );
        btn_Ejecutar.setFont( new Font("Arial", Font.BOLD, 15) );


        //Seccion Resultado
        JLabel resultado = new JLabel("000.000.000");
        resultado.setFont( new Font("Arial", Font.BOLD, 22) );
        etiqueta_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
        resultado.setHorizontalAlignment(SwingConstants.CENTER);
        campo_numero.setHorizontalAlignment(SwingConstants.CENTER);

        
        //Diseño a boton
        Color fondoboton1 = new Color(0x8DF8FF);
        String hexcolor1 = "#0097FF";
        int rgb1 = Integer.parseInt(hexcolor1.substring(1), 16);
        Color color1 = new Color(rgb1);
        btn_Ejecutar.setBackground(fondoboton1);
        btn_Ejecutar.setBorder(BorderFactory.createLineBorder(color1, 4));


        //Añadidos a la ventana
        contenedor2.add(etiqueta_cantidad);
        contenedor2.add(campo_numero);
        contenedor2.add(btn_Ejecutar);
        contenedor1.add(contenedor2);
        contenedor1.add(resultado);
        add(contenedor1);


        //Atributos de la ventana
        setTitle("Formato Moneda");
        setSize(ancho/2, alto/4);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        revalidate();


        //Eventos
        ActionListener evento_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String texto = campo_numero.getText();
				if( !texto.equalsIgnoreCase("") && validarNumero(texto) ){
					resultado.setText( formatoMoneda(texto) );
					campo_numero.setText("");
					campo_numero.requestFocus();
                    System.out.println("-> (prueba en consola) Se ha dado click en el boton satisfactoriamente.");
                    System.out.println("-> (prueba en consola) tu numero ingresado es: "+texto);
				}else{
                    System.out.println("-> (prueba en consola) Dato ingresado en el imput es: "+texto);
					resultado.setText( "-- EL DATO INGRESADO NO ES CORRECTO --" );
					campo_numero.requestFocus();
				}
			}
		};
		btn_Ejecutar.addActionListener( evento_01 );
	}


    //Metodos para la conversion del numero
	public boolean validarNumero(String texto){
		int cont = 0;
		for (int i=0; i<texto.length(); i++) {
			int codigo = (int) texto.charAt(i);
			if ((codigo<48 || codigo>57) && codigo!=44 && codigo!=45 && codigo!=46){
				return false;
			}
			if (codigo==44 || codigo==46){
				cont++;
			}
		}
		return (cont<=1);
	}

	public String formatoMoneda(String texto){
		Double numero = Double.parseDouble(texto.replace(",","."));
		NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		return formatoMoneda.format(numero).replaceAll(",00","");
	}

}

