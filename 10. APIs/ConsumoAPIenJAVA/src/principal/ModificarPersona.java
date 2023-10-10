
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class ModificarPersona extends javax.swing.JFrame {
    
    ConsumoAPI ejemplo = new ConsumoAPI();
    Gson gson = new Gson();


    Menu ventanaMenu;
    
    public ModificarPersona(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        
        initComponents();
        initAlternComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        ImgEditUser = new javax.swing.JLabel();
        campo_BuscarCedula = new javax.swing.JTextField();
        etqBuscarCedula = new javax.swing.JLabel();
        btnBuscarCedula = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        etqCedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etqApellido = new javax.swing.JLabel();
        campo_apellido = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        etqBuscandoUsuario = new javax.swing.JLabel();
        PanelFooter = new javax.swing.JPanel();
        etqDeveloper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modificar Usuario - Java&Php");
        setResizable(false);

        PanelTitulo.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MODIFICAR USUARIO");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etqTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelBody.setBackground(new java.awt.Color(222, 222, 222));

        ImgEditUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgEditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgEditUser.png"))); // NOI18N

        campo_BuscarCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campo_BuscarCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etqBuscarCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqBuscarCedula.setText("BUSCAR CEDULA");

        btnBuscarCedula.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBuscarCedula.setText("BUSCAR");
        btnBuscarCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnBuscarCedula.setFocusable(false);
        btnBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCedulaActionPerformed(evt);
            }
        });

        separador.setBackground(new java.awt.Color(0, 0, 0));
        separador.setForeground(new java.awt.Color(0, 0, 0));

        etqCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCedula.setText("CEDULA");

        campo_cedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("NOMBRE");

        campo_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqApellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqApellido.setText("APELLIDO");

        campo_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTelefono.setText("TELEFONO");

        campo_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqDireccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDireccion.setText("DIRECCION");

        campo_direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqEmail.setText("EMAIL");

        campo_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnCancelar.setBackground(new java.awt.Color(255, 114, 0));
        btnCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(110, 125, 191));
        btnActualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnActualizar.setFocusable(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        etqBuscandoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etqBuscandoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqBuscandoUsuario.setText("Buscando Usuario...");

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImgEditUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBodyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_telefono)
                            .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(campo_cedula))))
                .addGap(21, 21, 21)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_nombre)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(campo_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_apellido)
                    .addComponent(etqApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(etqEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_email))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etqBuscarCedula)
                        .addGap(18, 18, 18)
                        .addComponent(campo_BuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separador))
            .addComponent(etqBuscandoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgEditUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etqBuscarCedula)
                        .addComponent(campo_BuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqBuscandoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEmail)
                    .addComponent(etqDireccion)
                    .addComponent(etqTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        PanelFooter.setBackground(new java.awt.Color(0, 0, 0));

        etqDeveloper.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 14)); // NOI18N
        etqDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        etqDeveloper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDeveloper.setText("By CodeMasterSeb");

        javax.swing.GroupLayout PanelFooterLayout = new javax.swing.GroupLayout(PanelFooter);
        PanelFooter.setLayout(PanelFooterLayout);
        PanelFooterLayout.setHorizontalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFooterLayout.setVerticalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqDeveloper, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        this.ventanaMenu.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCedulaActionPerformed
        
        String cedula_buscada = campo_BuscarCedula.getText();
        
        if (!cedula_buscada.equals("")){
            
            Map<String, String> getData = new HashMap<>();
            getData.put("cedula", campo_BuscarCedula.getText());
            String ConsultaIndividual = ejemplo.consumoGET("http://localhost/APIenPHP/getPersona.php", getData);

            if(!ConsultaIndividual.equals("[]")){
                JsonObject jsonObject = gson.fromJson(ConsultaIndividual, JsonObject.class);

                String cedula = jsonObject.get("cedula").getAsString();
                String nombres = jsonObject.get("nombres").getAsString();
                String apellidos = jsonObject.get("apellidos").getAsString();
                String telefono = jsonObject.get("telefono").getAsString();
                String direccion = jsonObject.get("direccion").getAsString();
                String email = jsonObject.get("email").getAsString();

                campo_cedula.setEnabled(true);
                campo_nombre.setEnabled(true);
                campo_apellido.setEnabled(true);
                campo_telefono.setEnabled(true);
                campo_direccion.setEnabled(true);
                campo_email.setEnabled(true);

                campo_cedula.setText(cedula);
                campo_nombre.setText(nombres);
                campo_apellido.setText(apellidos);
                campo_telefono.setText(telefono);
                campo_direccion.setText(direccion);
                campo_email.setText(email);

                etqBuscandoUsuario.setText("Usuario Encontrado Correctamente");
                campo_cedula.setEnabled(false);
                campo_BuscarCedula.setText("");
                btnActualizar.setEnabled(true);
                
            }else{
                campo_cedula.setEnabled(false);
                campo_nombre.setEnabled(false);
                campo_apellido.setEnabled(false);
                campo_telefono.setEnabled(false);
                campo_direccion.setEnabled(false);
                campo_email.setEnabled(false);

                campo_cedula.setText("");
                campo_nombre.setText("");
                campo_apellido.setText("");
                campo_telefono.setText("");
                campo_direccion.setText("");
                campo_email.setText("");

                etqBuscandoUsuario.setText("La Cedula NO existe en la base de datos");
                btnActualizar.setEnabled(false);
            }
            
        }else{
                campo_cedula.setEnabled(false);
                campo_nombre.setEnabled(false);
                campo_apellido.setEnabled(false);
                campo_telefono.setEnabled(false);
                campo_direccion.setEnabled(false);
                campo_email.setEnabled(false);

                campo_cedula.setText("");
                campo_nombre.setText("");
                campo_apellido.setText("");
                campo_telefono.setText("");
                campo_direccion.setText("");
                campo_email.setText("");

                etqBuscandoUsuario.setText("Ingrese un dato valido en el buscador");
                btnActualizar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarCedulaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        String cedula = campo_cedula.getText();
        String nombre = campo_nombre.getText();
        String apellido = campo_apellido.getText();
        String telefono = campo_telefono.getText();
        String direccion = campo_direccion.getText();
        String email = campo_email.getText();
        
        if(!cedula.equals("") && !nombre.equals("") && !apellido.equals("") && !telefono.equals("") && !direccion.equals("") && !email.equals("")){
            
            Map<String, String> updateData = new HashMap<>();
            updateData.put("cedula", campo_cedula.getText());
            updateData.put("nombres", campo_nombre.getText());
            updateData.put("apellidos", campo_apellido.getText());
            updateData.put("telefono", campo_telefono.getText());
            updateData.put("direccion", campo_direccion.getText());
            updateData.put("email", campo_email.getText());
            System.out.println("Consumo UPDATE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Update.php", updateData));
        
            campo_cedula.setText("");
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_telefono.setText("");
            campo_direccion.setText("");
            campo_email.setText("");
            
            etqBuscandoUsuario.setText("Usuario Modificado Correctamente");
            
        }else{
            System.out.println("faltan datos por llenar");

        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    public void initAlternComponents(){
        System.out.println("Abriendo ventana (Modificar Usuario)");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/JavaAndPhp.png") ) );
        
        campo_cedula.setEnabled(false);
        campo_nombre.setEnabled(false);
        campo_apellido.setEnabled(false);
        campo_telefono.setEnabled(false);
        campo_direccion.setEnabled(false);
        campo_email.setEnabled(false);
        btnActualizar.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgEditUser;
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarCedula;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campo_BuscarCedula;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etqApellido;
    private javax.swing.JLabel etqBuscandoUsuario;
    private javax.swing.JLabel etqBuscarCedula;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDeveloper;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
