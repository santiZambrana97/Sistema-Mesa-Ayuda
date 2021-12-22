
package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOVerRenglon;

public class PrevisualizarRenglon extends javax.swing.JFrame {
    ControladorConfiguracionTipoCaso control = new ControladorConfiguracionTipoCaso();
    
    public PrevisualizarRenglon(int nroConfigCaso, int ordenTCTISelec) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Previsualizar Detalle Configuración");
        DTOVerRenglon dtorenglon = control.verDatosRenglon(nroConfigCaso, ordenTCTISelec);
        iniciarFormulario(dtorenglon);
        
    }

    private void iniciarFormulario(DTOVerRenglon dtorenglon) {
        labelNroConfig.setText(Integer.toString(dtorenglon.getNroConfig()));
        verCodOrden.setText(Integer.toString(dtorenglon.getOrdenTCTI()));
        verMinMax.setText(String.valueOf( dtorenglon.getMinutosMAXReso()));
        verCodTI.setText(Integer.toString(dtorenglon.getCodTI()));
        verNombreTI.setText(dtorenglon.getNombreTI());
        
    }
    
    
    private PrevisualizarRenglon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nroConfigTipoCasoLabel = new javax.swing.JPanel();
        verCodTI = new javax.swing.JTextField();
        labeldescver = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        labelcodver = new javax.swing.JLabel();
        verCodOrden = new javax.swing.JTextField();
        labelnombver = new javax.swing.JLabel();
        verMinMax = new javax.swing.JTextField();
        labelFechaFinver = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNroConfig = new javax.swing.JLabel();
        verNombreTI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nroConfigTipoCasoLabel.setBackground(new java.awt.Color(204, 204, 204));

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

        labeldescver.setBackground(new java.awt.Color(0, 0, 0));
        labeldescver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labeldescver.setForeground(new java.awt.Color(0, 0, 0));
        labeldescver.setText("Cod. Tipo Instancia:");

        botonContinuar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(0, 0, 0));
        botonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonContinuar.setMnemonic('v');
        botonContinuar.setText("Volver");
        botonContinuar.setBorder(null);
        botonContinuar.setContentAreaFilled(false);
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContinuar.setPreferredSize(new java.awt.Dimension(120, 36));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojonegro.png"))); // NOI18N
        labelTituloMostrar.setText("DATOS DE DETALLE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelTituloMostrar)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(labelTituloMostrar)
                .addGap(33, 33, 33))
        );

        labelcodver.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver.setForeground(new java.awt.Color(0, 0, 0));
        labelcodver.setText("Orden TipoCasoTipoInstancia");

        verCodOrden.setEditable(false);
        verCodOrden.setBackground(new java.awt.Color(153, 153, 153));
        verCodOrden.setBorder(null);
        verCodOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCodOrdenActionPerformed(evt);
            }
        });
        verCodOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodOrdenKeyTyped(evt);
            }
        });

        labelnombver.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver.setForeground(new java.awt.Color(0, 0, 0));
        labelnombver.setText("Minutos Máxima Resolución:");

        verMinMax.setEditable(false);
        verMinMax.setBackground(new java.awt.Color(153, 153, 153));
        verMinMax.setBorder(null);
        verMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMinMaxActionPerformed(evt);
            }
        });
        verMinMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verMinMaxKeyTyped(evt);
            }
        });

        labelFechaFinver.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setText("Nombre Tipo Instancia :");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Num Config Tipo Caso:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        labelNroConfig.setText("jLabel3");

        verNombreTI.setEditable(false);
        verNombreTI.setBackground(new java.awt.Color(153, 153, 153));
        verNombreTI.setBorder(null);
        verNombreTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verNombreTIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nroConfigTipoCasoLabelLayout = new javax.swing.GroupLayout(nroConfigTipoCasoLabel);
        nroConfigTipoCasoLabel.setLayout(nroConfigTipoCasoLabelLayout);
        nroConfigTipoCasoLabelLayout.setHorizontalGroup(
            nroConfigTipoCasoLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nroConfigTipoCasoLabelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(nroConfigTipoCasoLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(nroConfigTipoCasoLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(verNombreTI, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, nroConfigTipoCasoLabelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelNroConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))
                        .addComponent(verCodTI, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addComponent(verMinMax, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addComponent(labelcodver, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(verCodOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addComponent(labeldescver, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelFechaFinver, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelnombver, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(27, 27, 27))
        );
        nroConfigTipoCasoLabelLayout.setVerticalGroup(
            nroConfigTipoCasoLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nroConfigTipoCasoLabelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(nroConfigTipoCasoLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(labelNroConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(labelcodver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verCodOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelnombver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verMinMax, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labeldescver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verCodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelFechaFinver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verNombreTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nroConfigTipoCasoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nroConfigTipoCasoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verMinMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verMinMaxKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        /*   if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_verMinMaxKeyTyped

    private void verMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMinMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verMinMaxActionPerformed

    private void verCodOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodOrdenKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        /* if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_verCodOrdenKeyTyped

    private void verCodOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodOrdenActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        TrabajarRenglones trabajarRenglos = new TrabajarRenglones(Integer.parseInt(labelNroConfig.getText()));
        trabajarRenglos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void verCodTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodTIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodTIKeyTyped

    private void verCodTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodTIActionPerformed

    private void verNombreTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verNombreTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verNombreTIActionPerformed

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
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrevisualizarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrevisualizarRenglon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFechaFinver;
    private javax.swing.JLabel labelNroConfig;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JLabel labelcodver;
    private javax.swing.JLabel labeldescver;
    private javax.swing.JLabel labelnombver;
    private javax.swing.JPanel nroConfigTipoCasoLabel;
    private javax.swing.JTextField verCodOrden;
    private javax.swing.JTextField verCodTI;
    private javax.swing.JTextField verMinMax;
    private javax.swing.JTextField verNombreTI;
    // End of variables declaration//GEN-END:variables

    
}
