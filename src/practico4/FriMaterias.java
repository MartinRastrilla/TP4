/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico4;

import javax.swing.JOptionPane;
import static practico4.Colegio.materias;

/**
 *
 * @author Martin
 */
public class FriMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form friMaterias
     */
    public FriMaterias() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        butGuardar = new javax.swing.JButton();
        tfNameMateria = new javax.swing.JTextField();
        txtAnioMateria = new javax.swing.JLabel();
        tfAnioMateria = new javax.swing.JTextField();
        butNuevo = new javax.swing.JButton();
        butSalir = new javax.swing.JButton();
        txtFormMateria = new javax.swing.JLabel();
        tfCodMateria = new javax.swing.JTextField();
        txtCodMateria = new javax.swing.JLabel();
        txtNameMateria = new javax.swing.JLabel();

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        butGuardar.setBackground(new java.awt.Color(51, 51, 51));
        butGuardar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        butGuardar.setText("Guardar");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        tfNameMateria.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tfNameMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameMateriaActionPerformed(evt);
            }
        });

        txtAnioMateria.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtAnioMateria.setForeground(new java.awt.Color(255, 255, 255));
        txtAnioMateria.setText("A??o de la Materia:");

        tfAnioMateria.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tfAnioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnioMateriaActionPerformed(evt);
            }
        });

        butNuevo.setBackground(new java.awt.Color(51, 51, 51));
        butNuevo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        butNuevo.setText("Nuevo");
        butNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNuevoActionPerformed(evt);
            }
        });

        butSalir.setBackground(new java.awt.Color(51, 51, 51));
        butSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        butSalir.setText("Salir");
        butSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalirActionPerformed(evt);
            }
        });

        txtFormMateria.setBackground(new java.awt.Color(255, 0, 51));
        txtFormMateria.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtFormMateria.setForeground(new java.awt.Color(255, 255, 255));
        txtFormMateria.setText("Formulario de Materias");
        txtFormMateria.setToolTipText("");
        txtFormMateria.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        tfCodMateria.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tfCodMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodMateriaActionPerformed(evt);
            }
        });

        txtCodMateria.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtCodMateria.setForeground(new java.awt.Color(255, 255, 255));
        txtCodMateria.setText("Codigo de Materia:");

        txtNameMateria.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtNameMateria.setForeground(new java.awt.Color(255, 255, 255));
        txtNameMateria.setText("Nombre de la Materia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txtFormMateria)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tfAnioMateria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNameMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNameMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFormMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNameMateria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAnioMateria)
                    .addComponent(txtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butGuardar)
                    .addComponent(butNuevo)
                    .addComponent(butSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAnioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnioMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnioMateriaActionPerformed

    private void butNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNuevoActionPerformed
        tfCodMateria.setText("");
        tfAnioMateria.setText("");
        tfNameMateria.setText("");
    }//GEN-LAST:event_butNuevoActionPerformed

    private void butSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalirActionPerformed
        dispose();
    }//GEN-LAST:event_butSalirActionPerformed

    private void tfCodMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodMateriaActionPerformed

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
        try {
            Colegio.materias.add(new Materia(Integer.parseInt(tfCodMateria.getText()), tfNameMateria.getText(), Integer.parseInt(tfAnioMateria.getText())));
            tfCodMateria.setText("");
            tfAnioMateria.setText("");
            tfNameMateria.setText("");
        } catch (NumberFormatException e) {
            tfCodMateria.setText("");
            tfAnioMateria.setText("");
            JOptionPane.showMessageDialog(null, "Error de tipeo. Caracter en campo num??rico, vuelva a ingresar los datos");
        }

    }//GEN-LAST:event_butGuardarActionPerformed

    private void tfNameMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butGuardar;
    private javax.swing.JButton butNuevo;
    private javax.swing.JButton butSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAnioMateria;
    private javax.swing.JTextField tfCodMateria;
    private javax.swing.JTextField tfNameMateria;
    private javax.swing.JLabel txtAnioMateria;
    private javax.swing.JLabel txtCodMateria;
    private javax.swing.JLabel txtFormMateria;
    private javax.swing.JLabel txtNameMateria;
    // End of variables declaration//GEN-END:variables
}
