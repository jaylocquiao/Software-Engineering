/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.presentation;

import java.util.*;
import cs444project.domain.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class DonationTableModel extends AbstractTableModel{
    private String [] columnNames = {"Donation Title", "Donation Type", "Donation Value", "Date Created"};
    private List<Donation> donations = new LinkedList<Donation>();

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }    
    
//    public void getDonations(List<Donation> donations) {
//        this.donations = donations;
//    }
    
    @Override
    public int getRowCount() {
        return donations.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        
        Donation donation = donations.get(row);
        switch(column) {
            case 0:
                return donation.getDonationTitle();
            case 1:
                return donation.getDonationType();
            case 2:
                return donation.getDonationValue();
            case 3:
                return donation.getDate();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
}
