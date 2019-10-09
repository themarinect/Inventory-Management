/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interact;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHOIN
 */
public class Administrators {
    public static boolean insertUser(entity.Admin use){
        String sql = "insert into Administrators values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = interact.DataInteraction.getConnect().prepareStatement(sql);
            ps.setString(1, use.getAdminID());
            ps.setString(2, use.getUsername());
            ps.setString(3, use.getPassword());
            ps.setString(4, use.getPhone());
            ps.setString(5, use.getEmail());
            ps.setString(6, use.getRoleID());
            ps.setBoolean(7, use.isSattus());
            return (ps.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Administrators.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static boolean updateUser(entity.Admin use){
        String sql = "update Administrators set Username=?,Password=?,Phone=?,Email=?,RoleID=?,Status=? where AdminID=?";
        try {
            PreparedStatement ps = interact.DataInteraction.getConnect().prepareStatement(sql);
            ps.setString(1, use.getUsername());
            ps.setString(2, use.getPassword());
            ps.setString(3, use.getPhone());
            ps.setString(4, use.getEmail());
            ps.setString(5, use.getRoleID());
            ps.setBoolean(6, use.isSattus());
            ps.setString(7, use.getAdminID());
            return (ps.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Administrators.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static void deleteUser(String strRole){
        String sql="delete from Administrators where AdminID = '" + strRole+"'";
        Statement st;
        try {
            st = interact.DataInteraction.getConnect().createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Administrators.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
