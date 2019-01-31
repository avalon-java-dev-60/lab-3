/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author Victor.Malmygin
 */
@Stateful
public class EJBDemoBean implements EJBDemoBeanLocal {

    private String login;
    private String psw;
    private boolean status;
    private int count;
    
    @PostConstruct
    private void init(){
        login = "user";
        psw = "psw";
        status = false;
        count = 0;
    }

    @Override
    public boolean login(String login, String psw) {
        if (this.login.equals(login) && this.psw.equals(psw)){
            status = true;
        }else{
            status = false;
        }
        return status;
    }

    @Override
    public String getMessage(String login) {
        if (status == true && count < 3){
            if(count++ == 0){
                return "Hello " + this.login + "!";
            }else{
                return "you are still here " + count;
            }
            
        }else{
            status = false;
            count = 0;
            return "Access Denied. status = " + status;
        }
    }
}
