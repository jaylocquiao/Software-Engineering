/*
 * Account SvcCacheImpl Test Unit
 */
package cs444project.service;

import cs444project.domain.Account;
import cs444project.domain.Login;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class AccountSvcCacheImplTest {
    
    public AccountSvcCacheImplTest() {
    }

    @Test
    public void testCRUD() {
        
        //AccountSvcCacheImpl impl = new AccountSvcCacheImpl();
        AccountSvcCacheImpl impl = AccountSvcCacheImpl.getInstance();
        List<Account> accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 0);
        
        Account account = new Account();
        account.setFirstName("John");
        account.setLastName("Doe");
        
        Login login = new Login();
        login.setUsername("jdoe");
        login.setPassword("123456");
        account.setLogin(login);
        
        //testing create
        account = impl.create(account);
        assertNotNull(account);
        assertNotEquals(account.getId(), 0);
        
        //testing retrieveAll
        accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 1);
        
        //testing update
        account.setFirstName("Jane");
        account = impl.update(account);
        accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 1);
        assertEquals(account.getFirstName(), "Jane");
        
        //testing delete
        account = impl.delete(account);
        assertEquals(accounts.size(), 0);
        
        //Account 1
        Account account1 = new Account();
        account1.setFirstName("John");
        account1.setLastName("Doe");
        Login login1 = new Login();
        login1.setUsername("jdoe");
        login1.setPassword("123456");
        account1.setLogin(login1);
        account1 = impl.create(account1);
        assertNotNull(account1);
        
        //Account 2
        Account account2 = new Account();
        account2.setFirstName("Jane");
        account2.setLastName("McDoe");
        Login login2 = new Login();
        login2.setUsername("jmcdoee");
        login2.setPassword("7890");
        account2.setLogin(login1);
        account2 = impl.create(account2);
        assertNotNull(account2);
        
        //Assert
        Login login3 = new Login();
        login3.setUsername("blah");
        login3.setPassword("yada");
        Account authenticatedAccount = impl.authenticate(login3);
        assertNull(authenticatedAccount);
        login3.setUsername("jdoe");
        authenticatedAccount = impl.authenticate(login3);
        assertNull(authenticatedAccount);
        login3.setPassword("123456");
        authenticatedAccount = impl.authenticate(login3);
        assertNotNull(authenticatedAccount);
        login3.setUsername("jmcdoeee");
        authenticatedAccount = impl.authenticate(login3);
        assertNull(authenticatedAccount);
        login3.setPassword("7890");
        authenticatedAccount = impl.authenticate(login3);
        assertNotNull(account2);
    }
    
}
