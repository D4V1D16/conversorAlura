/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class conversorMonedas extends javax.swing.JFrame {

    /** Creates new form conversorMonedas */
    public conversorMonedas() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_EleccionMone = new javax.swing.JLabel();
        comboBoxEleccionMon = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldMonto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido al conversor de Monedas");

        lbl_EleccionMone.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lbl_EleccionMone.setText("Elija la moneda que tiene para convertirla");

        comboBoxEleccionMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Pesos a Dolár", "De Pesos a Euro", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolár a Pesos", "De Euro a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos", " " }));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("Ingrese el Monto a Convertir");

        txtFieldMonto.setForeground(new java.awt.Color(204, 204, 255));
        txtFieldMonto.setText("Ingrese el monto");
        txtFieldMonto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtFieldMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldMontoKeyTyped(evt);
            }
        });

        jButton1.setText("Convertir");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonCancelar.setText("Volver Atras");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(65, 65, 65))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 297, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_EleccionMone)
                                    .addComponent(comboBoxEleccionMon, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(116, 116, 116))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_EleccionMone)
                .addGap(18, 18, 18)
                .addComponent(comboBoxEleccionMon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String eleccion = (String)comboBoxEleccionMon.getSelectedItem();
        String texto = txtFieldMonto.getText();
        double valor = 0.00;
        try{
            valor = Double.parseDouble(texto);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        conversionMonedas conversion = new conversionMonedas();
        switch (eleccion) {
            case "De Pesos a Dolár":            
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.copToDollar(valor) + " Dolares");
                break;
            case "De Pesos a Euro":
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.copToEuro(valor) + " Euros");
                break;
            case "De Pesos a Yen":
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.copToYen(valor) + " Yenes");
                break; 
            case "De Pesos a Won Coreano":
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.copToWon(valor) + " Wones");
                break; 
            case "De Dolár a Pesos":
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.dollarToCOP(valor) + " Pesos Colombianos");
                break;
            case "De Euro a Pesos":
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.euroToCOP(valor) + " Pesos Colombianos");
                break;
            case "De Yen a Pesos":
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.yenToCOP(valor) + " Pesos Colombianos");
                break;  
            case "De Won Coreano a Pesos":
                JOptionPane.showMessageDialog(null, "Usted tiene " +  conversion.wonToCOP(valor) + " Pesos Colombianos");
                break;                  
        }
        
        //Opcion si:menu no:Programa Finalizado cancelar:programafinalizado
        int eleccionCuadro = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?",
                "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);   
        
        
        switch (eleccionCuadro) {
            case JOptionPane.YES_OPTION:
                menuPrincipal menuNuevo = new menuPrincipal();
                dispose();
                menuNuevo.setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(rootPane, "Programa Finalizado");
                System.exit(0);
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(rootPane, "Programa Finalizado");
                System.exit(0);
                break;
            
        }
        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        menuPrincipal menu = new menuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    //Metodo para que el campo de conversion de monedas solo acepte numeros
    private void txtFieldMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldMontoKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_txtFieldMontoKeyTyped

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
            java.util.logging.Logger.getLogger(conversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conversorMonedas().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JComboBox<String> comboBoxEleccionMon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_EleccionMone;
    private javax.swing.JTextField txtFieldMonto;
    // End of variables declaration//GEN-END:variables

}
