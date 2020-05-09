/*
 * Login class which holds three String attributes: username, password, and id
 */
package cs444project.domain;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class Login {
    private String username = "";
    private String password = "";
    private String id = "";
    private String email = "";

    public Login() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Login)) return false;
        Login login = (Login)obj;
        if (!this.username.equals(login.getUsername())) return false;
        if (!this.password.equals(login.getPassword())) return false;
        return true;
    }
    
//    public boolean isEmailValid(String email) {
//        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
//        return email.matches(regex);
//    }
    
    public boolean validateLogin() {
        //USERNAME
        if (username == null || username.equals("") || username.length() < 8 || username.length() > 10) {
            return false;
        }
        //PASSWORD
        if (password == null || password.equals("") || password.length() < 8 || password.length() > 10 || password.matches(username)) {
            return false;
        }
        //EMAIL
//        if (email == null || email.equals("") || !isEmailValid(email)) {
//            System.out.println("FOOEY: NOT A VALID EMAIL. PLEASE TRY AGAIN");
//            return false;
//        }
        return true;
    }
    
}
