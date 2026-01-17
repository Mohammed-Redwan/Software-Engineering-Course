/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author abdullah
 */
public class ControlFacade {

    private AuthController authController;
    private static ControlFacade instance;

    private ControlFacade() {
        this.authController = new AuthController();
    }

    public static ControlFacade getInstance() {
        if (instance == null) {
            instance = new ControlFacade();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        return authController.login(username, password);
    }

    public boolean singup(String username, String password, String role) {
        return authController.signup(username, password, role);
    }
}
