/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico4;

/**
 *
 * @author Martin
 */
public class FriInscripcion extends javax.swing.JInternalFrame {

    /**
     * Creates new form friInscripcion
     */
    public FriInscripcion() {
        initComponents();
        llenarCombo();
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
        txtLegajo4 = new javax.swing.JLabel();
        cbElegirAlumno = new javax.swing.JComboBox<>();
        cbElegirMateria = new javax.swing.JComboBox<>();
        txtFormMateria = new javax.swing.JLabel();
        butSalirFormInsc = new javax.swing.JButton();
        butInscripAlumno = new javax.swing.JButton();
        txtLegajo2 = new javax.swing.JLabel();

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        txtLegajo4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtLegajo4.setForeground(new java.awt.Color(255, 255, 255));
        txtLegajo4.setText("Elija un Alumno:");

        cbElegirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElegirAlumnoActionPerformed(evt);
            }
        });

        cbElegirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElegirMateriaActionPerformed(evt);
            }
        });

        txtFormMateria.setBackground(new java.awt.Color(255, 0, 51));
        txtFormMateria.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtFormMateria.setForeground(new java.awt.Color(255, 255, 255));
        txtFormMateria.setText("Formulario de Inscripcion");
        txtFormMateria.setToolTipText("");
        txtFormMateria.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        butSalirFormInsc.setBackground(new java.awt.Color(51, 51, 51));
        butSalirFormInsc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        butSalirFormInsc.setText("Salir");
        butSalirFormInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalirFormInscAlumnoActionPerformed(evt);
            }
        });

        butInscripAlumno.setBackground(new java.awt.Color(51, 51, 51));
        butInscripAlumno.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        butInscripAlumno.setText("Inscripcion");
        butInscripAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInscripAlumnoAlumnoActionPerformed(evt);
            }
        });

        txtLegajo2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtLegajo2.setForeground(new java.awt.Color(255, 255, 255));
        txtLegajo2.setText("Elija una Materia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butInscripAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butSalirFormInsc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLegajo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLegajo4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbElegirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbElegirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(txtFormMateria)))
                        .addGap(41, 41, 41)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFormMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLegajo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbElegirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLegajo4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbElegirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butInscripAlumno)
                    .addComponent(butSalirFormInsc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butInscripAlumnoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInscripAlumnoAlumnoActionPerformed
        Materia materia = (Materia) cbElegirMateria.getSelectedItem();
        Alumno alumno = (Alumno) cbElegirAlumno.getSelectedItem();
        alumno.agregarMaterias(materia);
    }//GEN-LAST:event_butInscripAlumnoAlumnoActionPerformed

    private void butSalirFormInscAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalirFormInscAlumnoActionPerformed
        dispose();
    }//GEN-LAST:event_butSalirFormInscAlumnoActionPerformed

    private void cbElegirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElegirMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbElegirMateriaActionPerformed

    private void cbElegirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElegirAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbElegirAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butInscripAlumno;
    private javax.swing.JButton butSalirFormInsc;
    private javax.swing.JComboBox<Alumno> cbElegirAlumno;
    private javax.swing.JComboBox<Materia> cbElegirMateria;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtFormMateria;
    private javax.swing.JLabel txtLegajo2;
    private javax.swing.JLabel txtLegajo4;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo() {
        for (Materia materia : Colegio.materias) {
            cbElegirMateria.addItem(materia);
        }
        for (Alumno alumno : Colegio.alumnos) {
            cbElegirAlumno.addItem(alumno);
        }
    }
}