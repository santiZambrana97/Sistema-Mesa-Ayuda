
package Interfaces.ABMConfiguracionTipoCaso;

import Controller.ControladorConfiguracionTipoCaso;
import DTO.DTOsConfiguración.DTOErroresMensajes;
import DTO.DTOsConfiguración.DTORenglones;
import DTO.DTOsConfiguración.DTOTrabajarRenglones;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leand
 */
public class TrabajarRenglones extends javax.swing.JFrame {

    ControladorConfiguracionTipoCaso control = new ControladorConfiguracionTipoCaso();
    DefaultTableModel tablaRenglones;

    int codConfig = 0;

    public TrabajarRenglones(int codConfSelecc) {

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Detalle Configuración");
        DTOTrabajarRenglones dtorenglo = control.buscarRenglones(codConfSelecc);
        nroConfigCaso.setText(Integer.toString(dtorenglo.getCodConfSelecc()));
        tablaConRenglones(dtorenglo.getTipoCtipoIns());
        codConfig = codConfSelecc;
        tablaRenglones.fireTableDataChanged();
    }

    public TrabajarRenglones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inputcodTI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputcodTI2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        inputcodTI3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputcodTI4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        volverABMAgregar = new javax.swing.JButton();
        confirmarAgregar = new javax.swing.JButton();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPanel3 = new javax.swing.JPanel();
        volverABMAgregar3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnAgregarRenglon = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTrabajarRenglon = new javax.swing.JTable();
        btnModificarRenglon = new javax.swing.JButton();
        btnDarBajaRenglon = new javax.swing.JButton();
        botonMostrarDatos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nroConfigCaso = new javax.swing.JTextField();
        ErrorMensaje = new javax.swing.JTextField();

        jPanel5.setBackground(new java.awt.Color(119, 148, 166));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jLabel10.setText("AGREGAR CONFIGURACIÓN TIPO CASO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RENGLÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        inputcodTI.setBorder(null);
        inputcodTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTIActionPerformed(evt);
            }
        });
        inputcodTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTIKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Orden TCTI:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Minutos Máxima Iteracion: ");

        inputcodTI2.setBorder(null);
        inputcodTI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTI2ActionPerformed(evt);
            }
        });
        inputcodTI2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTI2KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Agregar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Cod. Tipo Instancia:");

        inputcodTI3.setBorder(null);
        inputcodTI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTI3ActionPerformed(evt);
            }
        });
        inputcodTI3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTI3KeyTyped(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Nombre Tipo Instancia:");

        inputcodTI4.setBorder(null);
        inputcodTI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTI4ActionPerformed(evt);
            }
        });
        inputcodTI4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTI4KeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(28, 28, 28)
                                    .addComponent(inputcodTI3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(48, 48, 48)
                                    .addComponent(inputcodTI4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputcodTI2)
                                        .addComponent(inputcodTI))))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputcodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(inputcodTI2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(inputcodTI4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(inputcodTI3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        volverABMAgregar.setBackground(new java.awt.Color(204, 204, 204));
        volverABMAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABMAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABMAgregar.setMnemonic('v');
        volverABMAgregar.setText("Volver");
        volverABMAgregar.setBorder(null);
        volverABMAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        volverABMAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMAgregarActionPerformed(evt);
            }
        });

        confirmarAgregar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarAgregar.setMnemonic('c');
        confirmarAgregar.setText("Confirmar");
        confirmarAgregar.setBorder(null);
        confirmarAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        confirmarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAgregarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        volverABMAgregar3.setBackground(new java.awt.Color(204, 204, 204));
        volverABMAgregar3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABMAgregar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABMAgregar3.setMnemonic('v');
        volverABMAgregar3.setText("Volver");
        volverABMAgregar3.setBorder(null);
        volverABMAgregar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        volverABMAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMAgregar3ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojonegro.png"))); // NOI18N
        labelTituloMostrar.setText("TRABAJAR CON DETALLE DE CONFIGURACIÓN");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelTituloMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelTituloMostrar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Renglones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregarRenglon.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarRenglon.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarRenglon.setText("Agregar");
        btnAgregarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRenglonActionPerformed(evt);
            }
        });

        tablaTrabajarRenglon = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaTrabajarRenglon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaTrabajarRenglon);

        btnModificarRenglon.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarRenglon.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarRenglon.setText("Modificar");
        btnModificarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRenglonActionPerformed(evt);
            }
        });

        btnDarBajaRenglon.setBackground(new java.awt.Color(255, 255, 255));
        btnDarBajaRenglon.setForeground(new java.awt.Color(0, 0, 0));
        btnDarBajaRenglon.setText("Eliminar");
        btnDarBajaRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaRenglonActionPerformed(evt);
            }
        });

        botonMostrarDatos.setBackground(new java.awt.Color(255, 255, 255));
        botonMostrarDatos.setForeground(new java.awt.Color(0, 0, 0));
        botonMostrarDatos.setText("Mostrar Datos");
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnAgregarRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnModificarRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnDarBajaRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botonMostrarDatos)
                .addGap(67, 67, 67))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRenglon)
                    .addComponent(btnModificarRenglon)
                    .addComponent(btnDarBajaRenglon)
                    .addComponent(botonMostrarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración a trabajar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("Nro. Configuración:");

        nroConfigCaso.setEditable(false);
        nroConfigCaso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nroConfigCaso.setForeground(new java.awt.Color(0, 0, 0));
        nroConfigCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroConfigCasoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nroConfigCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nroConfigCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        nroConfigCaso.getAccessibleContext().setAccessibleName("");

        ErrorMensaje.setEditable(false);
        ErrorMensaje.setBackground(new java.awt.Color(204, 204, 204));
        ErrorMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ErrorMensaje.setBorder(null);
        ErrorMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorMensajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverABMAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ErrorMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volverABMAgregar3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaConRenglones(List<DTORenglones> listaRenglones) {
        DTORenglones[] ordenarTrabajarConRenglones = new DTORenglones[listaRenglones.size()];
        ordenarTrabajarConRenglones = listaRenglones.toArray(ordenarTrabajarConRenglones);
        
        
        for (int i = 0; i < ordenarTrabajarConRenglones.length - 1; i++) {
            
            for (int j = 0; j < ordenarTrabajarConRenglones.length - 1; j++) { 
                if (ordenarTrabajarConRenglones[j].ordenTCTI > ordenarTrabajarConRenglones[j + 1].ordenTCTI) {
                   
                    DTORenglones temp = ordenarTrabajarConRenglones[j + 1];
                    ordenarTrabajarConRenglones[j + 1] = ordenarTrabajarConRenglones[j];
                    ordenarTrabajarConRenglones[j] = temp;
                  
                }
            }
        }
        
        tablaRenglones = new DefaultTableModel();
        tablaTrabajarRenglon.setModel(tablaRenglones);

        tablaRenglones.addColumn("Orden TCTI");  //Cada una  de las sentencias es una columna en la tabla modelo que instanciamos
        tablaRenglones.addColumn("Minutos Max.");//que Luego esta tabla le setteamos para mostrar en modelo de la interfaz
        tablaRenglones.addColumn("Cod. Tipo Instancia");
        tablaRenglones.addColumn("Nombre Tipo Instancia");

        tablaTrabajarRenglon.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tablaTrabajarRenglon.getTableHeader().setBackground(new Color(172, 202, 221));

        tablaTrabajarRenglon.getTableHeader().setReorderingAllowed(false);
 
        for(MouseListener listener : tablaTrabajarRenglon.getTableHeader().getMouseListeners()){
        tablaTrabajarRenglon.getTableHeader().removeMouseListener(listener);
        }
        

        for (int i = 0; i < ordenarTrabajarConRenglones.length; i++) {
            Vector fil = new Vector();
            fil.add(ordenarTrabajarConRenglones[i].getOrdenTCTI());
            fil.add(ordenarTrabajarConRenglones[i].getMinutosMAXReso());
            fil.add(ordenarTrabajarConRenglones[i].getCodTI());
            fil.add(ordenarTrabajarConRenglones[i].getNombreTI());
            tablaRenglones.addRow(fil);
        }
    }


    private void volverABMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregarActionPerformed
        /*    //Botón para volver al menú de TipoInstancia
        ABMTipoInstancia abmTI = new ABMTipoInstancia();

        abmTI.setVisible(true);
        abmTI.tablaTI("");
        this.setVisible(false);*/
    }//GEN-LAST:event_volverABMAgregarActionPerformed

    private void confirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAgregarActionPerformed
       
    }//GEN-LAST:event_confirmarAgregarActionPerformed

    private void inputcodTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTIActionPerformed

    private void inputcodTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        /*    if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }//GEN-LAST:event_inputcodTIKeyTyped

    private void inputcodTI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTI2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI2ActionPerformed

    private void inputcodTI2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTI2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI2KeyTyped

    private void inputcodTI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTI3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI3ActionPerformed

    private void inputcodTI3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTI3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI3KeyTyped

    private void inputcodTI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTI4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI4ActionPerformed

    private void inputcodTI4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTI4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTI4KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModificarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRenglonActionPerformed
          // Boton modificar renglon
        int numTabSec = tablaTrabajarRenglon.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
       
        if (numTabSec == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningúna Configuracion para modificar");
        } else  {
            for (int i = 0; i < tablaTrabajarRenglon.getRowCount(); i++) { //Recorremos la tabla
//                
                if (numTabSec == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo                    
                    int codConfMostrar = (int) (tablaTrabajarRenglon.getValueAt(i, 0));
                    
                    
                    int ordenTCTISelec = (int) (tablaTrabajarRenglon.getValueAt(i, 0));
                    ModificarRenglon modificarRenglon = new ModificarRenglon(Integer.parseInt(nroConfigCaso.getText()), ordenTCTISelec);
                    modificarRenglon.setVisible(true);
                    this.setVisible(false);
                }
            }       
        }
    }//GEN-LAST:event_btnModificarRenglonActionPerformed

    private void btnDarBajaRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaRenglonActionPerformed
        int numTabSec = tablaTrabajarRenglon.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec
        DTOErroresMensajes dtoE = new DTOErroresMensajes();
        if (numTabSec == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningúna Configuracion para eliminar");
        } else {
            for (int i = 0; i < tablaTrabajarRenglon.getRowCount(); i++) { //Recorremos la tabla
//                
                if (numTabSec == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo                    
                    int numConfig, nroOrden;
                    numConfig = codConfig;
                    nroOrden = (int) (tablaTrabajarRenglon.getValueAt(i, 0));
                    int j = JOptionPane.showConfirmDialog(this, ""
                            + "¿Está seguro que desea confirmar la baja? \n\n"
                            + "Orden: " + (int) tablaTrabajarRenglon.getValueAt(i, 0) + "\n"
                            + "Minutos: " + tablaTrabajarRenglon.getValueAt(i, 1) + "\n"
                            + "Cod Tipo Instancia: " + tablaTrabajarRenglon.getValueAt(i, 2) + "\n"
                            + "Nombre Tipo Instancia: " + tablaTrabajarRenglon.getValueAt(i, 3) + "\n\n",
                             "Dar de baja detalle", JOptionPane.YES_NO_OPTION);
                    if(j == 0){
                        dtoE = control.eliminarRenglon(numConfig, nroOrden);
                        if (dtoE.getVerificarError() == 0) {
                            //    JOptionPane.showMessageDialog(null, "Se elimino el renglón");                
                            TrabajarRenglones trabajar = new TrabajarRenglones(codConfig);
                            this.setVisible(false);
                            tablaRenglones.fireTableDataChanged();
                            trabajar.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, dtoE.getErrorMensaje());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDarBajaRenglonActionPerformed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed
//        Mostrar datos
        int numTabSec = tablaTrabajarRenglon.getSelectedRow();//Almacenamos el numero de la columna en la variable numTabSec

        if (numTabSec == -1) {
            ErrorMensaje.setForeground(Color.RED); //Este sentencia le asigna el color rojo al texto
            ErrorMensaje.setText("No ha seleccionado ningúna Configuracion para mostrar");
        } else {
            for (int i = 0; i < tablaTrabajarRenglon.getRowCount(); i++) { //Recorremos la tabla
//                
                if (numTabSec == i) { //comparamos de que el numero almacenado en numTabSec sea igual al numero del arreglo                    
                    int ordenTCTISelec = (int) (tablaTrabajarRenglon.getValueAt(i, 0));

                    PrevisualizarRenglon verRenglon = new PrevisualizarRenglon(Integer.parseInt(nroConfigCaso.getText()), ordenTCTISelec);
                    verRenglon.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void nroConfigCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroConfigCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroConfigCasoActionPerformed

    private void volverABMAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregar3ActionPerformed
        ABMConfiguracionTipoCaso abm = new ABMConfiguracionTipoCaso();
        abm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverABMAgregar3ActionPerformed

    private void btnAgregarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRenglonActionPerformed
        // Boton agregar renglon  

        AgregarRenglon agregarRenglon = new AgregarRenglon(codConfig);
        agregarRenglon.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAgregarRenglonActionPerformed

    private void ErrorMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorMensajeActionPerformed

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
            java.util.logging.Logger.getLogger(TrabajarRenglones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrabajarRenglones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrabajarRenglones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrabajarRenglones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrabajarRenglones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ErrorMensaje;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JButton btnAgregarRenglon;
    private javax.swing.JButton btnDarBajaRenglon;
    private javax.swing.JButton btnModificarRenglon;
    private javax.swing.JButton confirmarAgregar;
    private javax.swing.JTextField inputcodTI;
    private javax.swing.JTextField inputcodTI2;
    private javax.swing.JTextField inputcodTI3;
    private javax.swing.JTextField inputcodTI4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JTextField nroConfigCaso;
    private javax.swing.JTable tablaTrabajarRenglon;
    private javax.swing.JButton volverABMAgregar;
    private javax.swing.JButton volverABMAgregar3;
    // End of variables declaration//GEN-END:variables

}
