package Interfaces.ABMTipoInstancia;

import Controller.ControladorABMTipoInstancia;
import DTO.DTOsTipoInstancia.DTOVisualizarDatosTI;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class VerDatosTipoInstancia extends javax.swing.JFrame {

    
    ControladorABMTipoInstancia control = new ControladorABMTipoInstancia();
    
    
    public VerDatosTipoInstancia(int codTIMostrar) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Datos Tipo Instancia");
        
        DTOVisualizarDatosTI dtoVisu = control.visualizarDatosTipoInstancia(codTIMostrar);
        inicializarDatosMostrar(dtoVisu);
        
    }

    private VerDatosTipoInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DTOVisualizarDatosTI inicializarDatosMostrar(DTOVisualizarDatosTI dtoVisu){
        //Corresponde a Tipo Instancia
        verCodTI.setForeground(Color.black);
        verCodTI.setText(Integer.toString(dtoVisu.getCodTipoInstancia()));
        verNombTI.setForeground(Color.black);
        verNombTI.setText(dtoVisu.getNombreTipoInstancia());  
        verFechaFinTI.setForeground(Color.black);
        if(dtoVisu.getFechaHoraFinVigenciaTipoInstancia()== null){
            verFechaFinTI.setText("Vigente");
        }else{
            DateFormat df = new SimpleDateFormat();
            Date fecha = dtoVisu.getFechaHoraFinVigenciaTipoInstancia();
            String fechaString = df.format(fecha);            
            verFechaFinTI.setText(fechaString);
        }
        //Correspondiente a Sector
        verCodSec.setForeground(Color.black);
        verCodSec.setText(Integer.toString(dtoVisu.getCodSector()));
        verNombSec.setForeground(Color.black);
        verNombSec.setText(dtoVisu.getNombreSector());    
        verFechaFinSec.setForeground(Color.black);
        if(dtoVisu.getFechaHoraFinVigenciaSector()== null){
            verFechaFinSec.setText("Vigente");
        }else{
            DateFormat df = new SimpleDateFormat();
            Date fecha = dtoVisu.getFechaHoraFinVigenciaSector();
            String fechaString = df.format(fecha);
            verFechaFinSec.setText(fechaString);
        }
        //Correspondiente a Tipo Tarea
        verCodTT.setForeground(Color.black);
        verCodTT.setText(Integer.toString(dtoVisu.getCodTipoTarea()));
        verNombTT.setForeground(Color.black);
        verNombTT.setText(dtoVisu.getNombreTipoTarea()); 
        verFechaFinTT.setForeground(Color.black);
        if(dtoVisu.getFechaHoraFinVigenciaTipoTarea()== null){
            verFechaFinTT.setText("Vigente");
        }else{
            DateFormat df = new SimpleDateFormat();
            Date fecha = dtoVisu.getFechaHoraFinVigenciaTipoTarea();
            String fechaString = df.format(fecha);
            verFechaFinTT.setText(fechaString);
        }
        return dtoVisu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelcodver3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        labelcodver = new javax.swing.JLabel();
        verCodTI = new javax.swing.JTextField();
        labelnombver = new javax.swing.JLabel();
        verNombTI = new javax.swing.JTextField();
        labelFechaFinver = new javax.swing.JLabel();
        verFechaFinTI = new javax.swing.JTextField();
        labelcodver1 = new javax.swing.JLabel();
        verCodTT = new javax.swing.JTextField();
        labelnombver1 = new javax.swing.JLabel();
        verNombTT = new javax.swing.JTextField();
        labelFechaFinver1 = new javax.swing.JLabel();
        verFechaFinTT = new javax.swing.JTextField();
        labelcodver2 = new javax.swing.JLabel();
        verCodSec = new javax.swing.JTextField();
        labelnombver2 = new javax.swing.JLabel();
        verNombSec = new javax.swing.JTextField();
        labelFechaFinver2 = new javax.swing.JLabel();
        verFechaFinSec = new javax.swing.JTextField();
        botonContinuar = new javax.swing.JButton();

        labelcodver3.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver3.setText("Cod. Sector:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_visibility_black_18dp.png"))); // NOI18N
        labelTituloMostrar.setText("DATOS TIPO INSTANCIA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(labelTituloMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(labelTituloMostrar)
                .addGap(32, 32, 32))
        );

        labelcodver.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver.setText("Cod. Tipo Instancia:");

        verCodTI.setEditable(false);
        verCodTI.setBackground(new java.awt.Color(153, 153, 153));
        verCodTI.setBorder(null);
        verCodTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCodTIActionPerformed(evt);
            }
        });
        verCodTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodTIKeyTyped(evt);
            }
        });

        labelnombver.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver.setText("Nombre Tipo Instancia:");

        verNombTI.setEditable(false);
        verNombTI.setBackground(new java.awt.Color(153, 153, 153));
        verNombTI.setBorder(null);
        verNombTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombTIKeyTyped(evt);
            }
        });

        labelFechaFinver.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver.setText("Fecha Fin Vigencia :");

        verFechaFinTI.setEditable(false);
        verFechaFinTI.setBackground(new java.awt.Color(153, 153, 153));
        verFechaFinTI.setBorder(null);
        verFechaFinTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFechaFinTIKeyTyped(evt);
            }
        });

        labelcodver1.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver1.setText("Cod. Tipo Tarea:");

        verCodTT.setEditable(false);
        verCodTT.setBackground(new java.awt.Color(153, 153, 153));
        verCodTT.setBorder(null);
        verCodTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCodTTActionPerformed(evt);
            }
        });
        verCodTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodTTKeyTyped(evt);
            }
        });

        labelnombver1.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver1.setText("Nombre Tipo Tarea:");

        verNombTT.setEditable(false);
        verNombTT.setBackground(new java.awt.Color(153, 153, 153));
        verNombTT.setBorder(null);
        verNombTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombTTKeyTyped(evt);
            }
        });

        labelFechaFinver1.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver1.setText("Fecha Fin Vigencia :");

        verFechaFinTT.setEditable(false);
        verFechaFinTT.setBackground(new java.awt.Color(153, 153, 153));
        verFechaFinTT.setBorder(null);
        verFechaFinTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFechaFinTTKeyTyped(evt);
            }
        });

        labelcodver2.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver2.setText("Cod. Sector:");

        verCodSec.setEditable(false);
        verCodSec.setBackground(new java.awt.Color(153, 153, 153));
        verCodSec.setBorder(null);
        verCodSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCodSecActionPerformed(evt);
            }
        });
        verCodSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodSecKeyTyped(evt);
            }
        });

        labelnombver2.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver2.setText("Nombre Sector:");

        verNombSec.setEditable(false);
        verNombSec.setBackground(new java.awt.Color(153, 153, 153));
        verNombSec.setBorder(null);
        verNombSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombSecKeyTyped(evt);
            }
        });

        labelFechaFinver2.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver2.setText("Fecha Fin Vigencia :");

        verFechaFinSec.setEditable(false);
        verFechaFinSec.setBackground(new java.awt.Color(153, 153, 153));
        verFechaFinSec.setBorder(null);
        verFechaFinSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFechaFinSecKeyTyped(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(204, 204, 204));
        botonContinuar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonContinuar.setMnemonic('v');
        botonContinuar.setText("Volver");
        botonContinuar.setBorder(null);
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonContinuar.setPreferredSize(new java.awt.Dimension(120, 36));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelnombver1)
                            .addComponent(verNombTT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaFinver1)
                            .addComponent(verFechaFinTT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verCodTT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelcodver1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(verCodTI, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                                .addComponent(labelcodver)
                                .addComponent(labelnombver)
                                .addComponent(labelFechaFinver)
                                .addComponent(verFechaFinTI)
                                .addComponent(labelcodver2)
                                .addComponent(labelnombver2)
                                .addComponent(labelFechaFinver2)
                                .addComponent(verNombTI)
                                .addComponent(verNombSec, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(verCodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(verFechaFinSec, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelcodver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verCodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelnombver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verNombTI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFechaFinver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verFechaFinTI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcodver2)
                    .addComponent(labelcodver1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verCodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verCodTT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombver2)
                    .addComponent(labelnombver1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verNombSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verNombTT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaFinver2)
                    .addComponent(labelFechaFinver1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verFechaFinSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verFechaFinTT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        //Botón para volver al menú de sector
        ABMTipoInstancia abm = new ABMTipoInstancia();
        abm.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void verCodTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodTIActionPerformed

    private void verCodTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verCodTIKeyTyped

    private void verNombTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACK_SPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verNombTIKeyTyped

    private void verFechaFinTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFechaFinTIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFechaFinTIKeyTyped

    private void verCodTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodTTActionPerformed

    private void verCodTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodTTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodTTKeyTyped

    private void verNombTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombTTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verNombTTKeyTyped

    private void verFechaFinTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFechaFinTTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFechaFinTTKeyTyped

    private void verCodSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodSecActionPerformed

    private void verCodSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodSecKeyTyped

    private void verNombSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verNombSecKeyTyped

    private void verFechaFinSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFechaFinSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFechaFinSecKeyTyped

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
            java.util.logging.Logger.getLogger(VerDatosTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDatosTipoInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFechaFinver;
    private javax.swing.JLabel labelFechaFinver1;
    private javax.swing.JLabel labelFechaFinver2;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JLabel labelcodver;
    private javax.swing.JLabel labelcodver1;
    private javax.swing.JLabel labelcodver2;
    private javax.swing.JLabel labelcodver3;
    private javax.swing.JLabel labelnombver;
    private javax.swing.JLabel labelnombver1;
    private javax.swing.JLabel labelnombver2;
    private javax.swing.JTextField verCodSec;
    private javax.swing.JTextField verCodTI;
    private javax.swing.JTextField verCodTT;
    private javax.swing.JTextField verFechaFinSec;
    private javax.swing.JTextField verFechaFinTI;
    private javax.swing.JTextField verFechaFinTT;
    private javax.swing.JTextField verNombSec;
    private javax.swing.JTextField verNombTI;
    private javax.swing.JTextField verNombTT;
    // End of variables declaration//GEN-END:variables

}
