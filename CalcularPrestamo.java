/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalprojects;


import java.awt.Color;
import java.text.DecimalFormat;

public class CalcularPrestamo extends javax.swing.JFrame {

    public static DecimalFormat formatea = new DecimalFormat("###,###.##");
    
    public CalcularPrestamo() {
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

        jLabel1 = new javax.swing.JLabel();
        jlcantidad = new javax.swing.JLabel();
        jtfcantidad = new javax.swing.JTextField();
        jbcalcular = new javax.swing.JButton();
        jtfinteres = new javax.swing.JTextField();
        jlinteres = new javax.swing.JLabel();
        jtfcuotas = new javax.swing.JTextField();
        jlcuotas = new javax.swing.JLabel();
        jtfcuotasmensuales = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtftotal = new javax.swing.JTextField();
        jblimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Calcular Prestamos");

        jlcantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlcantidad.setText("Cantidad a prestar");

        jbcalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbcalcular.setText("Calcular");
        jbcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcalcularActionPerformed(evt);
            }
        });

        jlinteres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlinteres.setText("Interes mensual");

        jlcuotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlcuotas.setText("Cuotas");

        jtfcuotasmensuales.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cuotas mensuales");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Total a pagar");

        jtftotal.setEditable(false);

        jblimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jblimpiar.setText("Limpiar");
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlcuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfcuotas)
                                .addComponent(jlinteres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfinteres, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfcantidad)
                                    .addGap(15, 15, 15))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jbcalcular)
                                .addGap(18, 18, 18)
                                .addComponent(jblimpiar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfcuotasmensuales)
                                    .addComponent(jLabel3)
                                    .addComponent(jtftotal))
                                .addGap(56, 56, 56))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlcantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlinteres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfinteres, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfcuotasmensuales, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtftotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jlcuotas)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfcuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbcalcular)
                        .addComponent(jblimpiar)))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcalcularActionPerformed
        // TODO add your handling code here:        
        if (jtfcantidad.getText().equals("")) {
            jlcantidad.setForeground(Color.red);
            valid = false;
        }
        if (jtfinteres.getText().equals("")) {
            jlinteres.setForeground(Color.red);
            valid = false;
        }
        if (jtfcuotas.getText().equals("")) {
            jlcuotas.setForeground(Color.red);
            valid = false;
        }
        
        if (valid) {
            
            jlcantidad.setForeground(Color.black);
            jlinteres.setForeground(Color.black);
            jlcuotas.setForeground(Color.black);
            
            cantidad = Double.parseDouble(jtfcantidad.getText());
            interes = Double.parseDouble(jtfinteres.getText());
            cuotas = Integer.parseInt(jtfcuotas.getText());
            total = cantidad;
            
            cuotaMensual = cantidad/cuotas;
            interes = interes/100;
            
            for (int i = 0; i < cuotas; i++) {
                cantidad = cantidad + (interes*cantidad);
                cantidad = cantidad-cuotaMensual;
            }
            
            total = cantidad+total;
            cantidad = cantidad/cuotas;
            
            jtfcuotasmensuales.setText(String.valueOf(formatea.format(cantidad+cuotaMensual)));
            jtftotal.setText(String.valueOf(formatea.format(total)));
        }
    }//GEN-LAST:event_jbcalcularActionPerformed

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        // TODO add your handling code here:
        jtfcantidad.setText("");
        jtfinteres.setText("");
        jtfcuotas.setText("");
        jtfcuotasmensuales.setText("");
        jtftotal.setText("");
    }//GEN-LAST:event_jblimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    double cantidad, interes, cuotaMensual, total;
    int cuotas;
    boolean valid = true;
    
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
            java.util.logging.Logger.getLogger(CalcularPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbcalcular;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JLabel jlcantidad;
    private javax.swing.JLabel jlcuotas;
    private javax.swing.JLabel jlinteres;
    private javax.swing.JTextField jtfcantidad;
    private javax.swing.JTextField jtfcuotas;
    private javax.swing.JTextField jtfcuotasmensuales;
    private javax.swing.JTextField jtfinteres;
    private javax.swing.JTextField jtftotal;
    // End of variables declaration//GEN-END:variables
}
