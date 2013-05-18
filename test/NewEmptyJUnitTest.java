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
        assertTrue(p.palindromo(1234321,10));
        assertFalse(p.palindromo(1234321,16));
        assertTrue(p.palindromo(289,16));
        assertFalse(p.palindromo(1234,2));
        assertTrue(p.palindromo(273,2));
        assertFalse(p.palindromo(273,8));
        assertTrue(p.palindromo(273,16));   
    }
    
}
