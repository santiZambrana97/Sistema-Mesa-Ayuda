package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOAgregarRenglon;
import DTO.DTOsConfiguración.DTOErroresMensajes;
import DTO.DTOsConfiguración.DTOLupitaTipoInstancia;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;


public class AgregarRenglon extends javax.swing.JFrame {
    
    
    DTOAgregarRenglon dtoAR = new DTOAgregarRenglon();
    DTOErroresMensajes dtoE = new DTOErroresMensajes();
    ControladorConfiguracionTipoCaso controlador = new ControladorConfiguracionTipoCaso();
    int codConfig = 0;
     
    public AgregarRenglon(int numConfig) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Agregar Detalle Configuración");
        codConfig = numConfig; 
        inputNumRenglon.requestFocus();
        outNombTI.setForeground(Color.black);

    }

    private AgregarRenglon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelNroRenglo = new javax.swing.JLabel();
        inputNumRenglon = new javax.swing.JTextField();
        inputMinMax = new javax.swing.JTextField();
        errorMensaje = new javax.swing.JLabel();
        MensajeError = new javax.swing.JTextField();
        labelCodTipoInstancia = new javax.swing.JLabel();
        labelMinDura = new javax.swing.JLabel();
        inputCodTI = new javax.swing.JTextField();
        volverABM = new javax.swing.JButton();
        confirmarAgregar = new javax.swing.JButton();
        outNombTI = new javax.swing.JTextField();
        labelNombTipoInstancia = new javax.swing.JLabel();
        botonbuscarTipocaso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jLabel5.setText("AGREGAR DETALLE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
        );

        labelNroRenglo.setBackground(new java.awt.Color(0, 0, 0));
        labelNroRenglo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNroRenglo.setForeground(new java.awt.Color(0, 0, 0));
        labelNroRenglo.setText("Número de detalle:");

        inputNumRenglon.setBackground(new java.awt.Color(255, 255, 255));
        inputNumRenglon.setBorder(null);
        inputNumRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumRenglonActionPerformed(evt);
            }
        });
        inputNumRenglon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNumRenglonKeyTyped(evt);
            }
        });

        inputMinMax.setBackground(new java.awt.Color(255, 255, 255));
        inputMinMax.setBorder(null);
        inputMinMax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputMinMaxFocusLost(evt);
            }
        });
        inputMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMinMaxActionPerformed(evt);
            }
        });
        inputMinMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputMinMaxKeyTyped(evt);
            }
        });

        errorMensaje.setBackground(new java.awt.Color(204, 204, 204));
        errorMensaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        errorMensaje.setForeground(new java.awt.Color(255, 0, 51));
        errorMensaje.setText("  ");

        MensajeError.setEditable(false);
        MensajeError.setBackground(new java.awt.Color(204, 204, 204));
        MensajeError.setBorder(null);
        MensajeError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MensajeErrorActionPerformed(evt);
            }
        });

        labelCodTipoInstancia.setBackground(new java.awt.Color(0, 0, 0));
        labelCodTipoInstancia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCodTipoInstancia.setForeground(new java.awt.Color(0, 0, 0));
        labelCodTipoInstancia.setText("Cod. Tipo Instancia:");

        labelMinDura.setBackground(new java.awt.Color(0, 0, 0));
        labelMinDura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelMinDura.setForeground(new java.awt.Color(0, 0, 0));
        labelMinDura.setText("Minutos máximos: ");

        inputCodTI.setBackground(new java.awt.Color(255, 255, 255));
        inputCodTI.setBorder(null);
        inputCodTI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCodTIFocusLost(evt);
            }
        });
        inputCodTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCodTIActionPerformed(evt);
            }
        });
        inputCodTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCodTIKeyTyped(evt);
            }
        });

        volverABM.setBackground(new java.awt.Color(204, 204, 204));
        volverABM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABM.setForeground(new java.awt.Color(0, 0, 0));
        volverABM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABM.setMnemonic('v');
        volverABM.setText("Volver");
        volverABM.setBorder(null);
        volverABM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverABM.setPreferredSize(new java.awt.Dimension(120, 36));
        volverABM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMActionPerformed(evt);
            }
        });

        confirmarAgregar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        confirmarAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarAgregar.setMnemonic('c');
        confirmarAgregar.setText("Confirmar");
        confirmarAgregar.setBorder(null);
        confirmarAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarAgregar.setPreferredSize(new java.awt.Dimension(120, 36));
        confirmarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAgregarActionPerformed(evt);
            }
        });

        outNombTI.setEditable(false);
        outNombTI.setBackground(new java.awt.Color(153, 153, 153));
        outNombTI.setBorder(null);
        outNombTI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                outNombTIFocusLost(evt);
            }
        });
        outNombTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outNombTIActionPerformed(evt);
            }
        });
        outNombTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outNombTIKeyTyped(evt);
            }
        });

        labelNombTipoInstancia.setBackground(new java.awt.Color(0, 0, 0));
        labelNombTipoInstancia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNombTipoInstancia.setForeground(new java.awt.Color(0, 0, 0));
        labelNombTipoInstancia.setText("Nombre Tipo Instancia:");

        botonbuscarTipocaso.setBackground(new java.awt.Color(119, 148, 166));
        botonbuscarTipocaso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N
        botonbuscarTipocaso.setBorder(null);
        botonbuscarTipocaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarTipocasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMinDura)
                                    .addComponent(labelNroRenglo)
                                    .addComponent(labelCodTipoInstancia)
                                    .addComponent(inputCodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonbuscarTipocaso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputNumRenglon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(labelNombTipoInstancia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputMinMax, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volverABM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(outNombTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(494, 494, 494)
                    .addComponent(errorMensaje)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(labelNroRenglo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMinDura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputMinMax, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCodTipoInstancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscarTipocaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNombTipoInstancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outNombTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volverABM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(404, Short.MAX_VALUE)
                    .addComponent(errorMensaje)
                    .addGap(62, 62, 62)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNumRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumRenglonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumRenglonActionPerformed

    private void inputNumRenglonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNumRenglonKeyTyped
         //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite números", "Mensaje de Error Código", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_inputNumRenglonKeyTyped

    private void inputMinMaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMinMaxFocusLost
     /*   if (!inputMinMax.getText().isEmpty()) {
            MostrarTipoCasoInput(inputMinMax.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código de Tipo Caso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_inputMinMaxFocusLost

    private void inputMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMinMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMinMaxActionPerformed

    private void inputCodTIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodTIFocusLost
        if (!inputCodTI.getText().isEmpty()) {
            MostrarTipoInstanciaInput(inputCodTI.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código de Tipo Instancia", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inputCodTIFocusLost

    
    private void MostrarTipoInstanciaInput(String codTipoInstancia) {
        String nombreTInstancia = controlador.inputCodTipoInstancia(codTipoInstancia);     
        if(nombreTInstancia == "El tipo de instancia ingresado está dado de baja"){
            outNombTI.setForeground(Color.red);
            MensajeError.setText("");
            outNombTI.setText("El tipo de instancia ingresado está dado de baja");
            JOptionPane.showMessageDialog(this, "El tipo de instancia ingresado está dado de baja", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }else if (nombreTInstancia == "No existe el Tipo Instancia Ingresado"){
            outNombTI.setForeground(Color.red);
            MensajeError.setText("");
            outNombTI.setText("No existe el Tipo Instancia Ingresado");
            JOptionPane.showMessageDialog(this, "No existe el Tipo Instancia Ingresado", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }else{
            outNombTI.setText(nombreTInstancia);
            MensajeError.setText("");
            outNombTI.setForeground(Color.BLACK);
        }
    }
    
    private void inputCodTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCodTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodTIActionPerformed

    private void inputCodTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodTIKeyTyped
        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite números", "Mensaje de Error Código", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_inputCodTIKeyTyped

    private void volverABMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMActionPerformed

        TrabajarRenglones abmConf = new TrabajarRenglones(codConfig);
        abmConf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverABMActionPerformed

    private void confirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAgregarActionPerformed
        //Método para agregar un Tipo de Instancia
       //  try {
            if (!inputNumRenglon.getText().isEmpty()) {
                if (!inputMinMax.getText().isEmpty()) {
                    if (!inputCodTI.getText().isEmpty()) {
                        
                                do{
                                    DTOAgregarRenglon dtoAgregar = new DTOAgregarRenglon();
                                    dtoAgregar.setNumConfig(codConfig);
                                    dtoAgregar.setOrdenTCTI(Integer.parseInt(inputNumRenglon.getText()));
                                    dtoAgregar.setMinutosMAXReso(Integer.parseInt(inputMinMax.getText()));
                                    dtoAgregar.setCodTI(Integer.parseInt(inputCodTI.getText()));
                                   
                                    dtoE = controlador.agregarRenglon(dtoAgregar);
                                  
                                    if(dtoE.getVerificarError() == 0){
                                        JOptionPane.showMessageDialog(this, "El detalle se grabó exitosamente");
                                        TrabajarRenglones abmT = new TrabajarRenglones(codConfig);
                                        abmT.setVisible(true);
                                        this.setVisible(false);
                                    }else{
                                        MensajeError.setForeground(Color.red);
                                        MensajeError.setText(dtoE.getErrorMensaje());
                                        dtoE.setVerificarError(0);
                                    }

                                }while(dtoE.getVerificarError()!=0);

                               
                        }else{
                            JOptionPane.showMessageDialog(this, "Por favor ingrese un Código Tipo Instancia válido", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Por favor ingrese los minutos máximos de resolución", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese un Número de Configuración de Tipo Caso", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }

          /*  } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
        }*/
    }//GEN-LAST:event_confirmarAgregarActionPerformed

    private void outNombTIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outNombTIFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombTIFocusLost

    private void outNombTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outNombTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombTIActionPerformed

    private void outNombTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outNombTIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombTIKeyTyped

    private void inputMinMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMinMaxKeyTyped
         //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite números", "Mensaje de Error Código", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_inputMinMaxKeyTyped

    private void MensajeErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensajeErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MensajeErrorActionPerformed

    private void botonbuscarTipocasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarTipocasoActionPerformed
        List<DTOLupitaTipoInstancia> listadoTipoInstancia = controlador.buscarLupitaTipoInstancia();

        DTOLupitaTipoInstancia[] ordenarTC = new DTOLupitaTipoInstancia[listadoTipoInstancia.size()];
        ordenarTC = listadoTipoInstancia.toArray(ordenarTC);
        
        
        for (int i = 0; i < ordenarTC.length - 1; i++) {
            
            for (int j = 0; j < ordenarTC.length - 1; j++) { 
                if (ordenarTC[j].getCodigoTipoInstancia()> ordenarTC[j + 1].getCodigoTipoInstancia()) {
                   
                    DTOLupitaTipoInstancia temp = ordenarTC[j + 1];
                    ordenarTC[j + 1] = ordenarTC[j];
                    ordenarTC[j] = temp;
                  
                }
            }
        }
        
        String mensaje= "Listado de Tipo Instancia \n\n ";

        for(int i=0; i< listadoTipoInstancia.size(); i++){
            mensaje +=  "Código Tipo Instancia: "+ ordenarTC[i].getCodigoTipoInstancia()+ ", Nombre Tipo Instancia: "+ ordenarTC[i].getNombreTipoInstancia()+ "\n\n" ;
        }

        JOptionPane.showMessageDialog(this, mensaje, "Lista de Sectores", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonbuscarTipocasoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarRenglon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MensajeError;
    private javax.swing.JButton botonbuscarTipocaso;
    private javax.swing.JButton confirmarAgregar;
    private javax.swing.JLabel errorMensaje;
    private javax.swing.JTextField inputCodTI;
    private javax.swing.JTextField inputMinMax;
    private javax.swing.JTextField inputNumRenglon;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCodTipoInstancia;
    private javax.swing.JLabel labelMinDura;
    private javax.swing.JLabel labelNombTipoInstancia;
    private javax.swing.JLabel labelNroRenglo;
    private javax.swing.JTextField outNombTI;
    private javax.swing.JButton volverABM;
    // End of variables declaration//GEN-END:variables

}
