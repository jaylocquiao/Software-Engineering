/*
 * AccountSvcCacheImpl class that implements interface: IAccountSvc
 */
package cs444project.service;

import cs444project.domain.*;
import java.util.*;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class AccountSvcCacheImpl implements IAccountSvc {
    private List<Account> cache = new ArrayList<>();
    private int nextId = 0;

    private AccountSvcCacheImpl() {
    }
    
    private static AccountSvcCacheImpl instance = new AccountSvcCacheImpl();
    
    public static AccountSvcCacheImpl getInstance() {
        return instance;
    }
    
    @Override
    public Account create(Account account) {
        account.setId(nextId++); //used to be ++nextId
        cache.add(account);
        return account;
    }

    @Override
    public List<Account> retrieveAll() {
        return cache;
    }
    
    @Override
    public Account update(Account account) {
        for (int i = 0; i <cache.size(); i++) {
            Account next = cache.get(i);
            if (next.getId() == account.getId()) {
                cache.set(i, account);
                break;
            }
        }
        return account;
    }

    @Override
    public Account delete(Account account) {
        for (int i = 0; i < cache.size(); i++) {
            Account next = cache.get(i);
            if (next.getId() == account.getId()) {
                cache.remove(i);
                break;
            }
        }
        return account;
    }
    
    public Account authenticate(Login login) {
        Account account = null;
        for (int i = 0; i < cache.size(); i++) {
            account = cache.get(i);
            Login accountLogin = account.getLogin();
            if (login.equals(accountLogin)) return account; 
        }
        return null; 
    }
}
