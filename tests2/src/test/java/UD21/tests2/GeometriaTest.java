package UD21.tests2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geo;
	
	@BeforeEach
    public void before()
    {
        System.out.println("before(id)");
        geo = new Geometria(5);
    }

    @AfterEach
    public void after()
    {
        System.out.println("after()");
        geo = null;
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

    @Test
    public void testAreaRectangulo()
    {
        System.out.println("testAreaRectangulo()");
        int result = geo.arearectangulo(2, 2);
        double esper = 4;

        assertEquals(esper, result);
    }
    
}
