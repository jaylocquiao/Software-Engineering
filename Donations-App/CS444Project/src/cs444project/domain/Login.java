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
    /*Method to Vaidate Login Credentials*/
    public boolean validateLogin() {
        if (username == null || username.equals("") || username.length() < 8 || username.length() > 10) {
            return false;
        }
        if (password == null || password.equals("") || password.length() < 8 || password.length() > 10 || password.matches(username)) {
            return false;
        }
        return true;
    }
    
}
