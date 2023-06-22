package Principal;

import ModuloUsuarios.CrearUsuario;
import ModuloUsuarios.ListarUsuarios;
import ModuloUsuarios.EliminarUsuario;
import ModuloUsuarios.ModificarUsuario;

import ModuloVendedores.CrearVendedor;
import ModuloVendedores.ListarVendedores;
import ModuloVendedores.EliminarVendedor;
import ModuloVendedores.ModificarVendedor;

import ModuloProductos.CrearProducto;

import Clases.Producto;
import Clases.Persona;


import javax.swing.*;

public class Menu extends JFrame {
    
    public Persona listaClientes [];
    public Persona listaVendedores [];
    public Producto listaProductos [];
    public int indexProducto;
    public int indexClientes;
    public int indexVendedores;
    
    public Menu() {
        this.listaClientes = new Persona [100];
        this.listaVendedores = new Persona [100];
        this.indexClientes = 0;
        this.indexVendedores = 0;
        this.listaProductos = new Producto [100];
        this.indexProducto = 0;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorMenu = new javax.swing.JPanel();
        etqMenuTitle = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JPanel();
        contenedorClientes = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();
        etq_Clientes = new javax.swing.JLabel();
        contenedorVendedores = new javax.swing.JPanel();
        btnCrearVendedor = new javax.swing.JButton();
        btnModificarVendedor = new javax.swing.JButton();
        btnEliminarVendedor = new javax.swing.JButton();
        btnListarVendedores = new javax.swing.JButton();
        etq_Vendedores = new javax.swing.JLabel();
        contenedorProductos = new javax.swing.JPanel();
        btnCrearProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnListarProductos = new javax.swing.JButton();
        etq_Productos = new javax.swing.JLabel();
        contenedorFooter = new javax.swing.JPanel();
        Etq_MarcaRegistrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        setBackground(new java.awt.Color(255, 51, 51));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        contenedorMenu.setBackground(new java.awt.Color(0, 0, 0));

        etqMenuTitle.setBackground(new java.awt.Color(255, 255, 255));
        etqMenuTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqMenuTitle.setForeground(new java.awt.Color(255, 255, 255));
        etqMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenuTitle.setText("MENU FACTURADOR");

        javax.swing.GroupLayout contenedorMenuLayout = new javax.swing.GroupLayout(contenedorMenu);
        contenedorMenu.setLayout(contenedorMenuLayout);
        contenedorMenuLayout.setHorizontalGroup(
            contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMenuLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(etqMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorMenuLayout.setVerticalGroup(
            contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqMenuTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedorPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        contenedorClientes.setBackground(new java.awt.Color(255, 255, 255));
        contenedorClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCrearUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnCrearUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearUsuario.setText("Crear");
        btnCrearUsuario.setFocusable(false);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnModificarUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarUsuario.setText("Modificar");
        btnModificarUsuario.setFocusable(false);
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 0, 153));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.setFocusable(false);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuarios.setBackground(new java.awt.Color(0, 0, 153));
        btnListarUsuarios.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListarUsuarios.setText("Listar");
        btnListarUsuarios.setFocusable(false);
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorClientesLayout = new javax.swing.GroupLayout(contenedorClientes);
        contenedorClientes.setLayout(contenedorClientesLayout);
        contenedorClientesLayout.setHorizontalGroup(
            contenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorClientesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        contenedorClientesLayout.setVerticalGroup(
            contenedorClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etq_Clientes.setBackground(new java.awt.Color(0, 0, 0));
        etq_Clientes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etq_Clientes.setForeground(new java.awt.Color(0, 0, 0));
        etq_Clientes.setText("CLIENTES");
        etq_Clientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contenedorVendedores.setBackground(new java.awt.Color(255, 255, 255));
        contenedorVendedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCrearVendedor.setBackground(new java.awt.Color(255, 153, 0));
        btnCrearVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearVendedor.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearVendedor.setText("Crear");
        btnCrearVendedor.setFocusable(false);
        btnCrearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVendedorActionPerformed(evt);
            }
        });

        btnModificarVendedor.setBackground(new java.awt.Color(255, 153, 0));
        btnModificarVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarVendedor.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarVendedor.setText("Modificar");
        btnModificarVendedor.setFocusable(false);
        btnModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVendedorActionPerformed(evt);
            }
        });

        btnEliminarVendedor.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminarVendedor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarVendedor.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarVendedor.setText("Eliminar");
        btnEliminarVendedor.setFocusable(false);
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        btnListarVendedores.setBackground(new java.awt.Color(255, 153, 0));
        btnListarVendedores.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarVendedores.setForeground(new java.awt.Color(0, 0, 0));
        btnListarVendedores.setText("Listar");
        btnListarVendedores.setFocusable(false);
        btnListarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorVendedoresLayout = new javax.swing.GroupLayout(contenedorVendedores);
        contenedorVendedores.setLayout(contenedorVendedoresLayout);
        contenedorVendedoresLayout.setHorizontalGroup(
            contenedorVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorVendedoresLayout.createSequentialGroup()
                .addGroup(contenedorVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorVendedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorVendedoresLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(contenedorVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        contenedorVendedoresLayout.setVerticalGroup(
            contenedorVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorVendedoresLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        etq_Vendedores.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etq_Vendedores.setForeground(new java.awt.Color(0, 0, 0));
        etq_Vendedores.setText("VENDEDORES");
        etq_Vendedores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contenedorProductos.setBackground(new java.awt.Color(255, 255, 255));
        contenedorProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCrearProducto.setBackground(new java.awt.Color(153, 255, 0));
        btnCrearProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCrearProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearProducto.setText("Crear");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setBackground(new java.awt.Color(153, 255, 0));
        btnModificarProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarProducto.setText("Modificar");

        btnEliminarProducto.setBackground(new java.awt.Color(153, 255, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setText("Eliminar");

        btnListarProductos.setBackground(new java.awt.Color(153, 255, 0));
        btnListarProductos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnListarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnListarProductos.setText("Listar");

        javax.swing.GroupLayout contenedorProductosLayout = new javax.swing.GroupLayout(contenedorProductos);
        contenedorProductos.setLayout(contenedorProductosLayout);
        contenedorProductosLayout.setHorizontalGroup(
            contenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorProductosLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(contenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnCrearProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        contenedorProductosLayout.setVerticalGroup(
            contenedorProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorProductosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        etq_Productos.setBackground(new java.awt.Color(0, 0, 0));
        etq_Productos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        etq_Productos.setForeground(new java.awt.Color(0, 0, 0));
        etq_Productos.setText("PRODUCTOS");

        contenedorFooter.setBackground(new java.awt.Color(0, 0, 0));
        contenedorFooter.setForeground(new java.awt.Color(255, 255, 255));

        Etq_MarcaRegistrada.setBackground(new java.awt.Color(255, 255, 255));
        Etq_MarcaRegistrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Etq_MarcaRegistrada.setForeground(new java.awt.Color(255, 255, 255));
        Etq_MarcaRegistrada.setText("DERECHOS RESERVADOS / By CodeMasterSeb");
        Etq_MarcaRegistrada.setToolTipText("");

        javax.swing.GroupLayout contenedorFooterLayout = new javax.swing.GroupLayout(contenedorFooter);
        contenedorFooter.setLayout(contenedorFooterLayout);
        contenedorFooterLayout.setHorizontalGroup(
            contenedorFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Etq_MarcaRegistrada)
                .addContainerGap())
        );
        contenedorFooterLayout.setVerticalGroup(
            contenedorFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Etq_MarcaRegistrada)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contenedorClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_Vendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contenedorProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(contenedorFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_Vendedores)
                            .addComponent(etq_Productos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contenedorProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contenedorVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(etq_Clientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedorClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(contenedorFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        System.out.println("Lista Clientes: ");
        for (int i=0; i<this.listaClientes.length; i++) {
            if (this.listaClientes[i]!=null) {
                System.out.println(i+" => "+this.listaClientes[i].getCedula()+" - "+this.listaClientes[i].getNombres()+" "+this.listaClientes[i].getApellidos() );
            }
        }
        
        setVisible(false);
        ListarUsuarios ventana = new ListarUsuarios(this, this.listaClientes, this.indexClientes);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    
    
    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        setVisible(false);
        
        CrearUsuario ventana = new CrearUsuario(this, this.listaClientes, this.indexClientes);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    
    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        setVisible(false);
        
        ModificarUsuario ventana = new ModificarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnCrearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVendedorActionPerformed
        setVisible(false);
   
        CrearVendedor ventana = new CrearVendedor(this, this.listaVendedores, this.indexVendedores);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearVendedorActionPerformed

    private void btnModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVendedorActionPerformed
        setVisible(false);
        
        ModificarVendedor ventana = new ModificarVendedor(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarVendedorActionPerformed

    private void btnListarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendedoresActionPerformed
       System.out.println("Lista Vendedores: ");
        for (int i=0; i<this.listaVendedores.length; i++) {
            if (this.listaVendedores[i]!=null) {
                System.out.println(i+" => "+this.listaVendedores[i].getCedula()+" - "+this.listaVendedores[i].getNombres()+" "+this.listaVendedores[i].getApellidos() );
            }
        }
        
        setVisible(false);
        ListarVendedores ventana = new ListarVendedores(this, this.listaVendedores, this.indexVendedores);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListarVendedoresActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        setVisible(false);
        
        EliminarUsuario ventana = new EliminarUsuario(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed
        setVisible(false);
        
        EliminarVendedor ventana = new EliminarVendedor(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        setVisible(false);
     
        CrearProducto ventana = new CrearProducto(this, this.listaVendedores, this.indexVendedores);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    /*    */
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
    }
    
    public void alertCreacionUsuario(){
        Alert alerta = new Alert("CORRECTO", "Se ha creado un nuevo usuario.", "success");
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etq_MarcaRegistrada;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnCrearVendedor;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnEliminarVendedor;
    private javax.swing.JButton btnListarProductos;
    private javax.swing.JButton btnListarUsuarios;
    private javax.swing.JButton btnListarVendedores;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnModificarVendedor;
    private javax.swing.JPanel contenedorClientes;
    private javax.swing.JPanel contenedorFooter;
    private javax.swing.JPanel contenedorMenu;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel contenedorProductos;
    private javax.swing.JPanel contenedorVendedores;
    private javax.swing.JLabel etqMenuTitle;
    private javax.swing.JLabel etq_Clientes;
    private javax.swing.JLabel etq_Productos;
    private javax.swing.JLabel etq_Vendedores;
    // End of variables declaration//GEN-END:variables
}
