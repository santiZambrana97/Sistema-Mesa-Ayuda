/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMTipoCaso;

import Controller.ControladorABMTipoCaso;
import DTO.DTOsTipoCaso.DTOTipoCaso;
import Interfaces.ABMSector.AgregarSector;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import main.Menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leand
 */
public class ABMTipoCaso extends javax.swing.JFrame {

    DefaultTableModel tablaTipoCaso;
    ControladorABMTipoCaso controlador = new ControladorABMTipoCaso();
    DTOTipoCaso dtoTipoCaso = new DTOTipoCaso();

    public ABMTipoCaso() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ABM Tipo Caso");

        tablaTipoCaso("");
        tablaTipoCaso.fireTableDataChanged();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        botonModificarTipoCaso = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botonAddTipoCaso = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoCasos = new javax.swing.JTable();
        botonEliminarTipoCaso = new javax.swing.JButton();
        ErrorMensaje = new javax.swing.JLabel();
        botonMostrarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        jButton2.setMnemonic('v');
        jButton2.setText("Volver");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(120, 36));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botonModificarTipoCaso.setBackground(new java.awt.Color(204, 204, 204));
        botonModificarTipoCaso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonModificarTipoCaso.setForeground(new java.awt.Color(0, 0, 0));
        botonModificarTipoCaso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_edit_black_18dp.png"))); // NOI18N
        botonModificarTipoCaso.setMnemonic('m');
        botonModificarTipoCaso.setText("Modificar");
        botonModificarTipoCaso.setBorder(null);
        botonModificarTipoCaso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarTipoCasoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TIPO CASO");

        botonAddTipoCaso.setBackground(new java.awt.Color(119, 148, 166));
        botonAddTipoCaso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAddTipoCaso.setForeground(new java.awt.Color(0, 0, 0));
        botonAddTipoCaso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        botonAddTipoCaso.setMnemonic('a');
        botonAddTipoCaso.setText("Agregar");
        botonAddTipoCaso.setBorder(null);
        botonAddTipoCaso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAddTipoCaso.setPreferredSize(new java.awt.Dimension(130, 36));
        botonAddTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddTipoCasoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N
        jLabel6.setToolTipText("");

        filtro.setBackground(new java.awt.Color(255, 255, 255));
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(67, 67, 67)
                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAddTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAddTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tablaTipoCasos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaTipoCasos.setBackground(new java.awt.Color(255, 255, 255));
        tablaTipoCasos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaTipoCasos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod Tipo Caso", "Nombre Tipo Caso", "Fecha Fin Vigencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTipoCasos.setRowHeight(20);
        tablaTipoCasos.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tablaTipoCasos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaTipoCasos);

        botonEliminarTipoCaso.setBackground(new java.awt.Color(204, 204, 204));
        botonEliminarTipoCaso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonEliminarTipoCaso.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminarTipoCaso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_delete_black_18dp.png"))); // NOI18N
        botonEliminarTipoCaso.setMnemonic('b');
        botonEliminarTipoCaso.setText("Dar Baja");
        botonEliminarTipoCaso.setBorder(null);
        botonEliminarTipoCaso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarTipoCasoActionPerformed(evt);
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
        botonMostrarDatos.setToolTipText("Muestra datos");
        botonMostrarDatos.setBorder(null);
        botonMostrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMostrarDatos.setPreferredSize(new java.awt.Dimension(130, 36));
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEliminarTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarTipoCaso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonModificarTipoCaso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarTipoCaso)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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

    public void tablaTipoCaso(String cadenaFiltro) {
        List<DTOTipoCaso> lista = controlador.FiltradoMostrarDTO(cadenaFiltro);
        
        DTOTipoCaso[] ordenarTC = new DTOTipoCaso[lista.size()];
        ordenarTC = lista.toArray(ordenarTC);
        
        
        for (int i = 0; i < ordenarTC.length - 1; i++) {
            
            for (int j = 0; j < ordenarTC.length - 1; j++) { 
                if (ordenarTC[j].getCodTipoCaso() > ordenarTC[j + 1].getCodTipoCaso()) {
                   
                    DTOTipoCaso temp = ordenarTC[j + 1];
                    ordenarTC[j + 1] = ordenarTC[j];
                    ordenarTC[j] = temp;
                  
                }
            }
        }
        
        List prueba = null;
        tablaTipoCaso = new DefaultTableModel();
        tablaTipoCasos.setModel(tablaTipoCaso);
        tablaTipoCaso.addColumn("Cod.TipoCaso");
        tablaTipoCaso.addColumn("Nombre TipoCaso");
        tablaTipoCaso.addColumn("Fin Vigencia TipoCaso");

        tablaTipoCasos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tablaTipoCasos.getTableHeader().setBackground(new Color(172, 202, 221));
      
        tablaTipoCasos.getTableHeader().setReorderingAllowed(false);
 
        for(MouseListener listener : tablaTipoCasos.getTableHeader().getMouseListeners()){
        tablaTipoCasos.getTableHeader().removeMouseListener(listener);
        }
      
        for (int i = 0; i < ordenarTC.length; i++) {
            Vector ejemplo = new Vector();
            ejemplo.add(ordenarTC[i].getCodTipoCaso());
            ejemplo.add(ordenarTC[i].getNombreTipoCaso());
            ejemplo.add(ordenarTC[i].getFechaFinVigenciaTipoCaso());
            tablaTipoCaso.addRow(ejemplo);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Botón para volver a Menú principal
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonModificarTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarTipoCasoActionPerformed
//        Metodo de modificar tipocaso
        int numTabTipoCaso = tablaTipoCasos.getSelectedRow();
        if (numTabTipoCaso == -1) {
            ErrorMensaje.setForeground(Color.RED);
            ErrorMensaje.setText("No ha seleccionado ningún tipo caso para modificar");

        } else {
            for (int i = 0; i < tablaTipoCasos.getRowCount(); i++) {
                if (tablaTipoCasos.getValueAt(i, 2) != null) {
                    ErrorMensaje.setForeground(Color.RED);
                    ErrorMensaje.setText("El Tipo Caso ya está dado de baja, no se puede modificar");
                } else {
                    if (i == numTabTipoCaso) {
                        dtoTipoCaso.setCodTipoCaso((int) tablaTipoCasos.getValueAt(i, 0));
                        dtoTipoCaso.setNombreTipoCaso((String) tablaTipoCasos.getValueAt(i, 1));
                        ModificarTipoCaso modificarPantalla = new ModificarTipoCaso(dtoTipoCaso);
                        modificarPantalla.setVisible(true);
                        this.setVisible(false);
                    }
                }

            }
        }
    }//GEN-LAST:event_botonModificarTipoCasoActionPerformed

    private void botonAddTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddTipoCasoActionPerformed
        //Botón que llama al método para agregar un nuevo sector, derivandonos a su pantalla
        AgregarTipoCaso agregarTipoCaso = new AgregarTipoCaso();
        agregarTipoCaso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAddTipoCasoActionPerformed

    private void filtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroKeyTyped

    private void botonEliminarTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarTipoCasoActionPerformed
        //Eliminar un tipo caso
        int numTabTipoCaso = tablaTipoCasos.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        if (numTabTipoCaso == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningún tipo caso para dar de baja");
        } else {
            for (int i = 0; i < tablaTipoCasos.getRowCount(); i++) { //Recorremos la tabla
                if (numTabTipoCaso == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo 
                    if (tablaTipoCasos.getValueAt(i, 2) != null) {
                        ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
                        ErrorMensaje.setText("El Tipo Caso elegido ya está dado de baja");
                    } else {
                        dtoTipoCaso.setCodTipoCaso((int) tablaTipoCasos.getValueAt(i, 0));//el primero del parametro hace referencia a la fila y el segundo a la columna
                    
                        int j = JOptionPane.showConfirmDialog(this, ""
                                + "¿Está seguro que desea confirmar la baja? \n\n"
                                + "Cod TipoCaso: " + (int) tablaTipoCasos.getValueAt(i, 0) + "\n"
                                + "Nombre: " + tablaTipoCasos.getValueAt(i, 1) + "\n\n",
                                 "Dar de baja Tipo Caso", JOptionPane.YES_NO_OPTION);
                        if (j == 0) {
                            controlador.bajaTipoCaso(dtoTipoCaso);
                            JOptionPane.showMessageDialog(this, "Tipo Caso dado de baja");
                        }
                        tablaTipoCaso("");
                    }
                }
            }
        }
    }//GEN-LAST:event_botonEliminarTipoCasoActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    private void filtroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyPressed
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
//            tablaTipoCaso(filtro.getText());
//        }
    }//GEN-LAST:event_filtroKeyPressed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
//        Ver mas detalles del tipo caso
        int numTabTipoCaso = tablaTipoCasos.getSelectedRow();
        if (numTabTipoCaso == -1) {
            ErrorMensaje.setForeground(Color.RED);
            ErrorMensaje.setText("No ha seleccionado ningún tipo caso");
        } else {
            for (int i = 0; i < tablaTipoCasos.getRowCount(); i++) {
                if (i == numTabTipoCaso) {
                    dtoTipoCaso.setCodTipoCaso((int) tablaTipoCasos.getValueAt(i, 0));
                    dtoTipoCaso.setNombreTipoCaso((String) tablaTipoCasos.getValueAt(i, 1));
                    dtoTipoCaso.setFechaFinVigenciaTipoCaso((java.util.Date) tablaTipoCasos.getValueAt(i, 2));

                    VerDatosTipoCasos verDatos = new VerDatosTipoCasos(dtoTipoCaso);
                    verDatos.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyReleased

        tablaTipoCaso(filtro.getText());
    }//GEN-LAST:event_filtroKeyReleased

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
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMTipoCaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMensaje;
    private javax.swing.JButton botonAddTipoCaso;
    private javax.swing.JButton botonEliminarTipoCaso;
    private javax.swing.JButton botonModificarTipoCaso;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JTextField filtro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTipoCasos;
    // End of variables declaration//GEN-END:variables
}
