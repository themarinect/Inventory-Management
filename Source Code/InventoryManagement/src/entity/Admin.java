/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author KHOI
 */
public class Admin {
    private String AdminID;
    private String Username;
    private String Password;
    private String Phone;
    private String Email;
    private String RoleID;
    private Boolean Status;
    public Admin(){
        
    }

    

    public Admin(String AdminID, String Username, String Password, String Phone, String Email,String RoleID, Boolean Status) {
        this.AdminID = AdminID;
        this.Username = Username;
        this.Password = Password;
        this.Phone = Phone;
        this.Email = Email;
        this.RoleID=RoleID;
        this.Status = Status;
    }

    public String getAdminID() {
        return AdminID;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone() {
        return Phone;
    }
    public String getUsername() {
        return Username;
    }

    public boolean isSattus() {
        return Status;
    }

    public void setAdminID(String AdminID) {
        this.AdminID = AdminID;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String RoleID) {
        this.RoleID = RoleID;
    }
    
    
}
