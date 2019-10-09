/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class Bills {

       public static void insertBill(entity.Bill b,ArrayList<entity.BillDetail> details){
        try {
            Connection con = null;
            con = DataInteraction.getConnect();
            String sql = "insert into Bills values(?,?,?,?,?,?,?,?)";
            PreparedStatement cs = con.prepareStatement(sql);
            cs.setString(1, b.getSaleID());
            cs.setString(2, b.getDate());
            cs.setFloat(3, b.getDisCount());
            cs.setFloat(4, b.getVAT());
            cs.setString(5, b.getPayment());
            cs.setFloat(6, b.getTotal());
            cs.setInt(7, b.getCustomerID());
            cs.setBoolean(8, b.isStatus());
            cs.executeUpdate();
            b.setBillID(DataInteraction.topid());
            DataInteraction.exec("update Customers set Purchased=Purchased+" + b.getTotal() + " where CustomerID=" + b.getCustomerID());
            for (entity.BillDetail od : details) {
                interact.BillDetails.insertBillDetail(b, od);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bills.class.getName()).log(Level.SEVERE, null, ex);
        }
   
     
       }
 public static ArrayList<entity.Bill> getAll() {
        try {
            Connection conn = DataInteraction.getConnect();
            PreparedStatement pst = conn.prepareStatement("select * from Bills");
            ResultSet rs = pst.executeQuery();

            ArrayList<entity.Bill> bills = new ArrayList<entity.Bill>();
            while(rs.next()) {
                entity.Bill b = new entity.Bill();
                b.setBillID(rs.getInt("BillID"));
                b.setSaleID(rs.getString("AdminID"));
                b.setDate(String.valueOf(rs.getDate("Date")));
                b.setDisCount(rs.getFloat("Discount"));
                b.setVAT(rs.getFloat("VAT"));
                b.setPayment(rs.getString("Payment"));
                b.setTotal(rs.getFloat("Total"));
                b.setCustomerID(rs.getInt("CustomerID"));
                b.setStatus(rs.getBoolean("Status"));
                bills.add(b);

            }
                 return bills;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
            return new ArrayList<entity.Bill>();
        }

    }
}
