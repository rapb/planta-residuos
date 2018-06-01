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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author DAW111
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({plantaresiduos.AlmacenTest.class, plantaresiduos.ReparacionTest.class, plantaresiduos.EstadoDeResiduoExceptionTest.class, plantaresiduos.ResiduoTest.class, plantaresiduos.TCamioneroTest.class, plantaresiduos.TrabajadorTest.class, plantaresiduos.NominaTest.class, plantaresiduos.TOficionaTest.class, plantaresiduos.VehiculoTest.class, plantaresiduos.TallerTest.class, plantaresiduos.TObreroTest.class, plantaresiduos.LlegadaTest.class, plantaresiduos.PlantaResiduosTest.class})
public class PlantaresiduosSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
