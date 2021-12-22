
package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOErroresMensajes;
import DTO.DTOsConfiguración.DTOLupitaTipoInstancia;
import DTO.DTOsConfiguración.DTOModificarRenglon;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;


public class ModificarRenglon extends javax.swing.JFrame {

    ControladorConfiguracionTipoCaso control = new ControladorConfiguracionTipoCaso();
    int nroConfiguracion = 0;
    
    
    public ModificarRenglon() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar Detalle Configuración");
        inputMinutosMaximos.selectAll();
        inputMinutosMaximos.requestFocus();
        
    }
    
    
    ModificarRenglon(int nroConfigura, int ordenTCTISelec) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar Renglón");
        
        DTOModificarRenglon dtomodificar = control.buscarRenglonModificar(nroConfigura, ordenTCTISelec);
        nroConfiguracion = dtomodificar.getNroConfig();
        iniciarDatos(dtomodificar);
    }
    
    
    private void iniciarDatos(DTOModificarRenglon dtomodificar) {
        inputordenTCTI.setText(Integer.toString(dtomodificar.getOrdenTCTI()));        
        inputMinutosMaximos.setText(Integer.toString( dtomodificar.getMinutosMAXReso()));
        inputCodInstancia.setText(Integer.toString(dtomodificar.getCodTI()));
        outNombTI.setText(dtomodificar.getNombreTI());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNroRenglo = new javax.swing.JLabel();
        confirmarModificar = new javax.swing.JButton();
        inputordenTCTI = new javax.swing.JTextField();
        outNombTI = new javax.swing.JTextField();
        inputCodInstancia = new javax.swing.JTextField();
        labelNombTipoInstancia = new javax.swing.JLabel();
        MensajeError = new javax.swing.JTextField();
        labelCodTipoInstancia = new javax.swing.JLabel();
        labelMinDura = new javax.swing.JLabel();
        inputMinutosMaximos = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        volverABM = new javax.swing.JButton();
        botonbuscarTipocaso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        labelNroRenglo.setBackground(new java.awt.Color(0, 0, 0));
        labelNroRenglo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNroRenglo.setForeground(new java.awt.Color(0, 0, 0));
        labelNroRenglo.setText("Número de detalle:");

        confirmarModificar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarModificar.setForeground(new java.awt.Color(0, 0, 0));
        confirmarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarModificar.setMnemonic('c');
        confirmarModificar.setText("Confirmar");
        confirmarModificar.setBorder(null);
        confirmarModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarModificar.setPreferredSize(new java.awt.Dimension(120, 36));
        confirmarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarModificarActionPerformed(evt);
            }
        });

        inputordenTCTI.setEditable(false);
        inputordenTCTI.setBackground(new java.awt.Color(153, 153, 153));
        inputordenTCTI.setBorder(null);
        inputordenTCTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputordenTCTIActionPerformed(evt);
            }
        });
        inputordenTCTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputordenTCTIKeyTyped(evt);
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

        inputCodInstancia.setBackground(new java.awt.Color(255, 255, 255));
        inputCodInstancia.setBorder(null);
        inputCodInstancia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCodInstanciaFocusLost(evt);
            }
        });
        inputCodInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCodInstanciaActionPerformed(evt);
            }
        });
        inputCodInstancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCodInstanciaKeyTyped(evt);
            }
        });

        labelNombTipoInstancia.setBackground(new java.awt.Color(0, 0, 0));
        labelNombTipoInstancia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNombTipoInstancia.setForeground(new java.awt.Color(0, 0, 0));
        labelNombTipoInstancia.setText("Nombre Tipo Instancia:");

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

        inputMinutosMaximos.setBackground(new java.awt.Color(255, 255, 255));
        inputMinutosMaximos.setBorder(null);
        inputMinutosMaximos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputMinutosMaximosFocusLost(evt);
            }
        });
        inputMinutosMaximos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMinutosMaximosActionPerformed(evt);
            }
        });
        inputMinutosMaximos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputMinutosMaximosKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jLabel5.setText("MODIFICAR DETALLE");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MensajeError)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(volverABM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputordenTCTI)
                    .addComponent(inputMinutosMaximos)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCodInstancia)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombTipoInstancia)
                                    .addComponent(labelCodTipoInstancia)
                                    .addComponent(labelNroRenglo)
                                    .addComponent(labelMinDura))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonbuscarTipocaso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(outNombTI))
                .addGap(27, 27, 27))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNroRenglo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputordenTCTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMinDura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputMinutosMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCodTipoInstancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputCodInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscarTipocaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNombTipoInstancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outNombTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverABM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
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

    private void confirmarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarModificarActionPerformed
        DTOErroresMensajes dtoError = new DTOErroresMensajes();
        
        
        
        if(!inputordenTCTI.getText().isEmpty()){
            if(!inputMinutosMaximos.getText().isEmpty()){
                if(!inputCodInstancia.getText().isEmpty()){
                    if(!outNombTI.getText().isEmpty()){
                        do{
                            DTOModificarRenglon dtoMofidRenglon = new DTOModificarRenglon();
                            dtoMofidRenglon.setNroConfig(nroConfiguracion);
                            dtoMofidRenglon.setOrdenTCTI(Integer.parseInt(inputordenTCTI.getText()));
                            dtoMofidRenglon.setMinutosMAXReso(Integer.parseInt(inputMinutosMaximos.getText()));
                            dtoMofidRenglon.setCodTI(Integer.parseInt(inputCodInstancia.getText()));
                            dtoMofidRenglon.setNombreTI(outNombTI.getText());
                            dtoError = control.modificarRenglon(dtoMofidRenglon);
                            
                            if(dtoError.getVerificarError() == 0){
                                JOptionPane.showMessageDialog(this, "El detalle se modificó con éxito");
                                TrabajarRenglones trabajarRenglones = new TrabajarRenglones(nroConfiguracion);
                                trabajarRenglones.setVisible(true);
                                this.setVisible(false);
                            }else{
                                MensajeError.setForeground(Color.red);
                                MensajeError.setText(dtoError.getErrorMensaje());
                                dtoError.setVerificarError(0);
                            }
                            
                        }while(dtoError.getVerificarError()!=0);
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Por favor ingrese un Código Tipo Instancia valido", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }    
                }else{
                    JOptionPane.showMessageDialog(this, "Por favor ingrese un Código Tipo Instancia", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Por favor ingrese un número de minutos máximos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_confirmarModificarActionPerformed

    private void inputordenTCTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputordenTCTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputordenTCTIActionPerformed

    private void inputordenTCTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputordenTCTIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputordenTCTIKeyTyped

    private void outNombTIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outNombTIFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombTIFocusLost

    private void outNombTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outNombTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombTIActionPerformed

    private void outNombTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outNombTIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outNombTIKeyTyped

    private void inputCodInstanciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodInstanciaFocusLost
        if (!inputCodInstancia.getText().isEmpty()) {
            MostrarTipoInstanciaInput(inputCodInstancia.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código de Tipo Instancia", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inputCodInstanciaFocusLost

    private void MostrarTipoInstanciaInput(String codTipoInstancia) {
        String nombreTInstancia = control.inputCodTipoInstancia(codTipoInstancia);     
        if(nombreTInstancia == "El tipo de instancia ingresado está dado de baja"){
            outNombTI.setForeground(Color.RED);
            MensajeError.setText("");
            outNombTI.setText("El tipo de instancia ingresado está dado de baja");
            JOptionPane.showMessageDialog(this, "El tipo de instancia ingresado está dado de baja", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }else if (nombreTInstancia == "No existe el Tipo Instancia Ingresado"){
            outNombTI.setText("No existe el Tipo Instancia Ingresado");
            outNombTI.setForeground(Color.RED);
            MensajeError.setText("");
            JOptionPane.showMessageDialog(this, "No existe el Tipo Instancia Ingresado", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }else{
            MensajeError.setText("");
            outNombTI.setForeground(Color.BLACK);
            outNombTI.setText(nombreTInstancia);
           
        }
    }
    
    
    private void inputCodInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCodInstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodInstanciaActionPerformed

    private void inputMinutosMaximosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMinutosMaximosFocusLost

    }//GEN-LAST:event_inputMinutosMaximosFocusLost

    private void inputMinutosMaximosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMinutosMaximosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMinutosMaximosActionPerformed

    private void inputMinutosMaximosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMinutosMaximosKeyTyped
         char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_inputMinutosMaximosKeyTyped

    private void volverABMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMActionPerformed

        TrabajarRenglones trabajarRenglos = new TrabajarRenglones(nroConfiguracion);
        trabajarRenglos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverABMActionPerformed

    private void botonbuscarTipocasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarTipocasoActionPerformed
        List<DTOLupitaTipoInstancia> listadoTipoInstancia = control.buscarLupitaTipoInstancia();

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

    private void MensajeErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensajeErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MensajeErrorActionPerformed

    private void inputCodInstanciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodInstanciaKeyTyped
         //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite números", "Mensaje de Error Código", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_inputCodInstanciaKeyTyped

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
            java.util.logging.Logger.getLogger(ModificarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarRenglon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarRenglon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MensajeError;
    private javax.swing.JButton botonbuscarTipocaso;
    private javax.swing.JButton confirmarModificar;
    private javax.swing.JTextField inputCodInstancia;
    private javax.swing.JTextField inputMinutosMaximos;
    private javax.swing.JTextField inputordenTCTI;
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
