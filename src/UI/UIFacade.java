/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Control.ControlFacade;
import Model.UserAccount;

/**
 *
 * @author abdullah
 */
public class UIFacade {

    private static UIFacade instance;

    private UIFacade() {
    }

    public static UIFacade getInstance() {
        if (instance == null) {
            instance = new UIFacade();
        }
        return instance;
    }

    public boolean signup(String username, String password, String role) {
        return ControlFacade.getInstance().singup(username, password, role);
    }   

    public boolean login(String username, String password) {
        return ControlFacade.getInstance().login(username, password);
    }
}
