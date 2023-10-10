
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListaPersonas extends javax.swing.JFrame {

    ConsumoAPI ejemplo = new ConsumoAPI();
    Gson gson = new Gson();
    Menu ventanaMenu;
   
    public ListaPersonas(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        
        initComponents();
        initAlternComponents();
        cargarDatos();
        
    }

    
    private void cargarDatos() {
        String select = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php"); 
        JsonObject jsonObject = JsonParser.parseString(select).getAsJsonObject();
        JsonArray registros = jsonObject.getAsJsonArray("registros");
        List<Persona> personas = new ArrayList<>();
        for (JsonElement elemento : registros) {
            JsonObject registro = elemento.getAsJsonObject();

            String cedula = registro.get("cedula").getAsString();
            String nombres = registro.get("nombres").getAsString();
            String apellidos = registro.get("apellidos").getAsString();
            String telefono = registro.get("telefono").getAsString();;
            String direccion = registro.get("direccion").getAsString();
            String email = registro.get("email").getAsString();

            // Crear un objeto Persona y agregarlo a la lista
            Persona persona = new Persona(cedula, nombres, apellidos, telefono, direccion, email);
            personas.add(persona);
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabladatos.getModel();

        for (Persona persona : personas) {
            
            Object[] fila = new Object[6]; // Ajusta el tamaño según la cantidad de columnas
            fila[0] = persona.getCedula();
            fila[1] = persona.getNombres();
            fila[2] = persona.getApellidos();
            fila[3] = persona.getTelefono();
            fila[4] = persona.getDireccion();
            fila[5] = persona.getEmail();
            modelo.addRow(fila);
        }
    }
    
    
    public void initAlternComponents(){
        System.out.println("Abriendo ventana (Listar Personas)");
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("img/JavaAndPhp.png") ) );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        imgUsers = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PanelFooter = new javax.swing.JPanel();
        DeveloperName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Listar Usuarios - Java&Php");
        setResizable(false);

        PanelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        PanelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("LISTA DE PERSONAS");
        etqTitulo.setToolTipText("");

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
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.setBackground(new java.awt.Color(224, 224, 224));

        tabladatos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "TELEFONO", "DIRECCION", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabladatos.setToolTipText("");
        tabladatos.setRowHeight(40);
        jScrollPane1.setViewportView(tabladatos);

        imgUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImgListUsers.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(110, 125, 191));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(imgUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PanelFooter.setBackground(new java.awt.Color(0, 0, 0));
        PanelFooter.setForeground(new java.awt.Color(255, 255, 255));

        DeveloperName.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 14)); // NOI18N
        DeveloperName.setForeground(new java.awt.Color(255, 255, 255));
        DeveloperName.setText("By CodeMasterSeb");

        javax.swing.GroupLayout PanelFooterLayout = new javax.swing.GroupLayout(PanelFooter);
        PanelFooter.setLayout(PanelFooterLayout);
        PanelFooterLayout.setHorizontalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeveloperName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelFooterLayout.setVerticalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeveloperName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        this.ventanaMenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

  
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeveloperName;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel imgUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
