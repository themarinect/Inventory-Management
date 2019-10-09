/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interact;

import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class Categories {
    public static boolean insertCategory(entity.Category ct){
        String sql = "insert into Categories values(?)";
        try {
            PreparedStatement ps = interact.DataInteraction.getConnect().prepareCall(sql);
           // ps.setInt(1, ct.getCategoryID());
            ps.setString(1,ct.getCategoryName());
            JOptionPane.showMessageDialog(null, "Insert Category successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
            return (ps.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static boolean editCategory(entity.Category EC){
        String sql = "update Categories set CategoryName=? where CategoryID=?";
        try {
            PreparedStatement ps = interact.DataInteraction.getConnect().prepareCall(sql);
            ps.setString(1,EC.getCategoryName() );
            ps.setInt(2,EC.getCategoryID());
            JOptionPane.showMessageDialog(null, "Update Category successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
            return (ps.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static void deleteCategory(int ID){
        String sql = "delete from Categories where CategoryID ="+ID;
        java.sql.Statement st;

        try {
            st = interact.DataInteraction.getConnect().createStatement();
            st.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Detele Category successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ArrayList<entity.Category> getAll()
    {
        ArrayList<entity.Category> list=new ArrayList<entity.Category>();
       ResultSet rs=DataInteraction.queryResultSet("select * from Categories");
        try {
            while (rs.next()) {
                entity.Category c = new Category(rs.getInt("CategoryID"),rs.getString("CategoryName"));
                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
    }
}
