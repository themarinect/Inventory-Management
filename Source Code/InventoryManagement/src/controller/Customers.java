/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interact;

import entity.Customer;
import interact.DataInteraction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class Customers {
    public static boolean  insertCustomer(entity.Customer cus)
    {
        String sql="insert into Customers values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = interact.DataInteraction.getConnect().prepareCall(sql);
            pst.setString(1,cus.getCustomerName());
            pst.setString(2,cus.getAddress());
            pst.setString(3,cus.getPhone());
            pst.setString(4,cus.getEmail());
            pst.setBoolean(5,cus.isGender());
            pst.setBoolean(6, cus.isStatus());
            pst.setFloat(7,cus.getPurchased());
            return (pst.executeUpdate()==1);
        } catch (SQLException ex) {
            /*Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);*/
            return false;
        }

    }
    public static boolean updateCustomer(entity.Customer cus)
    {
            String sql="update Customers set CustomerName=?,Address=?,Phone=?,Email=?,Gender=?,Status=? where CustomerID=?";
        try {
            PreparedStatement pst = interact.DataInteraction.getConnect().prepareCall(sql);
            pst.setString(1,cus.getCustomerName());
            pst.setString(2,cus.getAddress());
            pst.setString(3,cus.getPhone());
            pst.setString(4,cus.getEmail());
            pst.setBoolean(5,cus.isGender());
            pst.setBoolean(6, cus.isStatus());
            pst.setInt(7,cus.getCustomerID());
            return (pst.executeUpdate()==1);
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    //delete
    public static void deleteCustomer(int id)
    {
        String sql="delete from Customers where CustomerID="+id;
        Statement st;
        try {
            st = interact.DataInteraction.getConnect().createStatement();
             st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //get all
    public static ArrayList<entity.Customer> getAll()
    {
        ArrayList<entity.Customer> list=new ArrayList<Customer>();
       ResultSet rs=DataInteraction.queryResultSet("select * from Customers");
        try {
            while (rs.next()) {
                entity.Customer c = new Customer();
                c.setCustomerID(rs.getInt("CustomerID"));
                c.setCustomerName(rs.getString("CustomerName"));
                c.setAddress(rs.getString("Address"));
                c.setPhone(rs.getString("Phone"));
                c.setEmail(rs.getString("Email"));
                c.setGender(rs.getBoolean("Gender"));
                c.setStatus(rs.getBoolean("Status"));
                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
    }
    //get top
    public static ArrayList<entity.Customer> getTops(int top)
    {
        ArrayList<entity.Customer> list=new ArrayList<Customer>();
        String sql="select top "+top+" * from Customers";
       ResultSet rs=DataInteraction.queryResultSet(sql);
        try {
            while (rs.next()) {
                entity.Customer c = new Customer();
                c.setCustomerID(rs.getInt("CustomerID"));
                c.setCustomerName(rs.getString("CustomerName"));
                c.setAddress(rs.getString("Address"));
                c.setPhone(rs.getString("Phone"));
                c.setEmail(rs.getString("Email"));
                c.setGender(rs.getBoolean("Gender"));
                c.setStatus(rs.getBoolean("Status"));
                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
    }
}
