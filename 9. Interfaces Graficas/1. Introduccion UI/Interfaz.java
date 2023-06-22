import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz {

	public static void main(String[]args){

        //Objeto Toolkit que almacena la informacion del sistema 
        Toolkit info_sistema = Toolkit.getDefaultToolkit(); 
        //Metodo que retorna el los valores de la pantalla que detecta el sistema operativo
        Dimension pantalla = info_sistema.getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;


        //Instanciamos el objeto para crear la ventana
        JFrame ventana = new JFrame();

        //Hacemos visible la ventana mediante el metodo .setVisible() el cual recibe un boolean
        ventana.setVisible(true);

        //Ingresamos las medidas de la ventana con el metodo .setSize()
        // ventana.setSize(ancho/2, alto/2);

        //Asignamos un titulo a la ventana con el metodo .setTitle()
        ventana.setTitle("Ingreso / Introduccion UI");

        //Con el metodo .setResizable() podemos asignar si la ventana puede modificar su tamaño recibiendo un boolean
        ventana.setResizable(false);

        //Metodo para posicionar la ventana en el centro de la pantalla recibiendo el componente (null)
        ventana.setLocationRelativeTo(null);

        //Metodo para terminar la ejecucion de la ventana desde el cerrado de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //JPanel es un contenedor que esta dentro de la ventana
        JPanel contenedor = new JPanel();

        //Metdodo para asignar un sistema de tablas(fila,columna) para distribuir los elementos
        GridLayout capa = new GridLayout(3,2);

        //El metodo .setLayout() asignara la informacion del Layaut en el contenedor
        contenedor.setLayout(capa);

        //Asignar un borde al panel-contenedor
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        //Creamos las etiquetas labels con el metodo JLabel
        JLabel etiqueta_username = new JLabel("USERNAME");
        JLabel etiqueta_password = new JLabel("PASSWORD");

        //Creamos los campos de texto con el metodo JTextField
        JTextField campo_username = new JTextField();
        JPasswordField campo_password = new JPasswordField();

        //Creamos los botones con el metodo JButton
        JButton btn_ingresar = new JButton("INGRESAR");
        JButton btn_cancelar = new JButton("CANCELAR");

        // Establecer el color de fondo del botón
        Color colorCancelar = new Color(0xFF5733);
        Color colorIngresar = new Color(0x9AFA0B);
        btn_cancelar.setBackground(colorCancelar);
        btn_ingresar.setBackground(colorIngresar);

        //Ingresar las etiquetas al contenedor por orden como si fuera un arreglo
        contenedor.add(etiqueta_username);
        contenedor.add(campo_username);
        contenedor.add(etiqueta_password);
        contenedor.add(campo_password);
        contenedor.add(btn_ingresar);
        contenedor.add(btn_cancelar);

        //Eventos
        ActionListener evento_ingresar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Se ha dado Click en el boton ingresar");

                //Obtener los valores del imput con el metodo .getText()
                String texto_usuario = campo_username.getText();
                String texto_pass = campo_password.getText();

                System.out.println("-> Usuario: "+texto_usuario);
                System.out.println("-> Password: "+texto_pass);
            }
        };
        ActionListener evento_cancelar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Se ha dado Click en el boton Cancelar");
                System.out.println("--------FINALIZANDO APLICACION-------");
                ventana.dispose();
            }
        };

        //Asignar eventos a los botones
        btn_ingresar.addActionListener(evento_ingresar);
        btn_cancelar.addActionListener(evento_cancelar);

        //Asignar el contenerdor a la ventana
        ventana.add(contenedor);
        //Redibujar el contenido para carga
        ventana.revalidate();
        //Ajusta el contenido de la ventana basado en los elementos de forma interna
        ventana.pack();
    }
}