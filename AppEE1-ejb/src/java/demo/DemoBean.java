package demo;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author java
 */
@Local({I.class}) //теперь метод b() доступен локальным клиентам
@Stateless
public class DemoBean implements DemoBeanLocal, I {
    private String login = "ella";
    private String psw = "111";
    private boolean status = false;
    private int count = 1;
    private String message = "Standart message №";
    private String warn = "You are not registred";
    
    @Override
    public String a() {
        return "Hello";
    }
    
    public boolean login(String login, String psw) {
        if(login.equals(this.login) & psw.equals(this.psw)) {
            status = true;
            return true;
        }
        status = false;
        return false;
    }
    
    public String getMessage() {
        if(status & count <3) {
        String message = this.message + count;
        ++count;
        return message;
        }
        status = false;
        count = 0;
        return warn;
    }
    public int b() {
        return 123;
    }
}
