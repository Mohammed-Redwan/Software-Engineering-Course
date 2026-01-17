/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author abdullah
 */
public class UserAccount implements Serializable {

    private int useId;
    private String username;
    private String password;
    private String role;
    private static final long serialVersionUID = 1L;

    public UserAccount(String username, String password, String role) {
        this.password = password;
        this.username = username;
        this.role = role;
    }

    public void login() {
    }

    public void logout() {
    }

    public void checkRole() {
    }

    public void validateCredentails() {
    }

    /**
     * @return the useId
     */
    public int getUseId() {
        return useId;
    }

    /**
     * @param useId the useId to set
     */
    public void setUseId(int useId) {
        this.useId = useId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        UserAccount account1 = (UserAccount) obj;

        return (account1.getPassword().equals(this.getPassword()) && account1.getUsername().equals(this.getUsername()));
    }

}
