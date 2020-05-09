/*
 * IAccountSvc interface
 */
package cs444project.service;

import cs444project.domain.*;
import java.util.*;

/**
 *
 * @author Ce-Jay Locquiao
 */
public interface IAccountSvc {
    public Account create(Account account);
    public List<Account> retrieveAll();
    public Account update(Account account);
    public Account delete(Account account);
    
    public Account authenticate(Login login);
}
