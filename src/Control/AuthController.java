package Control;

import Model.UserAccount;
import Database.UserAccounts;
//public class AuthController implements Utils.Observer {

public class AuthController {

    public void onLoginRequested(String username, String password) {
    }

    public UserAccount getCurrentUserRole() {
        return null;
    }

//    @Override
//    public void onNotify(Object obj) {
//        Login((UserAccount) obj);
//    }
    public boolean login(String username, String password) {
        boolean loginresult = UserAccounts.getInstance().login(username, password);
        if (loginresult) {
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }
        return loginresult;
    }

    boolean signup(String username, String password, String role) {
        return UserAccounts.getInstance().signup(username, password, role);
    }
}
