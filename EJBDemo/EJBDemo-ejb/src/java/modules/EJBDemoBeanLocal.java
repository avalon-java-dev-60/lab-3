/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import javax.ejb.Local;

/**
 *
 * @author Victor.Malmygin
 */
@Local
public interface EJBDemoBeanLocal {
    boolean login(String login, String psw);
    String getMessage (String login);
}
