/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entity.Customer;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class Customers extends AbstractTableModel {

    private ArrayList<Customer> customers;
    private final String columnName[]={"ID","Name","Address","Phone","Email","Gender","Status"};
    private final Class columnClass[]={Integer.class,String.class,String.class,String.class,String.class,Boolean.class,Boolean.class};

    public Customers(ArrayList<Customer> customers) {
        this.customers=customers;
    }
    public int getRowCount() {
        return this.customers.toArray().length;
    }

    public int getColumnCount() {
       return columnName.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
           case 1:
              return customers.get(rowIndex).getCustomerID();
           case 2:
               return customers.get(rowIndex).getCustomerName();
           case 3:
               return customers.get(rowIndex).getAddress();
           case 4:
               return customers.get(rowIndex).getPhone();
           case 5:
               return customers.get(rowIndex).getEmail();
           case 6:
               return customers.get(rowIndex).isGender();
           case 7:
               return customers.get(rowIndex).isStatus();
           default:
               return null;
       }
    }

}
