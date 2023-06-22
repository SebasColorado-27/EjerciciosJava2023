import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame{

    private JPanel contenedor;
    private GridLayout capa;
    private JLabel etiqueta_usuario;
    private JLabel etiqueta_password;
    private JTextField campo_usuario;
    private JPasswordField campo_password;
    private JButton btn_ingresar;
    private JButton btn_cancelar;


    public Login(){
        initComponent();
    }

    public void initComponent(){
        setVisible(true);
        setTitle("NUEVA VENTANA LOGIN");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contenedor = new JPanel();
        capa = new GridLayout(3,3);
        contenedor.setLayout(capa);
        contenedor.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        etiqueta_usuario = new JLabel("USUARIO: ");
        etiqueta_password = new JLabel("PASSWORD: ");
        campo_usuario = new JTextField();
        campo_password = new JPasswordField();
        btn_ingresar = new JButton("INGRESAR");
        btn_cancelar = new JButton("CANCELAR");

        contenedor.add(etiqueta_usuario);
        contenedor.add(campo_usuario);
        contenedor.add(etiqueta_password);
        contenedor.add(campo_password);
        contenedor.add(btn_ingresar);
        contenedor.add(btn_cancelar);

        add(contenedor);
        pack();

        ActionListener evento_ingresar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                validarDatosSesion();
            }
        };
        ActionListener evento_cancelar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cerrarVentana();
            }
        };

        Color colorCancelar = new Color(0x66BCFF);
        Color colorIngresar = new Color(0xA0FF66);
        btn_cancelar.setBackground(colorCancelar);
        btn_ingresar.setBackground(colorIngresar);

        btn_ingresar.addActionListener(evento_ingresar);
        btn_cancelar.addActionListener(evento_cancelar);

        
    }

    public void validarDatosSesion(){
        String texto_usuario = campo_usuario.getText();
        String texto_password = campo_password.getText();
        System.out.println(" --> Usuario: "+texto_usuario);
        System.out.println(" --> Password: "+texto_password);
    }

    public void cerrarVentana(){
        System.out.println("Se ha dado Click en el boton Cancelar");
        System.out.println("--------FINALIZANDO APLICACION-------");
        dispose();
    }

}