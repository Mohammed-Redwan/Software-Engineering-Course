/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Utils.Observer;
import java.util.List;

/**
 *
 * @author abdullah
 */
public class UserAccountSubmit implements Utils.Subject {

    List<Observer> observers;

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void alert(Object obj) {
        for (Observer o : observers) {
            o.onNotify(obj);
        }
    }
    public void submit(String username, String password)
    {
 
    }

}
