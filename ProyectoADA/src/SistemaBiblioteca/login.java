/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBiblioteca;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class login extends javax.swing.JFrame {
    /**
     * Creates new form Panel
     */
    Interface main_panel = new Interface();
    public login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_user = new javax.swing.JTextField();
        login_pass = new javax.swing.JPasswordField();
        iniciar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Sistema de Inventario de Biblioteca");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        login_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_userActionPerformed(evt);
            }
        });
        jPanel1.add(login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, -1));

        login_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_passActionPerformed(evt);
            }
        });
        jPanel1.add(login_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, -1));

        iniciar_sesion.setText("Iniciar Sesion");
        iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_userActionPerformed

    private void login_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_passActionPerformed

    private void iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesionActionPerformed
        // TODO add your handling code here:
        String username=login_user.getText();
        String password=login_pass.getText();
        if("jhoan".equals(username)&&"1234".equals(password)){
            JOptionPane.showMessageDialog(null, "Sesion iniciada");
            this.dispose();
            main_panel.setVisible(true);
        }
        else if("alexis".equals(username)&&"1234".equals(password)){
            JOptionPane.showMessageDialog(null, "Sesion iniciada");
            this.dispose();
            main_panel.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }//GEN-LAST:event_iniciar_sesionActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField login_pass;
    private javax.swing.JTextField login_user;
    // End of variables declaration//GEN-END:variables
}
