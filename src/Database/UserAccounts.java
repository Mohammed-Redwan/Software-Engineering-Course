/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.UserAccount;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author abdullah
 */
public class UserAccounts {

    private static UserAccounts instance;

    private HashMap<String, UserAccount> users;
    private final String FILE_NAME = "users.ser";

    private UserAccounts() {
        users = new HashMap<>();
        retrieve();
        
    }

    public static UserAccounts getInstance() {
        if (instance == null) {
            instance = new UserAccounts();
        }
        return instance;
    }

    public boolean signup(String username, String password, String role) {
        UserAccount user = new UserAccount(username, password, role);
        UserAccount oldUser = users.putIfAbsent(user.getUsername(), user);
        save();
        return oldUser == null;
        
    }

    public UserAccount getUser(String username) {
        return users.get(username);
    }

    public boolean login(String username, String password) {
        UserAccount user = users.get(username);
        save();
        return user != null && password.equals(user.getPassword());
    }

    public boolean removeUser(String username) {
        return users.remove(username) != null;
    }

    public void save() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(FILE_NAME)
            );
            out.writeObject(users);
            out.close();
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    public void retrieve() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return;
        }

        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(FILE_NAME)
            );
            users = (HashMap<String, UserAccount>) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
