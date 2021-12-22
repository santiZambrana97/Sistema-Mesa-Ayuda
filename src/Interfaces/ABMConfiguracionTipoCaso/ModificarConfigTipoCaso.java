
package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOErroresMensajes;
import DTO.DTOsConfiguración.DTOLupitaTipoCaso;
import DTO.DTOsConfiguración.DTOModificarConf;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;


public class ModificarConfigTipoCaso extends javax.swing.JFrame {

    
    ControladorConfiguracionTipoCaso control = new ControladorConfiguracionTipoCaso();
    
    public ModificarConfigTipoCaso(int codSeleccionado) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar Configuración Tipo Caso");
        DTOModificarConf dtoModificar = control.buscarPorNumConfig(codSeleccionado);
        inicializarDatos(dtoModificar);
        inputNumConfMod.setForeground(Color.black);
        outNombreTipoCaso.setForeground(Color.black);
        inputCodTipoCasoModif.selectAll();
        inputCodTipoCasoModif.requestFocus();
    }

    private ModificarConfigTipoCaso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void inicializarDatos (DTOModificarConf dtoModificar){
        
        inputNumConfMod.setText(Integer.toString(dtoModificar.getNroConfiguracion()));
        inputCodTipoCasoModif.setText(Integer.toString(dtoModificar.getCodTipoCaso()));
        outNombreTipoCaso.setForeground(Color.GRAY);
        inputNumConfMod.setForeground(Color.GRAY);
        outNombreTipoCaso.setText(dtoModificar.getNombreTipoCaso());
        inputFechaDesdeModif.setDate(dtoModificar.getFechaDesde());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputCodTipoCasoModif = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        outNombreTipoCaso = new javax.swing.JTextField();
        volverABMAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        inputNumConfMod = new javax.swing.JTextField();
        confirmarModificar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputFechaDesdeModif = new com.toedter.calendar.JDateChooser();
        MensajeError = new javax.swing.JTextField();
        botonbuscarTipocaso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Tipo Caso:");

        inputCodTipoCasoModif.setBackground(new java.awt.Color(255, 255, 255));
        inputCodTipoCasoModif.setBorder(null);
        inputCodTipoCasoModif.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCodTipoCasoModifFocusLost(evt);
            }
        });
        inputCodTipoCasoModif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCodTipoCasoModifKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cod. Tipo Caso");

        outNombreTipoCaso.setEditable(false);
        outNombreTipoCaso.setBackground(new java.awt.Color(153, 153, 153));
        outNombreTipoCaso.setBorder(null);
        outNombreTipoCaso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                outNombreTipoCasoFocusLost(evt);
            }
        });
        outNombreTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outNombreTipoCasoActionPerformed(evt);
            }
        });
        outNombreTipoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outNombreTipoCasoKeyTyped(evt);
            }
        });

        volverABMAgregar.setBackground(new java.awt.Color(204, 204, 204));
        volverABMAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABMAgregar.setForeground(new java.awt.Color(0, 0, 0));
        volverABMAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABMAgregar.setMnemonic('v');
        volverABMAgregar.setText("Volver");
        volverABMAgregar.setBorder(null);
        volverABMAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverABMAgregar.setPreferredSize(new java.awt.Dimension(120, 36));
        volverABMAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMAgregarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha Desde:");

        inputNumConfMod.setEditable(false);
        inputNumConfMod.setBackground(new java.awt.Color(153, 153, 153));
        inputNumConfMod.setBorder(null);
        inputNumConfMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumConfModActionPerformed(evt);
            }
        });
        inputNumConfMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNumConfModKeyTyped(evt);
            }
        });

        confirmarModificar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarModificar.setForeground(new java.awt.Color(0, 0, 0));
        confirmarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarModificar.setMnemonic('c');
        confirmarModificar.setText("Modificar");
        confirmarModificar.setBorder(null);
        confirmarModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarModificar.setPreferredSize(new java.awt.Dimension(120, 36));
        confirmarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarModificarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(119, 148, 166));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jLabel17.setText("MODIFICAR CONFIGURACIÓN TIPO CASO");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Núm. Configuración Tipo Caso:");

        MensajeError.setEditable(false);
        MensajeError.setBackground(new java.awt.Color(204, 204, 204));
        MensajeError.setBorder(null);

        botonbuscarTipocaso.setBackground(new java.awt.Color(119, 148, 166));
        botonbuscarTipocaso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N
        botonbuscarTipocaso.setBorder(null);
        botonbuscarTipocaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarTipocasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(confirmarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(jLabel1)
                        .addComponent(outNombreTipoCaso)
                        .addComponent(jLabel3)
                        .addComponent(inputNumConfMod)
                        .addComponent(inputFechaDesdeModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(inputCodTipoCasoModif, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botonbuscarTipocaso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(139, 139, 139))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNumConfMod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputCodTipoCasoModif, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscarTipocaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outNombreTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFechaDesdeModif, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCodTipoCasoModifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodTipoCasoModifKeyTyped

     //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo solo admite números", "Mensaje de Error Código", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_inputCodTipoCasoModifKeyTyped

    private void outNombreTipoCasoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outNombreTipoCasoFocusLost
//        if (!outNombreTipoCaso.getText().isEmpty()) {
//            MostrarSectorFil(outNombreTipoCaso.getText());
//        }else{JOptionPane.showMessageDialog(this, "Por favor ingrese el código sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_outNombreTipoCasoFocusLost

    private void outNombreTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outNombreTipoCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombreTipoCasoActionPerformed

    private void outNombreTipoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outNombreTipoCasoKeyTyped
        //Declaramos una variable y asignamos un evento
    }//GEN-LAST:event_outNombreTipoCasoKeyTyped

    private void volverABMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregarActionPerformed
        //Botón para volver al menú de TipoInstancia
        ABMConfiguracionTipoCaso abmConfig = new ABMConfiguracionTipoCaso();
        abmConfig.setVisible(true);
        abmConfig.tablaConfiguracion("","");
        this.setVisible(false);
    }//GEN-LAST:event_volverABMAgregarActionPerformed

    private void inputNumConfModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumConfModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumConfModActionPerformed

    private void inputNumConfModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNumConfModKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumConfModKeyTyped

    private void confirmarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarModificarActionPerformed
        //Método para modificar una Configuracion tipo caso
        DTOModificarConf dtoModificar = new DTOModificarConf();
        DTOErroresMensajes dtoError = new DTOErroresMensajes();
        if(inputFechaDesdeModif.getDate() != null){
            if(!inputCodTipoCasoModif.getText().isEmpty() ){
                if(!outNombreTipoCaso.getText().isEmpty() ){
                    if(inputFechaDesdeModif.getDate() != null){
                    do{
                        dtoModificar.setNroConfiguracion(Integer.parseInt(inputNumConfMod.getText()));
                        dtoModificar.setCodTipoCaso(Integer.parseInt(inputCodTipoCasoModif.getText()));
                        dtoModificar.setNombreTipoCaso(outNombreTipoCaso.getText());
                        dtoModificar.setFechaDesde(inputFechaDesdeModif.getDate());
                        dtoError = control.modificarConfiguracion(dtoModificar);                       
                        
                        if(dtoError.getVerificarError() == 0){
                            JOptionPane.showMessageDialog(this, "La Configuración se modificó con éxito");
                            ABMConfiguracionTipoCaso abmC = new ABMConfiguracionTipoCaso();
                            abmC.setVisible(true);
                            this.setVisible(false);
                        }else{
                            MensajeError.setForeground(Color.red);
                            MensajeError.setText(dtoError.getErrorMensaje());
                            dtoError.setVerificarError(0);
                        }
                    }while(dtoError.getVerificarError()!=0);
                
                        }else{
                    JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos o hay campos vacíos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
                        
                }else{
                    JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos o hay campos vacíos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            }else {
                JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos o hay campos vacíos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }}else{
                JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos o hay campos vacíos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_confirmarModificarActionPerformed

    private void inputCodTipoCasoModifFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodTipoCasoModifFocusLost
        //pierde el foco en el input codigo
        if (!inputCodTipoCasoModif.getText().isEmpty()) {
            MostrarTipoCasoInput(inputCodTipoCasoModif.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código de Tipo Caso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            outNombreTipoCaso.setText("");
        }
    }//GEN-LAST:event_inputCodTipoCasoModifFocusLost

    private void botonbuscarTipocasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarTipocasoActionPerformed
        List<DTOLupitaTipoCaso> listaTipoCasos = control.buscarLupitaTipoCaso();

        DTOLupitaTipoCaso[] ordenarTC = new DTOLupitaTipoCaso[listaTipoCasos.size()];
        ordenarTC = listaTipoCasos.toArray(ordenarTC);
        
        
        for (int i = 0; i < ordenarTC.length - 1; i++) {
            
            for (int j = 0; j < ordenarTC.length - 1; j++) { 
                if (ordenarTC[j].getCodTipoCaso() > ordenarTC[j + 1].getCodTipoCaso()) {
                   
                    DTOLupitaTipoCaso temp = ordenarTC[j + 1];
                    ordenarTC[j + 1] = ordenarTC[j];
                    ordenarTC[j] = temp;
                  
                }
            }
        }
        
        String mensaje= "Listado de Tipo Caso \n\n ";

        for(int i=0; i< listaTipoCasos.size(); i++){
            mensaje +=  "Código Tipo Caso: "+ ordenarTC[i].getCodTipoCaso()+ ", Nombre Tipo Caso: "+ ordenarTC[i].getNombreTipoCaso()+ "\n\n" ;
        }

        JOptionPane.showMessageDialog(this, mensaje, "Lista de Sectores", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonbuscarTipocasoActionPerformed

    private void MostrarTipoCasoInput(String text) {
        String nombreTCaso = control.inputCodTipoCaso(text);     
        if(nombreTCaso == "El tipo de caso ingresado está dado de baja"){
            
            outNombreTipoCaso.setForeground(Color.RED);
            MensajeError.setText("");
            outNombreTipoCaso.setText("El Tipo Caso está dado de baja");
            JOptionPane.showMessageDialog(this, "El Tipo Caso está dado de baja", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }else if (nombreTCaso == "No existe el Tipo Caso Ingresado"){
           
            outNombreTipoCaso.setForeground(Color.RED);
            MensajeError.setText("");
            outNombreTipoCaso.setText("No existe el código del Tipo Caso Ingresado");
            JOptionPane.showMessageDialog(this, "No existe el código del Tipo Caso Ingresado", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }else{
            outNombreTipoCaso.setForeground(Color.black);
            MensajeError.setText("");
            outNombreTipoCaso.setText(nombreTCaso);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarConfigTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarConfigTipoCaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MensajeError;
    private javax.swing.JButton botonbuscarTipocaso;
    private javax.swing.JButton confirmarModificar;
    private javax.swing.JTextField inputCodTipoCasoModif;
    private com.toedter.calendar.JDateChooser inputFechaDesdeModif;
    private javax.swing.JTextField inputNumConfMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField outNombreTipoCaso;
    private javax.swing.JButton volverABMAgregar;
    // End of variables declaration//GEN-END:variables

   
}
