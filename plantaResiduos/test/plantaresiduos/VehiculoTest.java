/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

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
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of conducir method, of class Vehiculo.
     */
    @Test
    public void testConducir() {
        System.out.println("conducir");
        Vehiculo instance = null;
        instance.conducir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarVehiculo method, of class Vehiculo.
     */


    /**
     * Test of anhadirConductor method, of class Vehiculo.
     */
    @Test
    public void testAnhadirConductor() {
        System.out.println("anhadirConductor");
        TCamionero cam = null;
        Vehiculo instance = null;
        instance.anhadirConductor(cam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatricula method, of class Vehiculo.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Vehiculo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Vehiculo instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Vehiculo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Vehiculo instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisponible method, of class Vehiculo.
     */
    @Test
    public void testSetDisponible() {
        System.out.println("setDisponible");
        boolean disponible = false;
        Vehiculo instance = null;
        instance.setDisponible(disponible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
