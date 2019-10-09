/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interact;

import entity.Item;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class Items {
   public static boolean insertItem(entity.Item it)
   {
        String sql="insert into Items values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = DataInteraction.getConnect().prepareStatement(sql);
            pst.setString(1,it.getItemID());
            pst.setString(2,it.getItemName());
            pst.setString(3,it.getUnit());
            pst.setInt(4,it.getQuantity());
            pst.setFloat(5,it.getPrice());
            pst.setString(6,it.getDateImport());
            pst.setString(7,it.getManufacture());
            pst.setString(8,it.getDescript());
            pst.setInt(9,it.getCategoryID());
            pst.setBoolean(10,it.isStatus());
            pst.setInt(11,it.getSold());
            return (pst.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
   public static boolean updateItem(entity.Item it)
   {
        String sql="update Items set ItemName=?,Unit=?,QuantityAvailable=?,Price=?,DateImport=?,Manufacture=?,Descript=?,CategoryID=?,Status=? where ItemID=?";
        try {
            PreparedStatement pst = DataInteraction.getConnect().prepareStatement(sql);
            
            pst.setString(1,it.getItemName());
            pst.setString(2,it.getUnit());
            pst.setInt(3,it.getQuantity());
            pst.setFloat(4,it.getPrice());
            pst.setString(5,it.getDateImport());
            pst.setString(6,it.getManufacture());
            pst.setString(7,it.getDescript());
            pst.setInt(8,it.getCategoryID());
            pst.setBoolean(9,it.isStatus());
            pst.setString(10,it.getItemID());
            return (pst.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
   public static void deleteItem(String id)
   {
         String sql="delete from Items where ItemID='"+id+"'";
        Statement st;
        try {
            st = interact.DataInteraction.getConnect().createStatement();
             st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   public static entity.Item getByCode(String code)
   {
     String sql="select * from Items where ItemID=?";
    entity.Item it=null;
        try {
            PreparedStatement pst = DataInteraction.getConnect().prepareStatement(sql);
            pst.setString(1,code);
            ResultSet rsItems=pst.executeQuery();
            if(!rsItems.next())
            {
                return null;
            }
            it=new Item();
            it.setItemID(rsItems.getString("ItemID"));
            it.setItemName(rsItems.getString("ItemName"));
            it.setUnit(rsItems.getString("Unit"));
            it.setQuantity(rsItems.getInt("QuantityAvailable"));
            it.setPrice(rsItems.getFloat("Price"));
            it.setDateImport(String.valueOf(rsItems.getDate("DateImport")));
            it.setManufacture(rsItems.getString("Manufacture"));
            it.setDescript(rsItems.getString("Descript"));
            it.setCategoryID(rsItems.getInt("CategoryID"));
            it.setStatus(rsItems.getBoolean("Status"));
            it.setSold(rsItems.getInt("Sold"));
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
            return it;
   }
}
