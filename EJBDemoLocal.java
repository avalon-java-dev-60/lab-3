/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author MultatulyIM
 */
@Local
public interface EJBDemoLocal {
    boolean login (String login, String psw);
    String getMessage(String login);
}
