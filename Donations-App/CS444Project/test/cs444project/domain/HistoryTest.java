/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.domain;

import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ce-Jay Locquiao
 */
public class HistoryTest {
    
    public HistoryTest() {
    }

    @Test
    public void testValidate() throws ParseException {
        History history = new History();
        boolean result = history.validateHistory();
        assertFalse(result);
        
        history.setDonationName("money"); //correct
        result = history.validateHistory();
        assertFalse(result);
        
        history.setDonationName("moneymoneymoney");
        result = history.validateHistory();
        assertFalse(result);
        
        history.setDonationName("asdfghjklz"); //incorrect
        result = history.validateHistory();
        assertFalse(result);
        
        history.setDate("2040/13/01"); //incorrect
        result = history.validateHistory();
        assertFalse(result);
        
        history.setDate("2019/12/01"); //correct
        result = history.validateHistory();
        assertTrue(result);
        
        
    }
    
}
