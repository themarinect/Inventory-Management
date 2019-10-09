/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;


/**
 *
 * @author Bach Ngoc  Toan
 */
public class Bill {
            private int billID;
            private String saleID;
            private String date;
            private float disCount;
            private float VAT;
            private String payment;
            private float total;
            private int customerID;
            private boolean status;

    public Bill() {
    }

    public Bill(int billID, String saleID, String date, float disCount, float VAT, String payment, float total, int customerID, boolean status) {
        this.billID = billID;
        this.saleID = saleID;
        this.date = date;
        this.disCount = disCount;
        this.VAT = VAT;
        this.payment = payment;
        this.total = total;
        this.customerID = customerID;
        this.status = status;
    }

    public float getVAT() {
        return VAT;
    }

    public void setVAT(float VAT) {
        this.VAT = VAT;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDisCount() {
        return disCount;
    }

    public void setDisCount(float disCount) {
        this.disCount = disCount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getSaleID() {
        return saleID;
    }

    public void setSaleID(String saleID) {
        this.saleID = saleID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

   

      

}
