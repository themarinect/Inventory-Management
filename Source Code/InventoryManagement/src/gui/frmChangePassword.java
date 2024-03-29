/*
 * frmChangePassword.java
 *
 * Created on May 25, 2009, 4:40 PM
 */

package gui;

import interact.DataInteraction;
import interact.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author  Administrator
 */
public class frmChangePassword extends javax.swing.JInternalFrame {

    /** Creates new form frmChangePassword */
    public frmChangePassword() {
        initComponents();
        lblUsername.setText(Login.getUsername());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtReNewPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jButton1.setText("jButton1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Change your password");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change your password");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(159, 159, 159)
                .add(jLabel1)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Change"));

        jLabel2.setText("Old passworld:");

        btnChange.setText("Change password");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        jLabel3.setText("New password:");

        jLabel4.setText("Confirm Password:");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel5.setText("Username:");

        lblUsername.setText("Usernamehere");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(71, 71, 71)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5)
                    .add(jLabel3)
                    .add(jLabel2)
                    .add(jLabel4))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(btnChange)
                        .add(18, 18, 18)
                        .add(btnCancel))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(49, 49, 49)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtNewPassword)
                            .add(txtOldPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .add(lblUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtReNewPassword))))
                .addContainerGap(141, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(lblUsername))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtOldPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtNewPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(47, 47, 47)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(btnCancel)
                            .add(btnChange)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(txtReNewPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 38, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        try {
            if (!interact.CheckForm.isPwdUsername(txtOldPassword.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter old password");
                return;
            }
            if (!interact.CheckForm.isPwdUsername(txtNewPassword.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter new password");
                return;
            }
            if (!interact.CheckForm.isPwdUsername(txtReNewPassword.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter confirm new password");
                return;
            }
            if (!txtNewPassword.getText().equals(txtReNewPassword.getText())) {
                JOptionPane.showMessageDialog(this, "Confirm new password incorrectly.");
                return;
            }
            char[] strold = txtOldPassword.getPassword();
            char[] strnew = txtReNewPassword.getPassword();
            String old = new String(strold);
            String newpass = new String(strnew);
            String sql = "select * from Administrators where AdminID='" + interact.Login.getAdminID() + "'";
            ResultSet rs = DataInteraction.queryResultSet(sql);
            String dataPass = null;
            while (rs.next()) {
                dataPass=rs.getString("Password");
            }
            if(!old.equals(dataPass))
            {
                JOptionPane.showMessageDialog(this, "Old password incorrectly.");
                return;
            }else
            {
                DataInteraction.exec("update Administrators set Password='"+newpass+"' where AdminID='"+interact.Login.getAdminID()+"'");
                JOptionPane.showMessageDialog(this, "Change password successfully.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JPasswordField txtReNewPassword;
    // End of variables declaration//GEN-END:variables

}
