package components.geometry.point;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Point3DTest {
    
    @Test 
    public void testNoArgumentConstructor() {
        Point3D p = new Point3D1();

        assertEquals(0, p.getX(), .0001);
        assertEquals(0, p.getY(), .0001);
        assertEquals(0, p.getZ(), .0001);
    }

    @Test 
    public void testCoordinateConstructorWithDefaults() {
        Point3D p = new Point3D1(0, 0, 0);

        assertEquals(0, p.getX(), .0001);
        assertEquals(0, p.getY(), .0001);
        assertEquals(0, p.getZ(), .0001);
    }

    @Test 
    public void testCoordinateConstructorWithoutDefaults() {
        Point3D p = new Point3D1(5, 10, 3);

        assertEquals(5, p.getX(), .0001);
        assertEquals(10, p.getY(), .0001);
        assertEquals(3, p.getZ(), .0001);
    }

}
