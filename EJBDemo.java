/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateful;

/**
 *
 * @author MultatulyIM
 */
@Stateful
public class EJBDemo implements EJBDemoLocal {
    private String log = "unreg";
    private int count = 0;

    @Override
    public boolean login(String login, String psw) {
        if (login.equals("user") && psw.equals("pass")) {
            log = "reg";
//            count++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getMessage(String login) {
        if (log.equals("reg")) {
            count++;
            if (count == 3) {
                log = "unreg";
                count = 0;
            } 
            return "Hello, user";
        } else {
            return "Error! User not registred!";
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
