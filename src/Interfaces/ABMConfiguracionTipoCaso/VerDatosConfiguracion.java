
package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOErroresMensajes;
import DTO.DTOsConfiguración.DTORenglones;
import DTO.DTOsConfiguración.DTOVisualizarVerificar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatosConfiguracion extends javax.swing.JFrame {
    
    DTOErroresMensajes dtoError = new DTOErroresMensajes();
    DTOVisualizarVerificar dtoVisuV = new DTOVisualizarVerificar();
    ControladorConfiguracionTipoCaso control = new ControladorConfiguracionTipoCaso();
    DefaultTableModel tablaVisualizarConf;
    int numConfVerificar = 0;
    
    
    public VerDatosConfiguracion(int verificaOVerdatos, int codConf) {
        initComponents();
        setLocationRelativeTo(null);
        if(verificaOVerdatos == 1){
            setTitle("Verificar Configuración de Tipo Caso");
            verificarConf.setVisible(true);
            numConfVerificar = codConf;
        }else if(verificaOVerdatos == 0){
            setTitle("Ver Configuración de Tipo Caso");
            verificarConf.setVisible(false);
        }
        dtoVisuV = control.visualizarDatosYVerificar(codConf);
        inicializarDatos(dtoVisuV);
    }
    
    public void inicializarDatos(DTOVisualizarVerificar dtovisu){ //Método para inicializar los datos en la Interfaz
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        verConfTC.setForeground(Color.black);
        verCodTipoCaso.setForeground(Color.black);
        verNombTC.setForeground(Color.black);
        verFIV.setForeground(Color.black);
        verFFV.setForeground(Color.black);
        verFV.setForeground(Color.black);
        
        verConfTC.setText(Integer.toString(dtovisu.getNroConfigTipoCaso()));
        verCodTipoCaso.setText(Integer.toString(dtovisu.getCodTipoCaso()));
        verNombTC.setText(dtovisu.getNombreTipoCaso());

       
        Date fechaIV = dtovisu.getFechaInicioVig();
        String fechaInicioV = df.format(fechaIV);            
        verFIV.setText(fechaInicioV);
        
        if(dtovisu.getFechaFinVig() == null){
            verFFV.setText("null");
        }else{
        Date fechaFV = dtovisu.getFechaFinVig();
        String fechaFinV = df.format(fechaFV);        
        verFFV.setText(fechaFinV);
        }
        if(dtovisu.getFechaVerificacion() == null){
            verFV.setText("Sin verificar");
        }else{
        Date fechaV = dtovisu.getFechaVerificacion();
        String fechaVer = df.format(fechaV);  
        verFV.setText(fechaVer);
        }
        tablaVisualizarConf(dtovisu.renglones);      
    }
    public void tablaVisualizarConf(List<DTORenglones> dtovisuTablaRenglon) { //Método de la tabla que se muestra en la interfaz de los renglones de la configuración
        DTORenglones[] ordenarVisualizarRenglones = new DTORenglones[dtovisuTablaRenglon.size()];
        ordenarVisualizarRenglones = dtovisuTablaRenglon.toArray(ordenarVisualizarRenglones);
        
        
        for (int i = 0; i < ordenarVisualizarRenglones.length - 1; i++) {
            
            for (int j = 0; j < ordenarVisualizarRenglones.length - 1; j++) { 
                if (ordenarVisualizarRenglones[j].ordenTCTI > ordenarVisualizarRenglones[j + 1].ordenTCTI) {
                   
                    DTORenglones temp = ordenarVisualizarRenglones[j + 1];
                    ordenarVisualizarRenglones[j + 1] = ordenarVisualizarRenglones[j];
                    ordenarVisualizarRenglones[j] = temp;
                  
                }
            }
        }
        
        List<DTORenglones> lista = dtovisuTablaRenglon;
        tablaVisualizarConf = new DefaultTableModel();
        tablaRenglon.setModel(tablaVisualizarConf);
        
        tablaVisualizarConf.addColumn("Orden TCTI");  //Cada una  de las sentencias es una columna en la tabla modelo que instanciamos
        tablaVisualizarConf.addColumn("Minutos Max");//que Luego esta tabla le setteamos para mostrar en modelo de la interfaz
        tablaVisualizarConf.addColumn("Cod. Tipo Instancia");
        tablaVisualizarConf.addColumn("Nomb. Tipo Instancia");      

        tablaRenglon.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tablaRenglon.getTableHeader().setBackground(new Color(172, 202, 221));

        tablaRenglon.getTableHeader().setReorderingAllowed(false);
 
        for(MouseListener listener : tablaRenglon.getTableHeader().getMouseListeners()){
        tablaRenglon.getTableHeader().removeMouseListener(listener);
        }
       

       for (int i = 0; i < lista.size(); i++) {
            Vector fil = new Vector();
            fil.add(ordenarVisualizarRenglones[i].ordenTCTI);
            fil.add(ordenarVisualizarRenglones[i].minutosMAXReso);
            fil.add(ordenarVisualizarRenglones[i].codTI);
            fil.add(ordenarVisualizarRenglones[i].nombreTI);           
            tablaVisualizarConf.addRow(fil);
        }
       
       
    }
    private VerDatosConfiguracion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        verFV = new javax.swing.JTextField();
        botonVolverABM = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        verificarConf = new javax.swing.JButton();
        labelcodver = new javax.swing.JLabel();
        verConfTC = new javax.swing.JTextField();
        labelcodver2 = new javax.swing.JLabel();
        labelnombver = new javax.swing.JLabel();
        verFIV = new javax.swing.JTextField();
        verCodTipoCaso = new javax.swing.JTextField();
        labelnombver2 = new javax.swing.JLabel();
        labelFechaFinver = new javax.swing.JLabel();
        verFFV = new javax.swing.JTextField();
        verNombTC = new javax.swing.JTextField();
        labelFechaFinver2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRenglon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        verFV.setEditable(false);
        verFV.setBackground(new java.awt.Color(153, 153, 153));
        verFV.setBorder(null);
        verFV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFVKeyTyped(evt);
            }
        });

        botonVolverABM.setBackground(new java.awt.Color(204, 204, 204));
        botonVolverABM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonVolverABM.setForeground(new java.awt.Color(0, 0, 0));
        botonVolverABM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonVolverABM.setMnemonic('v');
        botonVolverABM.setText("Volver");
        botonVolverABM.setBorder(null);
        botonVolverABM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolverABM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverABMActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setForeground(new java.awt.Color(0, 0, 0));
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_visibility_black_18dp.png"))); // NOI18N
        labelTituloMostrar.setText("DATOS CONFIGURACIÓN TIPO CASO");

        verificarConf.setBackground(new java.awt.Color(204, 204, 204));
        verificarConf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        verificarConf.setForeground(new java.awt.Color(0, 0, 0));
        verificarConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        verificarConf.setMnemonic('c');
        verificarConf.setText("Verificar");
        verificarConf.setBorder(null);
        verificarConf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verificarConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarConfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelTituloMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verificarConf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloMostrar)
                    .addComponent(verificarConf))
                .addGap(25, 25, 25))
        );

        labelcodver.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver.setForeground(new java.awt.Color(0, 0, 0));
        labelcodver.setText("Núm. Configuración Tipo Caso:");

        verConfTC.setEditable(false);
        verConfTC.setBackground(new java.awt.Color(153, 153, 153));
        verConfTC.setBorder(null);
        verConfTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verConfTCActionPerformed(evt);
            }
        });
        verConfTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verConfTCKeyTyped(evt);
            }
        });

        labelcodver2.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver2.setForeground(new java.awt.Color(0, 0, 0));
        labelcodver2.setText("Fecha Inicio Vigencia");

        labelnombver.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver.setForeground(new java.awt.Color(0, 0, 0));
        labelnombver.setText("Cod. Tipo Caso:");

        verFIV.setEditable(false);
        verFIV.setBackground(new java.awt.Color(153, 153, 153));
        verFIV.setBorder(null);
        verFIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFIVActionPerformed(evt);
            }
        });
        verFIV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFIVKeyTyped(evt);
            }
        });

        verCodTipoCaso.setEditable(false);
        verCodTipoCaso.setBackground(new java.awt.Color(153, 153, 153));
        verCodTipoCaso.setBorder(null);
        verCodTipoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodTipoCasoKeyTyped(evt);
            }
        });

        labelnombver2.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver2.setForeground(new java.awt.Color(0, 0, 0));
        labelnombver2.setText("Fecha Fin Vigencia");

        labelFechaFinver.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setText("Nombre Tipo Caso :");

        verFFV.setEditable(false);
        verFFV.setBackground(new java.awt.Color(153, 153, 153));
        verFFV.setBorder(null);
        verFFV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFFVKeyTyped(evt);
            }
        });

        verNombTC.setEditable(false);
        verNombTC.setBackground(new java.awt.Color(153, 153, 153));
        verNombTC.setBorder(null);
        verNombTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombTCKeyTyped(evt);
            }
        });

        labelFechaFinver2.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver2.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaFinver2.setText("Fecha Verificación:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Configuración", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        tablaRenglon = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaRenglon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Orden TCTI", "Minutos Max", "Cod. Tipo Instancia", "Nomb. Tipo Instancia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRenglon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verConfTC, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(labelcodver)
                    .addComponent(labelnombver)
                    .addComponent(labelFechaFinver)
                    .addComponent(verNombTC)
                    .addComponent(labelcodver2)
                    .addComponent(labelnombver2)
                    .addComponent(labelFechaFinver2)
                    .addComponent(verFV, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addComponent(verFFV)
                    .addComponent(verFIV)
                    .addComponent(verCodTipoCaso)
                    .addComponent(botonVolverABM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelcodver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(verConfTC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelnombver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verCodTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(labelFechaFinver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verNombTC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelcodver2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verFIV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelnombver2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verFFV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFechaFinver2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verFV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(botonVolverABM)
                .addGap(12, 12, 12))
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

    private void verFVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFVKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFVKeyTyped

    private void botonVolverABMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverABMActionPerformed
        //Botón para volver al menú de sector
        ABMConfiguracionTipoCaso abm = new ABMConfiguracionTipoCaso();
        abm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverABMActionPerformed

    private void verConfTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verConfTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verConfTCActionPerformed

    private void verConfTCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verConfTCKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
      /*  if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_verConfTCKeyTyped

    private void verFIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFIVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verFIVActionPerformed

    private void verFIVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFIVKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFIVKeyTyped

    private void verCodTipoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodTipoCasoKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
     /*   if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_verCodTipoCasoKeyTyped

    private void verFFVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFFVKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFFVKeyTyped

    private void verNombTCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombTCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verNombTCKeyTyped

    private void verificarConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarConfActionPerformed
        //Método para verificar una configuración tipo caso
           try {
                    do{
                                
                        dtoError = control.verificarConfiguracion(numConfVerificar);

                        if(dtoError.getVerificarError()== 0){//si el mensaje de error del dto es 0(no hubo error) grabamos los datos
                            ABMConfiguracionTipoCaso volver = new ABMConfiguracionTipoCaso(); //Oculto la pagina para dar de alta volviendo al menu de Sector
                            JOptionPane.showMessageDialog(this, "La configuración TipoCaso fue verificada con éxito");
                            volver.setVisible(true);                                   
                            this.setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(this,dtoError.getErrorMensaje(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);                           
                            dtoError.setVerificarError(0);
                        }
                    }while(dtoError.getVerificarError() != 0);

               //Si no puede verificar, salta el catch
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }    
    }//GEN-LAST:event_verificarConfActionPerformed

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
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDatosConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDatosConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolverABM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFechaFinver;
    private javax.swing.JLabel labelFechaFinver2;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JLabel labelcodver;
    private javax.swing.JLabel labelcodver2;
    private javax.swing.JLabel labelnombver;
    private javax.swing.JLabel labelnombver2;
    private javax.swing.JTable tablaRenglon;
    private javax.swing.JTextField verCodTipoCaso;
    private javax.swing.JTextField verConfTC;
    private javax.swing.JTextField verFFV;
    private javax.swing.JTextField verFIV;
    private javax.swing.JTextField verFV;
    private javax.swing.JTextField verNombTC;
    private javax.swing.JButton verificarConf;
    // End of variables declaration//GEN-END:variables
}
