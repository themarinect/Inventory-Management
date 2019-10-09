/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interact;

import entity.BillDetail;
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
public class BillDetails {
    public static boolean insertBillDetail(entity.Bill bill,entity.BillDetail detail){
        String sql="insert into BillDetails values(?,?,?,?)";
        try {
            PreparedStatement pst = DataInteraction.getConnect().prepareStatement(sql);
            pst.setInt(1,bill.getBillID());
            pst.setString(2,detail.getItemID());
            pst.setInt(3,detail.getQuantity());
            pst.setFloat(4,detail.getPrice());
            if(pst.executeUpdate()==0)
            {
                return false;
            }
            DataInteraction.exec("update Items set QuantityAvailable=QuantityAvailable-"+detail.getQuantity()+" where ItemID='"+detail.getItemID()+"'");
            DataInteraction.exec("update Items set Sold=Sold+"+detail.getQuantity()+" where ItemID='"+detail.getItemID()+"'");
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
        return true;
    }
    public static ArrayList<entity.BillDetail> getAllByID(int order)
    {
        ArrayList<entity.BillDetail> details=new ArrayList<BillDetail>();
        Connection con=DataInteraction.getConnect();
        try {
            PreparedStatement pst = con.prepareStatement("select * from BillDetails where BillID=?");
            pst.setInt(1, order);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                entity.BillDetail bd=new BillDetail();
                bd.setBillID(rs.getInt("BillID"));
                bd.setItemID(rs.getString("ItemID"));
                bd.setQuantity(rs.getInt("Quantity"));
                bd.setPrice(rs.getFloat("Price"));
                details.add(bd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }
}
