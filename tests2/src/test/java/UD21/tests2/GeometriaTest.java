package UD21.tests2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geo, geo2;
	
	@BeforeEach
    public void before()
    {
        System.out.println("before()");
        geo = new Geometria();

        System.out.println("before(id)");
        geo2 = new Geometria(5);
    }

    @AfterEach
    public void after()
    {
        System.out.println("after()");
        geo = null;
        geo2 = null;
    }
 
    @Test
    public void testAreaCuadrado()
    {
        System.out.println("testAreaCuadrado()");
        int result = geo.areacuadrado(2);
        int esper = 4;

        assertEquals(esper, result);
    }
    
    @Test
    public void testAreaCirculo()
    {
        System.out.println("testAreaCirculo()");
        double result = geo.areaCirculo(2);
        double esper = 4 * 3.1416;

        assertEquals(esper, result);
    }

    @Test
    public void testAreaTriangulo()
    {
        System.out.println("testAreaTriangulo()");
        int result = geo.areatriangulo(2, 2);
        double esper = 2;

        assertEquals(esper, result);
    }

    
}
