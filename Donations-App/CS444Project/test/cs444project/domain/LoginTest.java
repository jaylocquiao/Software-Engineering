/*
 * Login Test Unit
 */
package cs444project.domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testEquals() {
        Login login1 = new Login();
        login1.setUsername("johndoe");
        login1.setPassword("12345");
        
        Login login2 = new Login();
        login2.setUsername("janedoe");
        login2.setPassword("56789");
        assertFalse(login1.equals(login2));
        
        login2.setUsername("johndoe");
        assertFalse(login1.equals(login2));
        login2.setPassword("12345");
        assertTrue(login1.equals(login2));
        
        Login login3 = new Login();
        login3.setUsername("cejaylocquiao");
        login3.setPassword("sabalberino");
        
        Login login4 = new Login();
        login4.setUsername("catherinelocquiao");
        login4.setPassword("abusabalberino");
        assertFalse(login3.equals(login4));
        
        login4.setUsername("cejaylocquiao");
        assertFalse(login3.equals(login4));
        login4.setPassword("sabalberino");
        assertTrue(login3.equals(login4));
        
        Login login5 = new Login();
        login5.setUsername("cejayloc");
        login5.setPassword("locquiao");
        
        Login login6 = new Login();
        login6.setUsername("catherine");
        login6.setPassword("asdfghjk");
        assertFalse(login5.equals(login6));
        
        login6.setUsername("cejayloc");
        assertFalse(login5.equals(login6));
        login6.setPassword("locquiao");
        assertTrue(login5.equals(login6));
        
        
        
//        //Old Code that might be needed later
//        Login login = new Login();
//        boolean result = login.validateLogin();
//        assertFalse(result);
//        
//        login.setUsername("johndoee"); //8
//        result = login.validateLogin();
//        assertFalse(result);
//        
//        login.setPassword("123456789!"); //10
//        result = login.validateLogin();
//        assertTrue(result);
    }
    
}
