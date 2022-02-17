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
    public void testGeometriaPorDefecto()
    {
        System.out.println("testGeometriaPorDefecto()");
        Geometria geo2 = new Geometria();
        int esper1 = 9;
        String esper2 = "Default";
        int res1 = geo2.getId();
        String res2 = geo2.getNom();

        assertEquals(esper1, res1);
        assertEquals(esper2, res2);
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
    
    @Test
    public void testAreaPentagono()
    {
        System.out.println("testAreaPentagono()");
        int result = geo.areapentagono(5, 2);
        double esper = 5;

        assertEquals(esper, result);
    }
    
    @Test
    public void testAreaRombo()
    {
        System.out.println("testAreaRombo()");
        int result = geo.arearombo(5, 2);
        double esper = 5;

        assertEquals(esper, result);
    }
    
    @Test
    public void testAreaRomboide()
    {
        System.out.println("testAreaRomboide()");
        int result = geo.arearomboide(5, 2);
        double esper = 10;

        assertEquals(esper, result);
    }
    
    @Test
    public void testAreaTrapecio()
    {
        System.out.println("testAreaTrapecio()");
        int result = geo.areatrapecio(5, 5, 5);
        double esper = 25;

        assertEquals(esper, result);
    }
    
    @Test
    public void testFigura()
    {
        System.out.println("testFigura()");
        String result = geo.figura(2);
        String esper = "Circulo";

        assertEquals(esper, result);
    }
    
    @Test
    public void testSetGetId()
    {
        System.out.println("testSetGetId()");
        geo.setId(1);;
        int esper = geo.getId();

        assertEquals(esper, 1);
    }
    
    @Test
    public void testSetGetNom()
    {
        System.out.println("testSetGetNom()");
        geo.setNom("Miquel Angel");;
        String esper = geo.getNom();

        assertEquals(esper, "Miquel Angel");
    }
    
    @Test
    public void testSetGetArea()
    {
        System.out.println("testSetGetArea()");
        geo.setArea(12);;
        double esper = geo.getArea();

        assertEquals(esper, 12);
    }
    
    @Test
    public void testToString()
    {
        System.out.println("testToString()");
        String result = geo.toString();
        String esper = "Geometria [id=" + geo.getId() + ", nom=" + geo.getNom() + ", area=" + geo.getArea() + "]";

        assertEquals(esper, result);
    }
    
}
