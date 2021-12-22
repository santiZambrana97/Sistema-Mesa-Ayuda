package Interfaces.ABMTipoInstancia;

import Controller.ControladorABMTipoInstancia;
import DTO.DTOsTipoInstancia.DTOFiltroTI;
import DTO.DTOsTipoInstancia.DTOAgregarTipoInstancia;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;

import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Menu;

public class ABMTipoInstancia extends javax.swing.JFrame {

    DefaultTableModel tablaTI;
    ControladorABMTipoInstancia controlTI = new ControladorABMTipoInstancia();
    DTOAgregarTipoInstancia dtoTI = new DTOAgregarTipoInstancia();

    public ABMTipoInstancia() {
        initComponents();
        setLocationRelativeTo(null); //Este método me permite poder centrar la ventana en la pantalla
        setTitle("ABM Tipo Instancia");
        tablaTI("","");
        tablaTI.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AgregarTI = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoInstancia = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        ModificarTI = new javax.swing.JButton();
        BajaTI = new javax.swing.JButton();
        ErrorMensaje = new javax.swing.JTextField();
        botonMostrarDatos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        filBusquedaCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filBusquedaNombre = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SECTOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(119, 148, 166));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TIPO INSTANCIA");

        AgregarTI.setBackground(new java.awt.Color(119, 148, 166));
        AgregarTI.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AgregarTI.setForeground(new java.awt.Color(0, 0, 0));
        AgregarTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        AgregarTI.setMnemonic('a');
        AgregarTI.setText("Agregar");
        AgregarTI.setBorder(null);
        AgregarTI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AgregarTI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarTI)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tablaTipoInstancia = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaTipoInstancia.setBackground(new java.awt.Color(255, 255, 255));
        tablaTipoInstancia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaTipoInstancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod. Tipo Instancia", "Nombre Tipo Instancia", "Nombre Sector", "Nombre Tipo Tarea", "Fecha Fin Vigencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTipoInstancia.setRowHeight(20);
        tablaTipoInstancia.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tablaTipoInstancia.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaTipoInstancia);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        jButton3.setMnemonic('v');
        jButton3.setText("Volver");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(120, 36));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ModificarTI.setBackground(new java.awt.Color(204, 204, 204));
        ModificarTI.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ModificarTI.setForeground(new java.awt.Color(0, 0, 0));
        ModificarTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_edit_black_18dp.png"))); // NOI18N
        ModificarTI.setMnemonic('m');
        ModificarTI.setText("Modificar");
        ModificarTI.setBorder(null);
        ModificarTI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTIActionPerformed(evt);
            }
        });

        BajaTI.setBackground(new java.awt.Color(204, 204, 204));
        BajaTI.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BajaTI.setForeground(new java.awt.Color(0, 0, 0));
        BajaTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_delete_black_18dp.png"))); // NOI18N
        BajaTI.setMnemonic('b');
        BajaTI.setText("Dar Baja");
        BajaTI.setBorder(null);
        BajaTI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BajaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaTIActionPerformed(evt);
            }
        });

        ErrorMensaje.setEditable(false);
        ErrorMensaje.setBackground(new java.awt.Color(204, 204, 204));
        ErrorMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ErrorMensaje.setBorder(null);
        ErrorMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorMensajeActionPerformed(evt);
            }
        });

        botonMostrarDatos.setBackground(new java.awt.Color(204, 204, 204));
        botonMostrarDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonMostrarDatos.setForeground(new java.awt.Color(0, 0, 0));
        botonMostrarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_visibility_black_18dp.png"))); // NOI18N
        botonMostrarDatos.setMnemonic('d');
        botonMostrarDatos.setText("Mostrar Datos");
        botonMostrarDatos.setBorder(null);
        botonMostrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cód. Tipo Instancia Desde:");

        filBusquedaCod.setBackground(new java.awt.Color(255, 255, 255));
        filBusquedaCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                filBusquedaCodFocusLost(evt);
            }
        });
        filBusquedaCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filBusquedaCodActionPerformed(evt);
            }
        });
        filBusquedaCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filBusquedaCodKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filBusquedaCodKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filBusquedaCodKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre Tipo Instancia:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N

        filBusquedaNombre.setBackground(new java.awt.Color(255, 255, 255));
        filBusquedaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filBusquedaNombreActionPerformed(evt);
            }
        });
        filBusquedaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filBusquedaNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filBusquedaNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filBusquedaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(filBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(filBusquedaCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModificarTI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BajaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMostrarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ModificarTI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BajaTI)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tablaTI(String filTipoInstanciaNomb,String filTipoInstanciaCod) { //Método de la tabla que se muestra en la interfaz
        
       
        List<DTOFiltroTI> lista = null;
         int cod;
            try{
             cod = Integer.parseInt(filTipoInstanciaCod);
            }catch(Exception e){
              cod = 0;
            }
        
  
        lista = controlTI.filtroTINombreTI2(cod,filTipoInstanciaNomb);
        
        DTOFiltroTI[] ordenarTI = new DTOFiltroTI[lista.size()];
        ordenarTI = lista.toArray(ordenarTI);
        
        
        for (int i = 0; i < ordenarTI.length - 1; i++) {
            
            for (int j = 0; j < ordenarTI.length - 1; j++) { 
                if (ordenarTI[j].getCodTipoInstancia() > ordenarTI[j + 1].getCodTipoInstancia()) {
                   
                    DTOFiltroTI temp = ordenarTI[j + 1];
                    ordenarTI[j + 1] = ordenarTI[j];
                    ordenarTI[j] = temp;
                  
                }
            }
        }
        tablaTI = new DefaultTableModel();
        tablaTipoInstancia.setModel(tablaTI);
        tablaTI.addColumn("Cod. Tipo Instancia");  //Cada una  de las sentencias es una columna en la tabla modelo que instanciamos
        tablaTI.addColumn("Nombre Tipo Instancia");//que Luego esta tabla le setteamos para mostrar en modelo de la interfaz
        tablaTI.addColumn("Nombre Sector");
        tablaTI.addColumn("Nombre Tipo Tarea");
        tablaTI.addColumn("Fecha Fin Vigencia");

        tablaTipoInstancia.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tablaTipoInstancia.getTableHeader().setBackground(new Color(172, 202, 221));

        tablaTipoInstancia.getTableHeader().setReorderingAllowed(false);
 
        for(MouseListener listener : tablaTipoInstancia.getTableHeader().getMouseListeners()){
        tablaTipoInstancia.getTableHeader().removeMouseListener(listener);
        }
        
        for (int i = 0; i < ordenarTI.length; i++) {
            Vector fil = new Vector();
            fil.add(ordenarTI[i].getCodTipoInstancia());
            fil.add(ordenarTI[i].getNombreTipoInstancia());
            fil.add(ordenarTI[i].getNombreSector());
            fil.add(ordenarTI[i].getNombreTipoTarea());
            fil.add(ordenarTI[i].getFechaHoraFinVigenciaTI());
            tablaTI.addRow(fil);
        }
    }
    private void filBusquedaCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filBusquedaCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filBusquedaCodActionPerformed

    private void AgregarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTIActionPerformed
        //Metodo para agregar un Tipo instancia
        AgregarTipoInstancia agregar = new AgregarTipoInstancia();
        agregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarTIActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Método para volver
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ModificarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTIActionPerformed
        //Método para modificar
        int numTabTI = tablaTipoInstancia.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabTI
        if (numTabTI == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningún sector para modificar");
        } else {
            for (int i = 0; i < tablaTipoInstancia.getRowCount(); i++) { //Recorremos la tabla
                if (tablaTipoInstancia.getValueAt(i, 4) != null) {
                    ErrorMensaje.setForeground(Color.RED);
                    ErrorMensaje.setText("El Tipo instancia está dado de baja, no se puede modificar");
                } else {
                    if (numTabTI == i) { //comparamos de que el numero almacenado en numTabTI sea igual al numero del arreglo
                        
                        int codTIModi = (int)tablaTI.getValueAt(i, 0);  
                        //la "i" es la fila y el 0 la columna de la tabla
                       
                        
                    ModificarTipoInstancia mod = new ModificarTipoInstancia(codTIModi);
                    mod.setVisible(true);
                    this.setVisible(false);
                    }

                }
            }
        }
    }//GEN-LAST:event_ModificarTIActionPerformed


    private void BajaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaTIActionPerformed
        //Método para eliminar
        int numTabSec = tablaTipoInstancia.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        if (numTabSec == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningún Tipo Instancia para dar de baja");

        } else {
            for (int i = 0; i < tablaTipoInstancia.getRowCount(); i++) { //Recorremos la tabla
                if (numTabSec == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo 
                    if (tablaTipoInstancia.getValueAt(i, 4) != null) {
                        ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
                        ErrorMensaje.setText("El Tipo Instancia elegido ya está dado de baja");
                    } else {
                    //    dtoTI.setCodTipoInstancia((int) tablaTipoInstancia.getValueAt(i, 0));//el primero del parametro hace referencia a la fila y el segundo a la columna
                        int j = JOptionPane.showConfirmDialog(this,
                                ""
                                + "¿Está seguro que desea confirmar la baja? \n\n"
                                + "Cod Tipo Instancia: " + (int) tablaTipoInstancia.getValueAt(i, 0) + "\n"
                                + "Nombre Tipo Instancia: " + tablaTipoInstancia.getValueAt(i, 1) + "\n"
                                + "Nombre Sector: " + tablaTipoInstancia.getValueAt(i, 2) + "\n"
                                + "Nombre Tipo Tarea: " + tablaTipoInstancia.getValueAt(i, 3) + "\n\n",
                                 "Dar de Baja Tipo Instancia", JOptionPane.YES_NO_OPTION);
                        if (j == 0) {
                            controlTI.bajaTipoInstancia((int) tablaTipoInstancia.getValueAt(i, 0));
                            JOptionPane.showMessageDialog(this, "Tipo Instancia dado de baja");
                        }
                        tablaTI("","");
                    }
                }
            }
        }
    }//GEN-LAST:event_BajaTIActionPerformed

    private void filBusquedaCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filBusquedaCodKeyPressed

    }//GEN-LAST:event_filBusquedaCodKeyPressed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
        //Método Mostrar datos de TipoInstancia
        int numTabSec = tablaTipoInstancia.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec       
        if (numTabSec == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningún Tipo Instancia para mostrar");
        } else  {
            for (int i = 0; i < tablaTipoInstancia.getRowCount(); i++) { //Recorremos la tabla
                if (numTabSec == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo
                    int codTIMostrar = (int) tablaTI.getValueAt(i, 0);
                    VerDatosTipoInstancia mostrar = new VerDatosTipoInstancia(codTIMostrar);
                    mostrar.setVisible(true);

                }

            }
        }

    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void filBusquedaCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filBusquedaCodKeyReleased
       tablaTI(filBusquedaNombre.getText(), filBusquedaCod.getText());
        
    }//GEN-LAST:event_filBusquedaCodKeyReleased

    private void ErrorMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorMensajeActionPerformed

    private void filBusquedaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filBusquedaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filBusquedaNombreActionPerformed

    private void filBusquedaNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filBusquedaNombreKeyPressed
 
    }//GEN-LAST:event_filBusquedaNombreKeyPressed

    private void filBusquedaNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filBusquedaNombreKeyReleased

        tablaTI(filBusquedaNombre.getText(), filBusquedaCod.getText());
    }//GEN-LAST:event_filBusquedaNombreKeyReleased

    private void filBusquedaCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filBusquedaCodFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_filBusquedaCodFocusLost

    private void filBusquedaCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filBusquedaCodKeyTyped
       
    }//GEN-LAST:event_filBusquedaCodKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMTipoInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTI;
    private javax.swing.JButton BajaTI;
    private javax.swing.JTextField ErrorMensaje;
    private javax.swing.JButton ModificarTI;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JTextField filBusquedaCod;
    private javax.swing.JTextField filBusquedaNombre;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTipoInstancia;
    // End of variables declaration//GEN-END:variables
}
