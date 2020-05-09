/*
 * Account class which holds a firstName, lastName, a login, and an id
 */
package cs444project.domain;

import java.util.*;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class Account {
    private String firstName = "";
    private String lastName = "";
    private Login login = null;
    private int id = 0;
    private String email = "";
    private char specialChar[] = {'@'};
    
    
    private List<Donation> donations = new LinkedList<Donation>();
    private int nextId = 0;
    
    public Donation add(Donation donation) {
        donation.setId(nextId++);
        donations.add(donation);
        return donation;
    }
    
    public Account() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Referenced code from: https://www.tutorialspoint.com/validate-email-address-in-java
     * @param email
     * @return 
     */
    public boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean validateAccount() {
        if (firstName == null || firstName.equals("") || 
                firstName.length() <= 1 || firstName.length() > 10 || 
                !Character.isUpperCase(firstName.charAt(0))) {
            return false;
        }
        if (lastName == null || lastName.equals("") || lastName.length() <= 1 || 
                lastName.length() > 10 || 
                !Character.isUpperCase(lastName.charAt(0))) {
            return false;
        }
        
        if (email == null || email.equals("") || !isEmailValid(email)) {
            return false;
        }
        if (login == null || !login.validateLogin()){
            return false;
        }
        return true;
    }
    
    public List<Donation> getDonations() { 
        return donations;
    }

    
}
