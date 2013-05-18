/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import palindromos.Palindromos;

/**
 *
 * @author usuario
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void checkPalindromo(){
        Palindromos p = new Palindromos();
        assertTrue(p.espalindromo("1234321"));
        
    //la ruta nos aporto otro paso natural    
    }
}
