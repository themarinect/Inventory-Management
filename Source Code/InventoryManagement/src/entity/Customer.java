/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class Customer {
   private int customerID;
   private String customerName;
   private String address;
   private String phone;
   private String email;
   private boolean gender;
   private boolean status;
   private float purchased;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String address, String phone, String email, boolean gender, boolean status,float purchased) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.status = status;
        this.purchased=purchased;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPurchased() {
        return purchased;
    }

    public void setPurchased(float purchased) {
        this.purchased = purchased;
    }

   
}
