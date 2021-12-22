package Interfaces.ABMTipoTarea;
import Controller.ControladorABMTipoTarea;
import DTO.DTOTipoTarea;
import Interfaces.ABMTipoTarea.ABMTipoTarea;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ModificarTipoTarea extends javax.swing.JFrame {
    ControladorABMTipoTarea control = new ControladorABMTipoTarea();
    DTOTipoTarea dtotita = new DTOTipoTarea();
    ABMTipoTarea abmtita = new ABMTipoTarea();
 
    public ModificarTipoTarea(DTOTipoTarea dtotipotareamodificar) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar Tipo Tarea");
        inputCodtita.setForeground(Color.black);
        inputCodtita.setText(Integer.toString(dtotipotareamodificar.getCodTipoTarea()));
        inputnomtita.setText(dtotipotareamodificar.getNombreTipoTarea());
        inputDesctita.setText(dtotipotareamodificar.getDescripcionTipoTarea());
        inputnomtita.selectAll();
        inputnomtita.requestFocus();
      
    }

    private ModificarTipoTarea() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Bconfirmar = new javax.swing.JButton();
        inputDesctita = new javax.swing.JTextField();
        inputnomtita = new javax.swing.JTextField();
        inputCodtita = new javax.swing.JTextField();
        Bvolver = new javax.swing.JButton();

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Tipo Tarea:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripción Tipo Tarea:");

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MODIF.png"))); // NOI18N
        jLabel5.setText("MODIFICAR TIPO TAREA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(97, 97, 97))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(43, 43, 43))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo Tipo Tarea:");

        Bconfirmar.setBackground(new java.awt.Color(204, 204, 204));
        Bconfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Bconfirmar.setForeground(new java.awt.Color(0, 0, 0));
        Bconfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        Bconfirmar.setMnemonic('c');
        Bconfirmar.setText("Confirmar");
        Bconfirmar.setBorder(null);
        Bconfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bconfirmar.setPreferredSize(new java.awt.Dimension(120, 36));
        Bconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconfirmarActionPerformed(evt);
            }
        });

        inputDesctita.setBackground(new java.awt.Color(255, 255, 255));
        inputDesctita.setBorder(null);
        inputDesctita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDesctitaActionPerformed(evt);
            }
        });

        inputnomtita.setBackground(new java.awt.Color(255, 255, 255));
        inputnomtita.setBorder(null);
        inputnomtita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnomtitaActionPerformed(evt);
            }
        });

        inputCodtita.setEditable(false);
        inputCodtita.setBackground(new java.awt.Color(153, 153, 153));
        inputCodtita.setAlignmentX(0.1F);
        inputCodtita.setBorder(null);
        inputCodtita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCodtitaActionPerformed(evt);
            }
        });

        Bvolver.setBackground(new java.awt.Color(204, 204, 204));
        Bvolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Bvolver.setForeground(new java.awt.Color(0, 0, 0));
        Bvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        Bvolver.setMnemonic('v');
        Bvolver.setText("Volver");
        Bvolver.setBorder(null);
        Bvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bvolver.setPreferredSize(new java.awt.Dimension(120, 36));
        Bvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bvolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(185, 185, 185))
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(inputDesctita, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputCodtita, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputnomtita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCodtita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputnomtita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDesctita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bvolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void BvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvolverActionPerformed

        ABMTipoTarea abmtita = new ABMTipoTarea();
        abmtita.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BvolverActionPerformed
    
    private void BconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconfirmarActionPerformed
       if (!inputnomtita.getText().isEmpty()){
        String nombtitanuevo, desctitanuevo;
        nombtitanuevo = inputnomtita.getText();
        desctitanuevo = inputDesctita.getText();
        
        dtotita.setCodTipoTarea(Integer.parseInt(inputCodtita.getText()));
        dtotita.setNombreTipoTarea(nombtitanuevo);
        dtotita.setDescripcionTipoTarea(desctitanuevo);
        control.modificarTipoTarea(dtotita);
        
        JOptionPane.showMessageDialog(this, "Se modificó con éxito", "Modificado", JOptionPane.INFORMATION_MESSAGE);
        
        abmtita.setVisible(true);
        this.setVisible(false);
        abmtita.tablaTipoTarea("");   
       }else{
          JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre de tipo tarea para poder modificar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE); 
       }
    }//GEN-LAST:event_BconfirmarActionPerformed

    private void inputnomtitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnomtitaActionPerformed
       
    }//GEN-LAST:event_inputnomtitaActionPerformed

    private void inputDesctitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDesctitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDesctitaActionPerformed

    private void inputCodtitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCodtitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodtitaActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarTipoTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bconfirmar;
    private javax.swing.JButton Bvolver;
    private javax.swing.JTextField inputCodtita;
    private javax.swing.JTextField inputDesctita;
    private javax.swing.JTextField inputnomtita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
