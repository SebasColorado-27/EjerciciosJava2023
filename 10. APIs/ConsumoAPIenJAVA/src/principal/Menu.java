
package principal;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        etqTexto = new javax.swing.JLabel();
        ImgJavaAndPhp = new javax.swing.JLabel();
        btnCrearUsuarios = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();
        btnModificarUsuarios = new javax.swing.JButton();
        btnEliminarUsuarios = new javax.swing.JButton();
        PanelFooter = new javax.swing.JPanel();
        etqDeveloper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - Java&Php");
        setResizable(false);

        PanelTitulo.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MENU");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PanelBody.setBackground(new java.awt.Color(224, 224, 224));

        etqTexto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        etqTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTexto.setText("Crud en JAVA consumiendo la API de PHP");

        ImgJavaAndPhp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgJavaAndPhp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JavaAndPhp.png"))); // NOI18N

        btnCrearUsuarios.setBackground(new java.awt.Color(110, 125, 191));
        btnCrearUsuarios.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnCrearUsuarios.setText("CREAR USUARIO");
        btnCrearUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCrearUsuarios.setFocusable(false);
        btnCrearUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuariosActionPerformed(evt);
            }
        });

        btnListarUsuarios.setBackground(new java.awt.Color(110, 125, 191));
        btnListarUsuarios.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnListarUsuarios.setText("CONSULTAR USUARIOS");
        btnListarUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnListarUsuarios.setFocusable(false);
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        btnModificarUsuarios.setBackground(new java.awt.Color(255, 114, 0));
        btnModificarUsuarios.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnModificarUsuarios.setText("MODIFICAR USUARIOS");
        btnModificarUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnModificarUsuarios.setFocusable(false);
        btnModificarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuariosActionPerformed(evt);
            }
        });

        btnEliminarUsuarios.setBackground(new java.awt.Color(255, 114, 0));
        btnEliminarUsuarios.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnEliminarUsuarios.setText("ELIMINAR USUARIOS");
        btnEliminarUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnEliminarUsuarios.setFocusable(false);
        btnEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImgJavaAndPhp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etqTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnEliminarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgJavaAndPhp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqTexto)
                .addGap(47, 47, 47)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        PanelFooter.setBackground(new java.awt.Color(0, 0, 0));

        etqDeveloper.setBackground(new java.awt.Color(255, 255, 255));
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
                .addComponent(etqDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFooterLayout.setVerticalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqDeveloper, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        setVisible(false);
        ListaPersonas ventana = new ListaPersonas(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    private void btnCrearUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuariosActionPerformed
        setVisible(false);
        RegistrarPersona ventana = new RegistrarPersona(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuariosActionPerformed

    private void btnModificarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuariosActionPerformed
        setVisible(false);
        ModificarPersona ventana = new ModificarPersona(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarUsuariosActionPerformed

    private void btnEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuariosActionPerformed
        setVisible(false);
        EliminarPersona ventana = new EliminarPersona(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarUsuariosActionPerformed


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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public void initAlternComponents(){
        System.out.println("Iniciando el programa");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/JavaAndPhp.png") ) );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgJavaAndPhp;
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton btnCrearUsuarios;
    private javax.swing.JButton btnEliminarUsuarios;
    private javax.swing.JButton btnListarUsuarios;
    private javax.swing.JButton btnModificarUsuarios;
    private javax.swing.JLabel etqDeveloper;
    private javax.swing.JLabel etqTexto;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
