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
    @Test
    public void testGenerarVehiculo() {
        System.out.println("generarVehiculo");
        Vehiculo instance = null;
        boolean expResult = false;
        boolean result = instance.generarVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
