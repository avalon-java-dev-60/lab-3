/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo;

import javax.ejb.Local;

/**
 *
 * @author java
 */
@Local
public interface DemoBeanLocal {
    String a();
    
    boolean login(String login, String psw);
    
    String getMessage();
}
