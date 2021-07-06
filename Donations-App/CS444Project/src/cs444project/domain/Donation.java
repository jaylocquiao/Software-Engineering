/*Donations Field Attribute Setup*/
package cs444project.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class Donation {

    private int id;
    private String donationTitle;
    private String donationType;
    private String donationValue;
    
    DateTimeFormatter dateCreated = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate localDate = LocalDate.now();
    String date = dateCreated.format(localDate);
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDonationTitle() {
        return donationTitle;
    }

    public void setDonationTitle(String donationTitle) {
        this.donationTitle = donationTitle;
    }

    public String getDonationType() {
        return donationType;
    }

    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }

    public String getDonationValue() {
        return donationValue;
    }

    public void setDonationValue(String donationValue) {
        this.donationValue = donationValue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public boolean validateDonation() {
        if (donationTitle.equals("")) {
            return false;
        }
        if (donationType.equals("")) {
            return false;
        }
        if (donationValue.equals("")) {
            return false;
        }
        return true;
    }
}
