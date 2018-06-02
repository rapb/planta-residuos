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
public class TOficionaTest {
    
    public TOficionaTest() {
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
     * Test of generarNomina method, of class TOficiona.
     */
    @Test
    public void testGenerarNomina() throws Exception {
        System.out.println("generarNomina");
        int id = 0;
        int mes = 0;
        int anio = 0;
        int cant = 0;
        TOficiona instance = null;
        instance.generarNomina(id, mes, anio, cant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
