package Interfaces.ABMSector;

import main.Menu;
import Controller.ControladorABMSector;
import DTO.DTOsSector.DTOSector;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.sql.Date;

import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ABMSector extends javax.swing.JFrame {

    DefaultTableModel tablaSectores;
    ControladorABMSector controlador = new ControladorABMSector();
    DTOSector dtosector = new DTOSector();
    
    public ABMSector() {
      
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ABM Sector");
        tablaSectores("");
        tablaSectores.fireTableDataChanged();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Filtro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ErrorMensaje = new javax.swing.JLabel();
        botonMostrarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSector = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(119, 148, 166));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SECTOR");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N
        jLabel2.setToolTipText("");

        Filtro.setBackground(new java.awt.Color(255, 255, 255));
        Filtro.setBorder(null);
        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });
        Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FiltroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltroKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(119, 148, 166));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jButton1.setMnemonic('a');
        jButton1.setText("Agregar");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(117, 117, 117)
                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        jButton2.setMnemonic('v');
        jButton2.setText("Volver");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(false);
        jButton2.setPreferredSize(new java.awt.Dimension(120, 36));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_edit_black_18dp.png"))); // NOI18N
        jButton3.setMnemonic('m');
        jButton3.setText("Modificar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_delete_black_18dp.png"))); // NOI18N
        jButton4.setMnemonic('b');
        jButton4.setText("Dar Baja");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ErrorMensaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ErrorMensaje.setToolTipText("");

        botonMostrarDatos.setBackground(new java.awt.Color(204, 204, 204));
        botonMostrarDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonMostrarDatos.setForeground(new java.awt.Color(0, 0, 0));
        botonMostrarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_visibility_black_18dp.png"))); // NOI18N
        botonMostrarDatos.setMnemonic('d');
        botonMostrarDatos.setText("Mostrar Datos");
        botonMostrarDatos.setToolTipText("");
        botonMostrarDatos.setBorder(null);
        botonMostrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        tablaSector = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaSector.setAutoCreateRowSorter(true);
        tablaSector.setBackground(new java.awt.Color(255, 255, 255));
        tablaSector.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaSector.setForeground(new java.awt.Color(0, 0, 0));
        tablaSector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "cod.Sector", "Nombre Sector", "Descripción", "Fecha Fin Vigencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSector.setFocusable(false);
        tablaSector.setGridColor(new java.awt.Color(0, 0, 0));
        tablaSector.setRowHeight(20);
        tablaSector.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tablaSector.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaSector);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(botonMostrarDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonMostrarDatos)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void tablaSectores(String cadenaFiltro){
        List<DTOSector> lista = controlador.FiltradoMostrarDTO(cadenaFiltro);
        
        DTOSector[] ordenarS = new DTOSector[lista.size()];
        ordenarS = lista.toArray(ordenarS);
        
        
        for (int i = 0; i < ordenarS.length - 1; i++) {
            
            for (int j = 0; j < ordenarS.length - 1; j++) { 
                if (ordenarS[j].getCodSector() > ordenarS[j + 1].getCodSector()) {
                   
                    DTOSector temp = ordenarS[j + 1];
                    ordenarS[j + 1] = ordenarS[j];
                    ordenarS[j] = temp;
                  
                }
            }
        }
        
        
        List prueba = null; 
        tablaSectores = new DefaultTableModel();
        tablaSector.setModel(tablaSectores);
        tablaSectores.addColumn("Cod.Sector");
        tablaSectores.addColumn("Nombre Sector");
        tablaSectores.addColumn("Descripción");
        tablaSectores.addColumn("Fin Vigencia Sector");
        
        tablaSector.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tablaSector.getTableHeader().setBackground(new Color(172, 202, 221));
        tablaSector.getTableHeader().setReorderingAllowed(false);
 
        for(MouseListener listener : tablaSector.getTableHeader().getMouseListeners()){
        tablaSector.getTableHeader().removeMouseListener(listener);
        }
     
        for (int i = 0; i < ordenarS.length; i++) {
            Vector ejemplo = new Vector();
            ejemplo.add(ordenarS[i].getCodSector());
            ejemplo.add(ordenarS[i].getNombreSector());
            ejemplo.add(ordenarS[i].getDescripcionSector());
            ejemplo.add(ordenarS[i].getFechaFinVigenciaSector());
            tablaSectores.addRow( ejemplo);   
        }
          
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botón que llama al método para agregar un nuevo sector, derivandonos a su pantalla
        AgregarSector agregSector = new AgregarSector();
        agregSector.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Botón para volver a Menú principal
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Método para modificar Sector


       int numTabSec = tablaSector.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
       if(numTabSec == -1){
           ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           ErrorMensaje.setText("No ha seleccionado ningún sector para modificar");
       } else{
            for(int i=0; i<tablaSector.getRowCount(); i++){ //Recorremos la tabla
                if(tablaSector.getValueAt(i, 3) != null){
                    ErrorMensaje.setForeground(Color.RED);
                    ErrorMensaje.setText("El sector está dado de baja, no se puede modificar");
                }else{
                if(numTabSec==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo

                    dtosector.setCodSector((int) tablaSectores.getValueAt(i, 0));
                    dtosector.setNombreSector((String)tablaSectores.getValueAt(i, 1));
                    dtosector.setDescripcionSector((String) tablaSectores.getValueAt(i, 2));

                    ModificarSector mod = new ModificarSector(dtosector);
                    mod.setVisible(true);
                    this.setVisible(false);
                }


        }
      }
     }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void FiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyTyped
        
    }//GEN-LAST:event_FiltroKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Metodo para dar de baja un sector
        int numTabSec = tablaSector.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        if(numTabSec == -1){               
           ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           ErrorMensaje.setText("No ha seleccionado ningún sector para dar de baja");
       
       }else{
        for(int i=0; i<tablaSector.getRowCount(); i++){ //Recorremos la tabla
            if(numTabSec==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo 
                if(tablaSector.getValueAt(i, 3) != null){
                    ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
                    ErrorMensaje.setText("El sector elegido ya está dado de baja");
                }else{
                    dtosector.setCodSector((int) tablaSector.getValueAt(i, 0));//el primero del parametro hace referencia a la fila y el segundo a la columna
                        int j = JOptionPane.showConfirmDialog(this, ""
                                + "¿Está seguro que desea confirmar la baja? \n\n"
                                + "Cod Sector: " + (int) tablaSector.getValueAt(i, 0) + "\n"
                                + "Nombre: " + tablaSector.getValueAt(i, 1) + "\n"
                                + "Descripción: " + tablaSector.getValueAt(i, 2) + "\n\n"
                                , "Dar de baja Sector", JOptionPane.YES_NO_OPTION);
                        if (j == 0) {
                            controlador.bajaSector(dtosector);
                            JOptionPane.showMessageDialog(this, "Sector dado de baja");
                        }
                        tablaSectores("");
               }
            }
        }   
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void FiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        tablaSectores(Filtro.getText());
    }
    }//GEN-LAST:event_FiltroKeyPressed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
        //Método Mostrar datos de Sector
         int numTabSec = tablaSector.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
       if(numTabSec == -1){
           ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
           ErrorMensaje.setText("No ha seleccionado ningún sector para mostrar");
       } else{
            for(int i=0; i<tablaSector.getRowCount(); i++){ //Recorremos la tabla
                
                if(numTabSec==i){ //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo

                    dtosector.setCodSector((int) tablaSectores.getValueAt(i, 0));
                    dtosector.setNombreSector((String)tablaSectores.getValueAt(i, 1));
                    dtosector.setDescripcionSector((String) tablaSectores.getValueAt(i, 2));
                    dtosector.setFechaFinVigenciaSector((java.util.Date)tablaSectores.getValueAt(i, 3));
                                       
                    VerDatosSector mostrar = new VerDatosSector(dtosector);
                    mostrar.setVisible(true);
                    
                    
                }

            }
        }
        
    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyReleased
        // TODO add your handling code here:
        tablaSectores(Filtro.getText());
    }//GEN-LAST:event_FiltroKeyReleased

    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroActionPerformed

    /**
     * @param args the command line arguments
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ABMSector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMSector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMSector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMSector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMSector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMensaje;
    private javax.swing.JTextField Filtro;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSector;
    // End of variables declaration//GEN-END:variables
}
