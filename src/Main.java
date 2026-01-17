
import UI.LoginUI;
import UI.RegisterUI;
import UI.MainView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abdullah
 */
public class Main {

    public static void main(String[] args) {
        RegisterUI signupUI = new RegisterUI();
        LoginUI loginUI = new LoginUI();
        MainView mainView = new MainView();
        signupUI.setLoginUI(loginUI);
        loginUI.setSignupUI(signupUI);
        loginUI.setMainView(mainView);
        mainView.setLoginUI(loginUI);
        loginUI.setVisible(true);
    }
}
