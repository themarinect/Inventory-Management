/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmInventoryManager.java
 *
 * Created on May 29, 2009, 8:58:57 PM
 */

package gui;

import interact.DataInteraction;
import interact.GUIInteraction;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class frmInventoryManager extends javax.swing.JInternalFrame {

    /** Creates new form frmInventoryManager */
    public frmInventoryManager() {
        initComponents();
        getStatus();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalCate = new javax.swing.JTextField();
        txtTotalItems = new javax.swing.JTextField();
        txtSold = new javax.swing.JTextField();
        txtItemAvaliable = new javax.swing.JTextField();
        txtItemNotAvaliable = new javax.swing.JTextField();
        btnViewPreviousDay = new javax.swing.JButton();
        btnViewItemNotAvaliable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtInputQuantity = new javax.swing.JTextField();
        txtMoneyTranstract = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnUpdateQuantity = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Inventory Manager");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Manager");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(199, 199, 199)
                .add(jLabel1)
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventory Status"));

        jLabel2.setText("Total categories:");

        jLabel3.setText("Total items:");

        jLabel4.setText("Items avaliale:");

        jLabel5.setText("Item not avaliable:");

        jLabel6.setText("Sold previous day::");

        txtTotalCate.setEditable(false);

        txtTotalItems.setEditable(false);

        txtSold.setEditable(false);

        txtItemAvaliable.setEditable(false);

        txtItemNotAvaliable.setEditable(false);

        btnViewPreviousDay.setText("View");
        btnViewPreviousDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPreviousDayActionPerformed(evt);
            }
        });

        btnViewItemNotAvaliable.setText("View");
        btnViewItemNotAvaliable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemNotAvaliableActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel3)
                            .add(jLabel4)
                            .add(jLabel6)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtItemAvaliable)
                            .add(txtTotalItems)
                            .add(txtTotalCate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtSold, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel5)
                        .add(18, 18, 18)
                        .add(txtItemNotAvaliable)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnViewItemNotAvaliable)
                    .add(btnViewPreviousDay))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtTotalCate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtTotalItems, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtItemAvaliable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(13, 13, 13)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(txtItemNotAvaliable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnViewItemNotAvaliable))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtSold, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnViewPreviousDay))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Items"));

        jLabel8.setText("Quantity update:");

        txtMoneyTranstract.setEditable(false);

        jLabel9.setText("Money transtract previousday:");

        btnUpdateQuantity.setText("Update");
        btnUpdateQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateQuantityActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel8)
                    .add(jLabel9))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtMoneyTranstract)
                    .add(txtInputQuantity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(btnUpdateQuantity)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtInputQuantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8)
                    .add(btnUpdateQuantity))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtMoneyTranstract, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        jLabel7.setText("List items not avaliable:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel7)
                .addContainerGap(686, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 13, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel7)
                        .add(2, 2, 2)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewItemNotAvaliableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemNotAvaliableActionPerformed
        String sql="select * from V_Items where QuantityAvailable<0";
        try {
            interact.GUIInteraction.readToTable(sql, tblList);
        } catch (SQLException ex) {
            Logger.getLogger(frmInventoryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewItemNotAvaliableActionPerformed

    private void btnViewPreviousDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPreviousDayActionPerformed
        String sql="select * from V_ItemsSoldPreviousDay";
        try {
            interact.GUIInteraction.readToTable(sql, tblList);
        } catch (SQLException ex) {
            Logger.getLogger(frmInventoryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewPreviousDayActionPerformed

    private void btnUpdateQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQuantityActionPerformed
        if(!interact.CheckForm.isNumberic(txtInputQuantity.getText()))
        {
            JOptionPane.showMessageDialog(this,"Invalid fomat");
            return;
        }
        int row=tblList.getSelectedRow();
        String itemID=tblList.getValueAt(row,0).toString();
        String sql="update Items set QuantityAvailable="+Integer.valueOf(txtInputQuantity.getText())+" where ItemID='"+itemID+"'";
        Statement st;
        try {
            st = DataInteraction.getConnect().createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(frmInventoryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showMessageDialog(this,"Update quantity successful");
    }//GEN-LAST:event_btnUpdateQuantityActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        int row=tblList.getSelectedRow();
        txtInputQuantity.setText(String.valueOf(tblList.getValueAt(row,3)));
        
    }//GEN-LAST:event_tblListMouseClicked
    private void getStatus()
    {
        int totalCate=GUIInteraction.countQuantity("select count(*) as c from Categories");
        txtTotalCate.setText(String.valueOf(totalCate));
        int totalItem=GUIInteraction.countQuantity("select count(*) as c from Items");
        txtTotalItems.setText(String.valueOf(totalItem));
        int itemAvaliable=GUIInteraction.countQuantity("select sum(QuantityAvailable) as Total from Items");
        txtItemAvaliable.setText(String.valueOf(itemAvaliable));
        int itemNotAvaliable=GUIInteraction.countQuantity("select sum(QuantityAvailable) as Total from Items where QuantityAvailable<0");
        txtItemNotAvaliable.setText(String.valueOf(itemNotAvaliable));
        int sold=GUIInteraction.countQuantity("select * from V_SoldPreviousDay");
        txtSold.setText(String.valueOf(sold));
        double moneyTranstract=GUIInteraction.countQuantity("select sum(Total) as Total from Bills where datediff(dd,Date,getdate())=1");
        txtMoneyTranstract.setText(String.valueOf(moneyTranstract));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateQuantity;
    private javax.swing.JButton btnViewItemNotAvaliable;
    private javax.swing.JButton btnViewPreviousDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtInputQuantity;
    private javax.swing.JTextField txtItemAvaliable;
    private javax.swing.JTextField txtItemNotAvaliable;
    private javax.swing.JTextField txtMoneyTranstract;
    private javax.swing.JTextField txtSold;
    private javax.swing.JTextField txtTotalCate;
    private javax.swing.JTextField txtTotalItems;
    // End of variables declaration//GEN-END:variables

}
