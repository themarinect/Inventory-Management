/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author KHOIN
 */
public class Role {
   private String RoleID;
   private String RoleName;
   public Role()
   {
   }

    public Role(String RoleID, String RoleName) {
        this.RoleID = RoleID;
        this.RoleName = RoleName;
    }

    public String getRoleID() {
        return RoleID;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleID(String RoleID) {
        this.RoleID = RoleID;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }
    
}
