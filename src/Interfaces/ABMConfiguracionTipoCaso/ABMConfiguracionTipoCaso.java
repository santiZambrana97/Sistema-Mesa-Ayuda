

package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOTipoConfiguracionGrilla;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import main.Menu;

 
public class ABMConfiguracionTipoCaso extends javax.swing.JFrame {
    
    DefaultTableModel tablaConfiguraciones;
    ControladorConfiguracionTipoCaso controlador = new ControladorConfiguracionTipoCaso();
    DTOTipoConfiguracionGrilla dtoConfi = new DTOTipoConfiguracionGrilla();
   
    public ABMConfiguracionTipoCaso(){
    
        initComponents();      
        setLocationRelativeTo(null); //Este método me permite poder centrar la ventana en la pantalla
        setTitle("ABMConfiguraciónTipoCaso");
        tablaConfiguracion("","");    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConfiguracionCaso = new javax.swing.JTable();
        botonVolver = new javax.swing.JButton();
        ModificarConfiguracion = new javax.swing.JButton();
        ErrorMensaje = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        AgregarCTC = new javax.swing.JButton();
        botonMostrarDatos = new javax.swing.JButton();
        botonDetalleConfiguracion = new javax.swing.JButton();
        botonVerificar = new javax.swing.JButton();
        panelFiltros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filtroBusquedaNombTC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        filtroBusquedaNumConf = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        tablaConfiguracionCaso = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaConfiguracionCaso.setBackground(new java.awt.Color(255, 255, 255));
        tablaConfiguracionCaso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaConfiguracionCaso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod.Tipo Caso", "Nombre Tipo Caso", "Núm. Config. TC", "Fecha Inicio Vigencia", "Fecha Fin Vigencia", "Fecha Verificación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaConfiguracionCaso.setRowHeight(20);
        tablaConfiguracionCaso.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tablaConfiguracionCaso.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaConfiguracionCaso);

        botonVolver.setBackground(new java.awt.Color(204, 204, 204));
        botonVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(0, 0, 0));
        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonVolver.setMnemonic('v');
        botonVolver.setText("Volver");
        botonVolver.setBorder(null);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setPreferredSize(new java.awt.Dimension(120, 36));
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        ModificarConfiguracion.setBackground(new java.awt.Color(204, 204, 204));
        ModificarConfiguracion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ModificarConfiguracion.setForeground(new java.awt.Color(0, 0, 0));
        ModificarConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_edit_black_18dp.png"))); // NOI18N
        ModificarConfiguracion.setMnemonic('m');
        ModificarConfiguracion.setText("Modificar");
        ModificarConfiguracion.setBorder(null);
        ModificarConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarConfiguracion.setPreferredSize(new java.awt.Dimension(171, 36));
        ModificarConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarConfiguracionActionPerformed(evt);
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

        jPanel5.setBackground(new java.awt.Color(119, 148, 166));

        textTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(0, 0, 0));
        textTitulo.setText("Configuración Tipo Caso");

        AgregarCTC.setBackground(new java.awt.Color(119, 148, 166));
        AgregarCTC.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AgregarCTC.setForeground(new java.awt.Color(0, 0, 0));
        AgregarCTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        AgregarCTC.setMnemonic('a');
        AgregarCTC.setText("Agregar");
        AgregarCTC.setBorder(null);
        AgregarCTC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarCTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCTCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AgregarCTC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarCTC)
                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        botonMostrarDatos.setBackground(new java.awt.Color(204, 204, 204));
        botonMostrarDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonMostrarDatos.setForeground(new java.awt.Color(0, 0, 0));
        botonMostrarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_visibility_black_18dp.png"))); // NOI18N
        botonMostrarDatos.setMnemonic('d');
        botonMostrarDatos.setText("Mostrar Datos");
        botonMostrarDatos.setBorder(null);
        botonMostrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMostrarDatos.setPreferredSize(new java.awt.Dimension(171, 36));
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        botonDetalleConfiguracion.setBackground(new java.awt.Color(204, 204, 204));
        botonDetalleConfiguracion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonDetalleConfiguracion.setForeground(new java.awt.Color(0, 0, 0));
        botonDetalleConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar_renglon.png"))); // NOI18N
        botonDetalleConfiguracion.setMnemonic('m');
        botonDetalleConfiguracion.setText("Detalle Configuración");
        botonDetalleConfiguracion.setBorder(null);
        botonDetalleConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDetalleConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetalleConfiguracionActionPerformed(evt);
            }
        });

        botonVerificar.setBackground(new java.awt.Color(204, 204, 204));
        botonVerificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonVerificar.setForeground(new java.awt.Color(0, 0, 0));
        botonVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificar_renglon.png"))); // NOI18N
        botonVerificar.setMnemonic('d');
        botonVerificar.setText("Verificar Configuración");
        botonVerificar.setBorder(null);
        botonVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerificarActionPerformed(evt);
            }
        });

        panelFiltros.setBackground(new java.awt.Color(204, 204, 204));
        panelFiltros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cód. Tipo Caso: ");

        filtroBusquedaNombTC.setBackground(new java.awt.Color(255, 255, 255));
        filtroBusquedaNombTC.setBorder(null);
        filtroBusquedaNombTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroBusquedaNombTCActionPerformed(evt);
            }
        });
        filtroBusquedaNombTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtroBusquedaNombTCKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroBusquedaNombTCKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("N° de Configuración: ");

        filtroBusquedaNumConf.setBackground(new java.awt.Color(255, 255, 255));
        filtroBusquedaNumConf.setBorder(null);
        filtroBusquedaNumConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroBusquedaNumConfActionPerformed(evt);
            }
        });
        filtroBusquedaNumConf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtroBusquedaNumConfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroBusquedaNumConfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelFiltrosLayout = new javax.swing.GroupLayout(panelFiltros);
        panelFiltros.setLayout(panelFiltrosLayout);
        panelFiltrosLayout.setHorizontalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroBusquedaNombTC, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroBusquedaNumConf, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelFiltrosLayout.setVerticalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addComponent(filtroBusquedaNumConf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelFiltrosLayout.createSequentialGroup()
                                .addComponent(filtroBusquedaNombTC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel1))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(590, 590, 590)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonDetalleConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModificarConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(panelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonVerificar)
                                .addComponent(botonMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonDetalleConfiguracion))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(ModificarConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
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
    
    
    public void tablaConfiguracion(String codTC,String codNumConf) { //Método de la tabla que se muestra en la interfaz
       
       
        
        List<DTOTipoConfiguracionGrilla> lista = null;
         int codnumConf;
            try{
             codnumConf = Integer.parseInt(codNumConf);
            }catch(Exception e){
              codnumConf = 0;
            }
         int codtc;   
            try{
             codtc = Integer.parseInt(codTC);
            }catch(Exception e){
              codtc = 0;
            }    
        
        lista = controlador.filtroConfiguracion(codtc,codnumConf);
        DTOTipoConfiguracionGrilla[] ordenarCTC = new DTOTipoConfiguracionGrilla[lista.size()];
        ordenarCTC = lista.toArray(ordenarCTC);
        
        for (int i = 0; i < ordenarCTC.length - 1; i++) {            
            for (int j = 0; j < ordenarCTC.length - 1; j++) { //Ordeno de adentro hacia afuera
                        if (ordenarCTC[j].getNroConfig() > ordenarCTC[j + 1].getNroConfig()) {
                            DTOTipoConfiguracionGrilla temp = ordenarCTC[j + 1];
                            ordenarCTC[j + 1] = ordenarCTC[j];
                            ordenarCTC[j] = temp;
                        }                   
                    if (ordenarCTC[j].getFechaInicioVigencia().before(ordenarCTC[j + 1].getFechaInicioVigencia())) {
                        DTOTipoConfiguracionGrilla fecha = ordenarCTC[j+1];
                        ordenarCTC[j + 1] = ordenarCTC[j];
                        ordenarCTC[j] = fecha;
                    } 
                if (ordenarCTC[j].getCodTipoCaso() > ordenarCTC[j + 1].getCodTipoCaso()) { 
                    DTOTipoConfiguracionGrilla nCodTC = ordenarCTC[j+1];
                    ordenarCTC[j + 1] = ordenarCTC[j];
                    ordenarCTC[j] = nCodTC;
                }
            }   
        }
        tablaConfiguraciones = new DefaultTableModel();
        tablaConfiguracionCaso.setModel(tablaConfiguraciones);
        
          //Cada una  de las sentencias es una columna en la tabla modelo que instanciamos
        tablaConfiguraciones.addColumn("Cod. Tipo Caso");//que Luego esta tabla le setteamos para mostrar en modelo de la interfaz
        tablaConfiguraciones.addColumn("Nomb. Tipo Caso");
        tablaConfiguraciones.addColumn("Num Config. TC");
        tablaConfiguraciones.addColumn("Fecha Inicio Vigencia");
        tablaConfiguraciones.addColumn("Fecha Fin Vigencia");
        tablaConfiguraciones.addColumn("Fecha Verificacion");

        tablaConfiguracionCaso.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tablaConfiguracionCaso.getTableHeader().setBackground(new Color(172, 202, 221));

        tablaConfiguracionCaso.getTableHeader().setReorderingAllowed(false);
 
        for(MouseListener listener : tablaConfiguracionCaso.getTableHeader().getMouseListeners()){
            tablaConfiguracionCaso.getTableHeader().removeMouseListener(listener);
        }

        for (int i = 0; i < ordenarCTC.length; i++) {
            Vector fil = new Vector();
        fil.add(ordenarCTC[i].getCodTipoCaso());
        fil.add(ordenarCTC[i].getNombreTipoCaso());
        fil.add(ordenarCTC[i].getNroConfig());
        fil.add(ordenarCTC[i].getFechaInicioVigencia());
            if(ordenarCTC[i].getFechaFinVigencia() != null){
                fil.add(ordenarCTC[i].getFechaFinVigencia());   
            }else{
                fil.add("Vigente");    
            }
            if(ordenarCTC[i].getFechaVerificacion()!= null){
                fil.add(ordenarCTC[i].getFechaVerificacion());
            }else{
                fil.add("Sin verificar");    
            }            
        tablaConfiguraciones.addRow(fil);
      }
    }
   
    
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        //Método para volver
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonVolverActionPerformed

    private void ModificarConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarConfiguracionActionPerformed
        //Método para modificar
        int filaSeleccionada = tablaConfiguracionCaso.getSelectedRow();
        
        if (filaSeleccionada == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningún configuración para modificar");
        }else {           
            for (int i = 0; i < tablaConfiguracionCaso.getRowCount(); i++) { //Recorremos la tabla
                
                if(filaSeleccionada == i){
                    if (tablaConfiguracionCaso.getValueAt(i, 4) == "Vigente" && tablaConfiguracionCaso.getValueAt(i, 5) != "Sin verificar" ) {             
                        ErrorMensaje.setForeground(Color.RED);
                        ErrorMensaje.setText("La Configuración Tipo Caso seleccionada ya está verificada, no se puede modificar");           
                    }else if( tablaConfiguracionCaso.getValueAt(i, 4) != "Vigente"){                   
                        ErrorMensaje.setForeground(Color.RED);

                        ErrorMensaje.setText("La Configuración Tipo Caso seleccionada está dada de baja, no se puede modificar");   
                    }else {
                        if (filaSeleccionada == i) {              
                            int codConfSelecc = (int)tablaConfiguracionCaso.getValueAt(i, 2);  
                            ModificarConfigTipoCaso mod = new ModificarConfigTipoCaso(codConfSelecc);                      
                            mod.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }            
        }
    }//GEN-LAST:event_ModificarConfiguracionActionPerformed

    private void filtroBusquedaNombTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroBusquedaNombTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroBusquedaNombTCActionPerformed

    private void filtroBusquedaNombTCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroBusquedaNombTCKeyPressed
      /*  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tablaTI(filBusqueda.getText());
        }*/
    }//GEN-LAST:event_filtroBusquedaNombTCKeyPressed

    private void filtroBusquedaNombTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroBusquedaNombTCKeyReleased
        tablaConfiguracion(filtroBusquedaNombTC.getText(),filtroBusquedaNumConf.getText());

    }//GEN-LAST:event_filtroBusquedaNombTCKeyReleased

    private void AgregarCTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCTCActionPerformed
        //Metodo para agregar un Tipo instancia
        AltaConfiguracionTipocaso agregar = new AltaConfiguracionTipocaso();
        agregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarCTCActionPerformed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
       int numTabSec = tablaConfiguracionCaso.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
       
        if (numTabSec == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningúna Configuracion para mostrar");
        } else  {
            for (int i = 0; i < tablaConfiguracionCaso.getRowCount(); i++) { //Recorremos la tabla
//                
                if (numTabSec == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo                    
                    int codConfMostrar = (int) (tablaConfiguracionCaso.getValueAt(i, 2));
                    VerDatosConfiguracion verVerifica = new VerDatosConfiguracion(0, codConfMostrar );
                    verVerifica.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void botonDetalleConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetalleConfiguracionActionPerformed
        int filaSeleccionada = tablaConfiguracionCaso.getSelectedRow();
        if (filaSeleccionada == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningúna configuración para trabajar");
        }else {
            for (int i = 0; i < tablaConfiguracionCaso.getRowCount(); i++) { //Recorremos la tabla
                
                
              if(filaSeleccionada==i){
                if (tablaConfiguracionCaso.getValueAt(i, 4) == "Vigente" && tablaConfiguracionCaso.getValueAt(i, 5) != "Sin verificar" ) {             
                        ErrorMensaje.setForeground(Color.RED);
                        ErrorMensaje.setText("La Configuración Tipo Caso seleccionada ya está verificada, no se puede agregar detalle");           
                }else if( tablaConfiguracionCaso.getValueAt(i, 4) != "Vigente"){                   
                        ErrorMensaje.setForeground(Color.RED);
                        ErrorMensaje.setText("La Configuración Tipo Caso seleccionada está dada de baja, no se puede agregar detalle"); 
                }else{  
                    if (filaSeleccionada == i) {              
                        int codConfSelecc = (int)tablaConfiguracionCaso.getValueAt(i, 2);  
                        TrabajarRenglones TConReng = new TrabajarRenglones(codConfSelecc);
                        TConReng.setVisible(true);
                        this.setVisible(false);
                    }

                }
              }

            }
        }
    }//GEN-LAST:event_botonDetalleConfiguracionActionPerformed

    private void botonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerificarActionPerformed
        int numTabSec = tablaConfiguracionCaso.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
       
        if (numTabSec == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningúna Configuracion para Verificar");
        } else  {
            for (int i = 0; i < tablaConfiguracionCaso.getRowCount(); i++) { //Recorremos la tabla
              if(numTabSec==i){
                if (tablaConfiguracionCaso.getValueAt(i, 4) == "Vigente" && tablaConfiguracionCaso.getValueAt(i, 5) != "Sin verificar" ) {             
                        ErrorMensaje.setForeground(Color.RED);
                        ErrorMensaje.setText("La Configuración Tipo Caso seleccionada ya está verificada, no se puede verificar");           
                }else if( tablaConfiguracionCaso.getValueAt(i, 4) != "Vigente"){                   
                        ErrorMensaje.setForeground(Color.RED);
                        ErrorMensaje.setText("La Configuración Tipo Caso seleccionada está dada de baja, no se puede verificar"); 
                }else{  
                    if (numTabSec == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo                    
                        int codConfMostrar = (int) (tablaConfiguracionCaso.getValueAt(i, 2));
                        VerDatosConfiguracion verVerifica = new VerDatosConfiguracion(1, codConfMostrar );
                        verVerifica.setVisible(true);
                        this.setVisible(false);
                    }
                }
              }
            }
        
        }
    }//GEN-LAST:event_botonVerificarActionPerformed

    private void ErrorMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorMensajeActionPerformed

    private void filtroBusquedaNumConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroBusquedaNumConfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroBusquedaNumConfActionPerformed

    private void filtroBusquedaNumConfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroBusquedaNumConfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroBusquedaNumConfKeyPressed

    private void filtroBusquedaNumConfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroBusquedaNumConfKeyReleased
        tablaConfiguracion(filtroBusquedaNombTC.getText(), filtroBusquedaNumConf.getText());
    }//GEN-LAST:event_filtroBusquedaNumConfKeyReleased

    
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
            java.util.logging.Logger.getLogger(ABMConfiguracionTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMConfiguracionTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMConfiguracionTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMConfiguracionTipoCaso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMConfiguracionTipoCaso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCTC;
    private javax.swing.JTextField ErrorMensaje;
    private javax.swing.JButton ModificarConfiguracion;
    private javax.swing.JButton botonDetalleConfiguracion;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JButton botonVerificar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField filtroBusquedaNombTC;
    private javax.swing.JTextField filtroBusquedaNumConf;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFiltros;
    private javax.swing.JTable tablaConfiguracionCaso;
    private javax.swing.JLabel textTitulo;
    // End of variables declaration//GEN-END:variables

}
