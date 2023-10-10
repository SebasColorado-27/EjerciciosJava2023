
package principal;

import java.util.HashMap;
import java.util.Map;


public class RegistrarPersona extends javax.swing.JFrame {

    ConsumoAPI ejemplo = new ConsumoAPI();
    Menu ventanaMenu;
    
    public RegistrarPersona(Menu ventanaMenu) {
        this.ventanaMenu=ventanaMenu;
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        System.out.println("Abriendo ventana (Registrar Persona)");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/JavaAndPhp.png") ) );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etqApellido = new javax.swing.JLabel();
        campo_apellido = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        etqDireccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        ImgCreateUser = new javax.swing.JLabel();
        PanelFooter = new javax.swing.JPanel();
        etqDeveloper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Usuario - Java&Php");
        setResizable(false);

        PanelTitulo.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("CREAR USUARIO");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etqTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelBody.setBackground(new java.awt.Color(222, 222, 222));

        etqCedula.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etqCedula.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula.setText("CEDULA");

        campo_cedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(0, 0, 0));
        etqNombre.setText("NOMBRE");

        campo_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqApellido.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etqApellido.setForeground(new java.awt.Color(0, 0, 0));
        etqApellido.setText("APELLIDO");

        campo_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        campo_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqTelefono.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono.setText("TELEFONO");

        etqDireccion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etqDireccion.setForeground(new java.awt.Color(0, 0, 0));
        etqDireccion.setText("DIRECCION");

        campo_direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etqEmail.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(0, 0, 0));
        etqEmail.setText("EMAIL");

        campo_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(110, 125, 191));
        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 114, 0));
        btnCerrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCerrar.setText("CANCELAR");
        btnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        ImgCreateUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgCreateUser.png"))); // NOI18N

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqDireccion)
                            .addComponent(etqEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(campo_email)))
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelBodyLayout.createSequentialGroup()
                                .addComponent(etqNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBodyLayout.createSequentialGroup()
                                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etqApellido)
                                    .addComponent(etqCedula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelBodyLayout.createSequentialGroup()
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 53, 53))
            .addComponent(ImgCreateUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ImgCreateUser)
                .addGap(26, 26, 26)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqApellido))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTelefono))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDireccion))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        PanelFooter.setBackground(new java.awt.Color(0, 0, 0));

        etqDeveloper.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 14)); // NOI18N
        etqDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        etqDeveloper.setText("By CodeMasterSeb");

        javax.swing.GroupLayout PanelFooterLayout = new javax.swing.GroupLayout(PanelFooter);
        PanelFooter.setLayout(PanelFooterLayout);
        PanelFooterLayout.setHorizontalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFooterLayout.setVerticalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqDeveloper, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
        this.ventanaMenu.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String cedula = campo_cedula.getText();
        String nombre = campo_nombre.getText();
        String apellido = campo_apellido.getText();
        String telefono = campo_telefono.getText();
        String direccion = campo_direccion.getText();
        String email = campo_email.getText();
        
        if(!cedula.equals("") && !nombre.equals("") && !apellido.equals("") && !telefono.equals("") && !direccion.equals("") && !email.equals("")){
            
            Map<String, String> insertData = new HashMap<>();
            insertData.put("cedula", campo_cedula.getText());
            insertData.put("nombres", campo_nombre.getText());
            insertData.put("apellidos", campo_apellido.getText());
            insertData.put("telefono", campo_telefono.getText());
            insertData.put("direccion", campo_direccion.getText());
            insertData.put("email", campo_email.getText());
            System.out.println("Consumo INSERT: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Insert.php", insertData));
            
            campo_cedula.setText("");
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_telefono.setText("");
            campo_direccion.setText("");
            campo_email.setText("");
            
            dispose();
            this.ventanaMenu.setVisible(true);
        }else{
            System.out.println("faltan datos por llenar");

        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgCreateUser;
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etqApellido;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDeveloper;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
