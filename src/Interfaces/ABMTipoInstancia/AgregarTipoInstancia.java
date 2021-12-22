package Interfaces.ABMTipoInstancia;

import DTO.DTOsTipoInstancia.DTOAgregarTipoInstancia;
import Controller.ControladorABMTipoInstancia;
import DTO.DTOsConfiguración.DTOLupitaTipoCaso;
import DTO.DTOsTipoInstancia.*;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class AgregarTipoInstancia extends javax.swing.JFrame {

    DTOAgregarTipoInstancia dtoTI = new DTOAgregarTipoInstancia();
    DTOErrorMensajes dtoErrores = new DTOErrorMensajes();
    ControladorABMTipoInstancia control = new ControladorABMTipoInstancia();

    public AgregarTipoInstancia() { //Constructor de la clase

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Agregar Tipo Instancia");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confirmarAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputcodTI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputnombTI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputcodSec = new javax.swing.JTextField();
        volverABMAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputcodTT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        outnombSec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        outnombTT = new javax.swing.JTextField();
        botonbuscarSector = new javax.swing.JButton();
        botonbuscarTipoTarea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        confirmarAgregar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmarAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarAgregar.setMnemonic('c');
        confirmarAgregar.setText("Confirmar");
        confirmarAgregar.setBorder(null);
        confirmarAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        confirmarAgregar.setPreferredSize(new java.awt.Dimension(120, 36));
        confirmarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAgregarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_add_black_18dp.png"))); // NOI18N
        jLabel5.setText("AGREGAR TIPO INSTANCIA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(32, 32, 32))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Cod. Tipo Instancia:");

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

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre Tipo Instancia:");

        inputnombTI.setBorder(null);
        inputnombTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputnombTIKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Cod. Sector:");

        inputcodSec.setBorder(null);
        inputcodSec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputcodSecFocusLost(evt);
            }
        });
        inputcodSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodSecActionPerformed(evt);
            }
        });
        inputcodSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodSecKeyTyped(evt);
            }
        });

        volverABMAgregar.setBackground(new java.awt.Color(204, 204, 204));
        volverABMAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABMAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABMAgregar.setMnemonic('v');
        volverABMAgregar.setText("Volver");
        volverABMAgregar.setBorder(null);
        volverABMAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        volverABMAgregar.setPreferredSize(new java.awt.Dimension(120, 36));
        volverABMAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMAgregarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Cod. Tipo Tarea:");

        inputcodTT.setBorder(null);
        inputcodTT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputcodTTFocusLost(evt);
            }
        });
        inputcodTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTTActionPerformed(evt);
            }
        });
        inputcodTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTTKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Nombre Sector:");

        outnombSec.setEditable(false);
        outnombSec.setBackground(new java.awt.Color(153, 153, 153));
        outnombSec.setBorder(null);
        outnombSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outnombSecActionPerformed(evt);
            }
        });
        outnombSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outnombSecKeyTyped(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Nombre Tipo Tarea:");

        outnombTT.setEditable(false);
        outnombTT.setBackground(new java.awt.Color(153, 153, 153));
        outnombTT.setBorder(null);
        outnombTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outnombTTActionPerformed(evt);
            }
        });
        outnombTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outnombTTKeyTyped(evt);
            }
        });

        botonbuscarSector.setBackground(new java.awt.Color(119, 148, 166));
        botonbuscarSector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N
        botonbuscarSector.setBorder(null);
        botonbuscarSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarSectorActionPerformed(evt);
            }
        });

        botonbuscarTipoTarea.setBackground(new java.awt.Color(119, 148, 166));
        botonbuscarTipoTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_search_black_18dp.png"))); // NOI18N
        botonbuscarTipoTarea.setBorder(null);
        botonbuscarTipoTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarTipoTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                            .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(outnombSec, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputnombTI, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputcodTI, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(inputcodTT, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonbuscarTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(inputcodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonbuscarSector, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outnombTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputcodTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputnombTI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputcodSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscarSector, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outnombSec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputcodTT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscarTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(outnombTT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
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

    private void confirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAgregarActionPerformed
        //Método para agregar un Tipo de Instancia 
        try {
            if (!inputcodTI.getText().isEmpty()) { //Para que no sea vacio código 
                if (!inputnombTI.getText().isEmpty()) {//Para que el nombre del TI no este vacio
                    if (!inputcodSec.getText().isEmpty()) { //Para que no sea vacio el cod de sector
                        if (!inputcodTT.getText().isEmpty()) { //Para que el cod de Tarea no sea vacio
                            do {
                                DTOAgregarTipoInstancia dtoAgregar = new DTOAgregarTipoInstancia();
                                dtoAgregar.setCodTipoInstancia(Integer.parseInt(inputcodTI.getText()));
                                dtoAgregar.setNombreTipoInstancia(inputnombTI.getText());
                                dtoAgregar.setCodSector(Integer.parseInt(inputcodSec.getText()));
                                dtoAgregar.setNombreSector(outnombSec.getText());
                                dtoAgregar.setCodTipoTarea(Integer.parseInt(inputcodTT.getText()));
                                dtoAgregar.setNombreTipoTarea(outnombTT.getText());
                                dtoErrores = control.agregarTipoInstancia(dtoAgregar);

                                if (dtoErrores.getVerificarError() == 0) {//si el mensaje de error del dto es 0(no hubo error) grabamos los datos
                                    ABMTipoInstancia volver = new ABMTipoInstancia(); //Oculto la pagina para dar de alta volviendo al menu de Sector                                                                                                                    
                                    JOptionPane.showMessageDialog(this, "El Tipo Instancia fue creado con éxito");
                                    volver.setVisible(true);
                                    volver.tablaTI("", "");
                                    this.setVisible(false);
                                    

                                } else {
                                    JOptionPane.showMessageDialog(this, dtoErrores.getErrorMensaje(),"Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                                    dtoErrores.setVerificarError(0);
                                }
                            } while (dtoErrores.getVerificarError() != 0);

                            //y un chatch en el caso que no se pueda crear el Tipo Instancia
                        } else {
                            JOptionPane.showMessageDialog(this, "Por favor ingrese el código del Tipo Tarea", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Por favor ingrese el código del Sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre del Tipo Instancia", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor ingrese el código del Tipo Instancia", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_confirmarAgregarActionPerformed


    private void inputcodTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTIActionPerformed

    private void inputcodTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite números", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputcodTIKeyTyped

    private void inputnombTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputnombTIKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACK_SPACE) && (car == (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_inputnombTIKeyTyped

    private void inputcodSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodSecKeyTyped
        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite números", "Mensaje de Error Código", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputcodSecKeyTyped

    private void volverABMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregarActionPerformed
        //Botón para volver al menú de TipoInstancia
        ABMTipoInstancia abmTI = new ABMTipoInstancia();

        abmTI.setVisible(true);
        abmTI.tablaTI("", "");
        this.setVisible(false);
    }//GEN-LAST:event_volverABMAgregarActionPerformed

    private void inputcodTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTTKeyTyped
        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite números", "Mensaje de Error Código", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputcodTTKeyTyped

    private void outnombSecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombSecKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecKeyTyped

    private void inputcodTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTTActionPerformed

    }//GEN-LAST:event_inputcodTTActionPerformed

    private void outnombTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombTTActionPerformed

    private void outnombTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombTTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombTTKeyTyped

    private void outnombSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecActionPerformed

    private void inputcodSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodSecActionPerformed
    public void MostrarSectorFil(int filSector) {
//        if(filSector){
//        }
        /* List<DTOTipoInstancia> lista = control.filtradoSector(filSector);
        for (int i = 0; i < lista.size(); i++) {
           DTOAgregarTipoInstancia tI = (DTOAgregarTipoInstancia) lista.get(i);
           outnombSec.setText(tI.getNombreSector());
        }*/
        
       String nombreSector = control.buscarNombSector(filSector);
        if (nombreSector == "No se encontró el Sector") {
            outnombSec.setText("");
            outnombSec.setForeground(Color.red);
            outnombSec.setText(nombreSector);
            JOptionPane.showMessageDialog(this, "No se encontró el Sector, ingrese otro código","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else if (nombreSector == "El Sector ingresado está dado de baja") {
            outnombSec.setText("");
            outnombSec.setForeground(Color.red);
            outnombSec.setText(nombreSector);
            JOptionPane.showMessageDialog(this, nombreSector,"Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            outnombSec.setText("");
            outnombSec.setForeground(Color.black);
            outnombSec.setText(nombreSector);
        }
    }
    private void inputcodSecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputcodSecFocusLost
        if (!inputcodSec.getText().isEmpty()) {
            MostrarSectorFil(Integer.parseInt(inputcodSec.getText()));
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_inputcodSecFocusLost

    private void inputcodTTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputcodTTFocusLost
        if (!inputcodTT.getText().isEmpty()) {
            MostrarTTFil(Integer.parseInt(inputcodTT.getText()));
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el código tipo tarea", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inputcodTTFocusLost

    private void botonbuscarSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarSectorActionPerformed
        List<DTOLupaBuscarSector> listaSectores = control.buscarLupitaSector();
        
        DTOLupaBuscarSector[] ordenarTC = new DTOLupaBuscarSector[listaSectores.size()];
        ordenarTC = listaSectores.toArray(ordenarTC);
        
        
        for (int i = 0; i < ordenarTC.length - 1; i++) {
            
            for (int j = 0; j < ordenarTC.length - 1; j++) { 
                if (ordenarTC[j].getCodigoSector()> ordenarTC[j + 1].getCodigoSector()) {
                   
                    DTOLupaBuscarSector temp = ordenarTC[j + 1];
                    ordenarTC[j + 1] = ordenarTC[j];
                    ordenarTC[j] = temp;
                  
                }
            }
        }
         
        String mensaje= "Listado de Sectores \n\n ";
        
        for(int i=0; i< listaSectores.size(); i++){           
            mensaje +=  "Codigo Sector: "+ ordenarTC[i].getCodigoSector()+ ", Nombre Sector: "+ ordenarTC[i].getNombreSector() + "\n\n" ;                
        }
        
        JOptionPane.showMessageDialog(this, mensaje, "Lista de Sectores", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonbuscarSectorActionPerformed

    private void botonbuscarTipoTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarTipoTareaActionPerformed
        List<DTOLupaBuscarTarea> listaTarea = control.buscarLupitaTarea();
        
        DTOLupaBuscarTarea[] ordenarTC = new DTOLupaBuscarTarea[listaTarea.size()];
        ordenarTC = listaTarea.toArray(ordenarTC);
        
        
        for (int i = 0; i < ordenarTC.length - 1; i++) {
            
            for (int j = 0; j < ordenarTC.length - 1; j++) { 
                if (ordenarTC[j].getCodigoTarea()> ordenarTC[j + 1].getCodigoTarea()) {
                   
                    DTOLupaBuscarTarea temp = ordenarTC[j + 1];
                    ordenarTC[j + 1] = ordenarTC[j];
                    ordenarTC[j] = temp;
                  
                }
            }
        }
        
        String mensaje= "Listado de Tipo Tarea \n\n";
        
        for(int i=0; i< listaTarea.size(); i++){           
            mensaje +=  "Código Tipo Tarea: "+ ordenarTC[i].getCodigoTarea()+ ", Nombre Tipo Tarea: "+ ordenarTC[i].getNombreTarea()+ "\n\n" ;                
        }
        
        JOptionPane.showMessageDialog(this, mensaje, "Lista de Tipo Tarea", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonbuscarTipoTareaActionPerformed

    public void MostrarTTFil(int nombreTT) {
        /*  List<DTOTipoInstancia> lista = control.filtradoTT(nombreTT);
        for (int i = 0; i < lista.size(); i++) {
           DTOAgregarTipoInstancia tI = (DTOAgregarTipoInstancia) lista.get(i);
           outnombTT.setText(tI.getNombreTipoTarea());
         }*/

       String nombreTipoT = control.buscarNombTipoTarea(nombreTT);
        if (nombreTipoT == "No se encontró el Tipo Tarea") {
            outnombTT.setText("");
            outnombTT.setForeground(Color.red);
            outnombTT.setText(nombreTipoT);
            JOptionPane.showMessageDialog(this, "No se encontró el Tipo Tarea, ingrese otro código","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else if (nombreTipoT == "El Tipo Tarea ingresado está dado de baja") {
            outnombTT.setText("");
            outnombTT.setForeground(Color.red);
            outnombTT.setText(nombreTipoT);
            JOptionPane.showMessageDialog(this, nombreTipoT,"Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            outnombTT.setText("");
            outnombTT.setForeground(Color.black);
            outnombTT.setText(nombreTipoT);
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
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTipoInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscarSector;
    private javax.swing.JButton botonbuscarTipoTarea;
    private javax.swing.JButton confirmarAgregar;
    private javax.swing.JTextField inputcodSec;
    private javax.swing.JTextField inputcodTI;
    private javax.swing.JTextField inputcodTT;
    private javax.swing.JTextField inputnombTI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField outnombSec;
    private javax.swing.JTextField outnombTT;
    private javax.swing.JButton volverABMAgregar;
    // End of variables declaration//GEN-END:variables
}
