
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class EliminarPersona extends javax.swing.JFrame {
    
    ConsumoAPI ejemplo = new ConsumoAPI();
    Gson gson = new Gson();
    
    Menu ventanaMenu;
    
    public EliminarPersona(Menu ventanaMenu) {
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
        ImgDeleteUser = new javax.swing.JLabel();
        etqBuscarCedula = new javax.swing.JLabel();
        campo_BuscarCedula = new javax.swing.JTextField();
        btnBuscarCedula = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        etqBuscandoUsuario = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        PanelFooter = new javax.swing.JPanel();
        etqDeveloper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Eliminar Usuario - Java&Php");
        setResizable(false);

        PanelTitulo.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ELIMINAR USUARIO");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etqTitulo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelBody.setBackground(new java.awt.Color(222, 222, 222));

        ImgDeleteUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgDeleteUser.png"))); // NOI18N

        etqBuscarCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqBuscarCedula.setText("BUSCAR CEDULA");

        campo_BuscarCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_BuscarCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        etqBuscandoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etqBuscandoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqBuscandoUsuario.setText("Buscando Usuario...");

        etqCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCedula.setText("CEDULA");

        campo_cedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campo_cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_cedula.setDisabledTextColor(new java.awt.Color(50, 50, 50));

        campo_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_nombre.setDisabledTextColor(new java.awt.Color(70, 70, 70));

        campo_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_apellido.setDisabledTextColor(new java.awt.Color(70, 70, 70));

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

        btnEliminar.setBackground(new java.awt.Color(110, 125, 191));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImgDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBodyLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(etqBuscarCedula)
                                .addGap(18, 18, 18)
                                .addComponent(campo_BuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelBodyLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelBodyLayout.createSequentialGroup()
                                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelBodyLayout.createSequentialGroup()
                                        .addComponent(etqCedula)
                                        .addGap(18, 18, 18)
                                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqBuscandoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgDeleteUser)
                .addGap(19, 19, 19)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqBuscarCedula)
                    .addComponent(campo_BuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqBuscandoUsuario)
                .addGap(25, 25, 25)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(campo_apellido))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
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
                .addComponent(etqDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
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

                campo_cedula.setText(cedula);
                campo_nombre.setText(nombres);
                campo_apellido.setText(apellidos);

                etqBuscandoUsuario.setText("Usuario Encontrado Correctamente");
                campo_cedula.setEnabled(false);
                campo_BuscarCedula.setText("");
                btnEliminar.setEnabled(true);
                
            }else{

                campo_cedula.setText("");
                campo_nombre.setText("");
                campo_apellido.setText("");

                etqBuscandoUsuario.setText("La Cedula NO existe en la base de datos");
                btnEliminar.setEnabled(false);
            }
            
        }else{

            campo_cedula.setText("");
            campo_nombre.setText("");
            campo_apellido.setText("");

            etqBuscandoUsuario.setText("Ingrese un dato valido en el buscador");
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarCedulaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String cedula = campo_cedula.getText();
        
        if (!cedula.equals("")){
            
            Map<String, String> deleteData = new HashMap<>();
            deleteData.put("cedula", campo_cedula.getText());
            System.out.println("Consumo DELETE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Delete.php", deleteData));
            
            campo_cedula.setText("");
            campo_nombre.setText("");
            campo_apellido.setText("");
            
            etqBuscandoUsuario.setText("Usuario Eliminado Correctamente");

      
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    public void initAlternComponents(){
        System.out.println("Abriendo ventana (Eliminar Usuario)");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/JavaAndPhp.png") ) );
        
        campo_cedula.setEnabled(false);
        campo_nombre.setEnabled(false);
        campo_apellido.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgDeleteUser;
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton btnBuscarCedula;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campo_BuscarCedula;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel etqBuscandoUsuario;
    private javax.swing.JLabel etqBuscarCedula;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDeveloper;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
