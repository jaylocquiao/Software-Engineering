/*
 * Account Test Unit
 */
package cs444project.domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class AccountTest {
    
    public AccountTest() {
    }

    @Test
    public void testValidate() {
        Account account = new Account();
        boolean result = account.validateAccount();
        assertFalse(result);
        
        //FIRST NAME
        account.setFirstName("Beau");
        result = account.validateAccount();
        assertFalse(result);
        
        account.setFirstName("cristian");
        result = account.validateAccount();
        assertFalse(result);
        
        //LAST NAME
        account.setLastName("Doee");
        result = account.validateAccount();
        assertFalse(result);
        
        account.setLastName("a");
        result = account.validateAccount();
        assertFalse(result);
        
        
        //LOGIN
        Login login = new Login();
        login.setUsername("jdoeasdf");
        result = account.validateAccount();
        assertFalse(result);
        
        login.setPassword("12345678");
        result = account.validateAccount();
        assertFalse(result);
        
        account.setLogin(login);
        result = account.validateAccount();
        assertFalse(result);
    }
    
}
