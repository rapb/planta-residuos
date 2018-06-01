/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW111
 */
public class TrabajadorTest {
    
    public TrabajadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registrarLlegada method, of class Trabajador.
     */
    @Test
    public void testRegistrarLlegada() {
        System.out.println("registrarLlegada");
        int id = 0;
        Date fecha = null;
        Trabajador instance = null;
        instance.registrarLlegada(id, fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNif method, of class Trabajador.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Trabajador instance = null;
        String expResult = "";
        String result = instance.getNif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Trabajador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Trabajador instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Trabajador.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Trabajador instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Trabajador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Trabajador instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
