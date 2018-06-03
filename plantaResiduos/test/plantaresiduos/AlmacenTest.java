/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantaresiduos;

import java.util.LinkedHashSet;
import java.util.Scanner;
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
public class AlmacenTest {
    
    public AlmacenTest() {
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
     * Test of anadirResiduo method, of class Almacen.
     */
    @Test
    public void testAnadirResiduo() throws Exception {
        System.out.println("anadirResiduo");
        int id = 0;
        char estado = ' ';
        String desc = "";
        Almacen instance = null;
        instance.anadirResiduo(id, estado, desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarResiduos method, of class Almacen.
     */
    @Test
    public void testListarResiduos() {
        System.out.println("listarResiduos");
        Almacen instance = null;
        instance.listarResiduos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntrada method, of class Almacen.
     */
    @Test
    public void testGetEntrada() {
        System.out.println("getEntrada");
        Almacen instance = null;
        Scanner expResult = null;
        Scanner result = instance.getEntrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntrada method, of class Almacen.
     */
    @Test
    public void testSetEntrada() {
        System.out.println("setEntrada");
        Scanner Entrada = null;
        Almacen instance = null;
        instance.setEntrada(Entrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Almacen.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Almacen instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Almacen.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Almacen instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacidad method, of class Almacen.
     */
    @Test
    public void testGetCapacidad() {
        System.out.println("getCapacidad");
        Almacen instance = null;
        int expResult = 0;
        int result = instance.getCapacidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidad method, of class Almacen.
     */
    @Test
    public void testSetCapacidad() {
        System.out.println("setCapacidad");
        int capacidad = 0;
        Almacen instance = null;
        instance.setCapacidad(capacidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Almacen.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Almacen instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Almacen.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Almacen instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUbicacion method, of class Almacen.
     */
    @Test
    public void testGetUbicacion() {
        System.out.println("getUbicacion");
        Almacen instance = null;
        String expResult = "";
        String result = instance.getUbicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUbicacion method, of class Almacen.
     */
    @Test
    public void testSetUbicacion() {
        System.out.println("setUbicacion");
        String ubicacion = "";
        Almacen instance = null;
        instance.setUbicacion(ubicacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResiduos method, of class Almacen.
     */
    @Test
    public void testGetResiduos() {
        System.out.println("getResiduos");
        Almacen instance = null;
        LinkedHashSet<Residuo> expResult = null;
        LinkedHashSet<Residuo> result = instance.getResiduos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResiduos method, of class Almacen.
     */
    @Test
    public void testSetResiduos() {
        System.out.println("setResiduos");
        LinkedHashSet<Residuo> residuos = null;
        Almacen instance = null;
        instance.setResiduos(residuos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conducir method, of class Almacen.
     */
    @Test
    public void testConducir() {
        System.out.println("conducir");
        String matricula = "";
        Almacen instance = null;
        instance.conducir(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dejarVehiculo method, of class Almacen.
     */
    @Test
    public void testDejarVehiculo() {
        System.out.println("dejarVehiculo");
        String matricula = "";
        Almacen instance = null;
        instance.dejarVehiculo(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarConductorVehiculo method, of class Almacen.
     */
    @Test
    public void testAsignarConductorVehiculo() {
        System.out.println("asignarConductorVehiculo");
        String nif = "";
        String matricula = "";
        Almacen instance = null;
        instance.asignarConductorVehiculo(nif, matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignaVehiculoConductor method, of class Almacen.
     */
    @Test
    public void testAsignaVehiculoConductor() {
        System.out.println("asignaVehiculoConductor");
        String nif = "";
        String matricula = "";
        Almacen instance = null;
        instance.asignaVehiculoConductor(nif, matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anhadirVehiculo method, of class Almacen.
     */
    @Test
    public void testAnhadirVehiculo() throws Exception {
        System.out.println("anhadirVehiculo");
        String matricula = "";
        String modelo = "";
        int numeroAñosOperativo = 0;
        int estado = 0;
        boolean disponible = false;
        Almacen instance = null;
        instance.anhadirVehiculo(matricula, modelo, numeroAñosOperativo, estado, disponible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anhadirtrabajadorObrero method, of class Almacen.
     */
    @Test
    public void testAnhadirtrabajadorObrero() throws Exception {
        System.out.println("anhadirtrabajadorObrero");
        String nif = "";
        String nombre = "";
        String apellidos = "";
        String telefono = "";
        String direccion = "";
        boolean esSupervisor = false;
        Almacen instance = null;
        instance.anhadirTrabajadorObrero(nif, nombre, apellidos, telefono, direccion, esSupervisor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anhadirtrabajadorCamionero method, of class Almacen.
     */
    @Test
    public void testAnhadirtrabajadorCamionero() throws Exception {
        System.out.println("anhadirtrabajadorCamionero");
        boolean senior = false;
        String nif = "";
        String nombre = "";
        String apellidos = "";
        String telefono = "";
        String direccion = "";
        Almacen instance = null;
        instance.anhadirTrabajadorCamionero(senior, nif, nombre, apellidos, telefono, direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anhadirtrabajadorOficina method, of class Almacen.
     */
    @Test
    public void testAnhadirtrabajadorOficina() throws Exception {
        System.out.println("anhadirtrabajadorOficina");
        String nif = "";
        String nombre = "";
        String apellidos = "";
        String telefono = "";
        String direccion = "";
        String departamento = "";
        Almacen instance = null;
        instance.anhadirTrabajadorOficina(nif, nombre, apellidos, telefono, direccion, departamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTrabajador method, of class Almacen.
     */
    @Test
    public void testBuscarTrabajador() {
        System.out.println("buscarTrabajador");
        String nif = "";
        Almacen instance = null;
        Trabajador expResult = null;
        Trabajador result = instance.buscarTrabajador(nif);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarVehiculo method, of class Almacen.
     */
    @Test
    public void testBuscarVehiculo() {
        System.out.println("buscarVehiculo");
        String matricula = "";
        Almacen instance = null;
        Vehiculo expResult = null;
        Vehiculo result = instance.buscarVehiculo(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
