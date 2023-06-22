
package Principal;

public class Menu extends javax.swing.JFrame {
    
    
    Persona listaPersonas[];
    int indexPersona;

    public Menu() {
        this.listaPersonas = new Persona [100];
        this.indexPersona = 0;
        initComponents();
        initAlternativeComponents();
    }
    public void initAlternativeComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu = new javax.swing.JPanel();
        etq_menu = new javax.swing.JLabel();
        panel_btns = new javax.swing.JPanel();
        btn_crearUser = new javax.swing.JButton();
        btn_eliminarUser = new javax.swing.JButton();
        btn_modificarUser = new javax.swing.JButton();
        btn_listarUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panel_menu.setBackground(new java.awt.Color(0, 0, 0));

        etq_menu.setBackground(new java.awt.Color(255, 255, 255));
        etq_menu.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etq_menu.setForeground(new java.awt.Color(255, 255, 255));
        etq_menu.setText("MENU");

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(etq_menu)
                .addGap(140, 140, 140))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(etq_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panel_btns.setBackground(new java.awt.Color(204, 204, 204));

        btn_crearUser.setBackground(new java.awt.Color(204, 255, 51));
        btn_crearUser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_crearUser.setForeground(new java.awt.Color(0, 0, 0));
        btn_crearUser.setText("CREAR USUARIO");
        btn_crearUser.setFocusable(false);
        btn_crearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearUserActionPerformed(evt);
            }
        });

        btn_eliminarUser.setBackground(new java.awt.Color(153, 153, 255));
        btn_eliminarUser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_eliminarUser.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminarUser.setText("ELIMINAR USUARIO");
        btn_eliminarUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_eliminarUser.setFocusable(false);
        btn_eliminarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarUserActionPerformed(evt);
            }
        });

        btn_modificarUser.setBackground(new java.awt.Color(255, 255, 255));
        btn_modificarUser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_modificarUser.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificarUser.setText("MODIFICAR USUARIO");
        btn_modificarUser.setFocusable(false);
        btn_modificarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarUserActionPerformed(evt);
            }
        });

        btn_listarUser.setBackground(new java.awt.Color(255, 255, 255));
        btn_listarUser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_listarUser.setForeground(new java.awt.Color(0, 0, 0));
        btn_listarUser.setText("LISTAR USUARIO");
        btn_listarUser.setFocusable(false);
        btn_listarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_btnsLayout = new javax.swing.GroupLayout(panel_btns);
        panel_btns.setLayout(panel_btnsLayout);
        panel_btnsLayout.setHorizontalGroup(
            panel_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_btnsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_eliminarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_crearUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_listarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102))
        );
        panel_btnsLayout.setVerticalGroup(
            panel_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_btnsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_crearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_listarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_btns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_btns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearUserActionPerformed
        CrearUsuario ventanaUser = new CrearUsuario(this);
        ventanaUser.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btn_crearUserActionPerformed

    private void btn_modificarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarUserActionPerformed
        ModificarUsuario ventanaMod = new ModificarUsuario(this);
        ventanaMod.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_modificarUserActionPerformed

    private void btn_eliminarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarUserActionPerformed
        EliminarUsuario ventanaDel = new EliminarUsuario(this);
        ventanaDel.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_eliminarUserActionPerformed

    private void btn_listarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarUserActionPerformed
       System.out.println("Lista Personas: ");
        for (int i=0; i<this.listaPersonas.length; i++) {
            if (this.listaPersonas[i]!=null) {
                System.out.println(i+" => "+this.listaPersonas[i].getCedula()+" - "+this.listaPersonas[i].getNombres()+" "+this.listaPersonas[i].getApellidos() );
            }
        }
        
        setVisible(false);
        ListarUsuarios ventana = new ListarUsuarios(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_listarUserActionPerformed

    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearUser;
    private javax.swing.JButton btn_eliminarUser;
    private javax.swing.JButton btn_listarUser;
    private javax.swing.JButton btn_modificarUser;
    private javax.swing.JLabel etq_menu;
    private javax.swing.JPanel panel_btns;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}
