/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interact;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KHOIN
 */
public class Role {
   public static boolean insertRole(entity.Role rol){
    String sql = "insert into Roles values (?,?)";
        try {
            PreparedStatement ps = interact.DataInteraction.getConnect().prepareCall(sql);
            ps.setString(1, rol.getRoleID());
            ps.setString(2, rol.getRoleName());
           JOptionPane.showMessageDialog(null,"Add data successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
           return (ps.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
   public static boolean editRole (entity.Role r)
   {
        String sql = "update Roles set RoleName=? where RoleID=?";
        try {
            PreparedStatement ps = DataInteraction.getConnect().prepareCall(sql);
            ps.setString(1, r.getRoleName());
            ps.setString(2, r.getRoleID());
           JOptionPane.showMessageDialog(null,"Edit data successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
            return (ps.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   }
   public static void deleteRole(String id )
   {
        String sql = "delete from Roles where RoleID='"+id + "'";
        Statement st;
        try {
            st = interact.DataInteraction.getConnect().createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Delete data successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   /*public static ArrayList<entity.Role> getAll(){
        ArrayList<entity.Role> ls = new ArrayList<entity.Role>();
        ResultSet rs = DataInteraction.queryResultSet("select * from Roles");
        try {
            while (rs.next()) {
                entity.Role r = new entity.Role(rs.getString("RoleID"), rs.getString("RoleName"));
                ls.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Role.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
   }*/
}
