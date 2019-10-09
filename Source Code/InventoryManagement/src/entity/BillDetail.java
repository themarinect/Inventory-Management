/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class BillDetail {
   private int billID;
   private String itemID;
   private int quantity;
   private float price;

    public BillDetail() {
    }

    public BillDetail(int billID, String itemID, int quantity, float price) {
        this.billID = billID;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   
}
