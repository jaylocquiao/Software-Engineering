/*Displays History of Donation Creation via Date*/
package cs444project.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class History {
    private String date = "xxxx/xx/xx";
    
    //private String date = "";

    //private String date = "2011/20/19";
    private String donationName = "";
    private String time;

    public History() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDonationName() {
        return donationName;
    }

    public void setDonationName(String donationName) {
        this.donationName = donationName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    public boolean validateHistory() {
        if (donationName == null || donationName.equals("") || donationName.length() > 11) {
            return false;
        }
        if (date.charAt(4) == '/' && date.charAt(7) == '/') {
            if (date.contains("2019")) {
                if (date.charAt(5) == '1' && (date.charAt(6) == '3' || 
                        date.charAt(6) == '4') || date.charAt(6) == '5' || 
                        date.charAt(6) == '6' || date.charAt(6) == '7' || 
                        date.charAt(6) == '8' || date.charAt(6) == '9') {
                    return false;
                } else if (date.charAt(5) == '2' || date.charAt(5) == '3' || 
                        date.charAt(5) == '4' || date.charAt(5) == '5' || 
                        date.charAt(5) == '6' || date.charAt(5) == '7' || 
                        date.charAt(5) == '8' || date.charAt(5) == '9') {
                    return false;
                } else {
                    if (date.charAt(8) == '3' && (date.charAt(9) == '2' || 
                            date.charAt(9) == '3' || date.charAt(9) == '4' || 
                            date.charAt(9) == '5' || date.charAt(9) == '6' || 
                            date.charAt(9) == '7' || date.charAt(9) == '8' || 
                            date.charAt(9) == '9') ) {
                        return false;
                    } else {
                        return true;
                    }
                }
            } else {
                return false;
            }
            
        } else if (date == null) {
            return false;
        } else {
            return true;
        }
        
    }
    
}
