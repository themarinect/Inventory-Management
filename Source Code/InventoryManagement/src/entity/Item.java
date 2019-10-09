/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Bach Ngoc  Toan
 */
public class Item {
   private String itemID;
   private String itemName;
   private String unit;
   private int quantity;
   private float price;
   private String dateImport;
   private String manufacture;
   private String descript;
   private int categoryID;
   private boolean status;
   private int sold;

    public Item() {
    }

    public Item(String itemID, String itemName, String unit, int quantity, float price, String dateImport, String manufacture, String descript, int categoryID, boolean status,int sold) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.unit = unit;
        this.quantity = quantity;
        this.price = price;
        this.dateImport = dateImport;
        this.manufacture = manufacture;
        this.descript = descript;
        this.categoryID = categoryID;
        this.status = status;
        this.sold=sold;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getDateImport() {
        return dateImport;
    }

    public void setDateImport(String dateImport) {
        this.dateImport = dateImport;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    
   

}
