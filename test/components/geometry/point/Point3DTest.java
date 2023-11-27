package components.geometry.point;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Point3DTest {

    // Constructor tests
    
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

    // Kernel tests

    @Test 
    public void testGetXZero() {
        Point3D p = new Point3D1();
        assertEquals(0, p.getX(), .0001);
    }

    @Test 
    public void testGetXOne() {
        Point3D p = new Point3D1(1, 3, 5);
        assertEquals(1, p.getX(), .0001);
    }

    @Test 
    public void testGetXMany() {
        Point3D p = new Point3D1(12, 4, 1);
        assertEquals(12, p.getX(), .0001);
    }

    @Test 
    public void testGetYZero() {
        Point3D p = new Point3D1();
        assertEquals(0, p.getY(), .0001);
    }

    @Test 
    public void testGetYOne() {
        Point3D p = new Point3D1(3, 1, 5);
        assertEquals(1, p.getY(), .0001);
    }

    @Test 
    public void testGetYMany() {
        Point3D p = new Point3D1(12, 4, 1);
        assertEquals(4, p.getY(), .0001);
    }

    @Test 
    public void testGetZZero() {
        Point3D p = new Point3D1();
        assertEquals(0, p.getZ(), .0001);
    }

    @Test 
    public void testGetZOne() {
        Point3D p = new Point3D1(5, 3, 1);
        assertEquals(1, p.getZ(), .0001);
    }

    @Test 
    public void testGetZMany() {
        Point3D p = new Point3D1(12, 4, 12);
        assertEquals(12, p.getZ(), .0001);
    }

    @Test 
    public void testSetXZero() {
        Point3D p = new Point3D1();
        p.setX(0);
        assertEquals(0, p.getX(), .0001);
    }

    @Test 
    public void testSetXOne() {
        Point3D p = new Point3D1();
        p.setX(1);
        assertEquals(1, p.getX(), .0001);
    }

    @Test 
    public void testSetXMany() {
        Point3D p = new Point3D1();
        p.setX(15);
        assertEquals(15, p.getX(), .0001);
    }

    @Test 
    public void testSetYZero() {
        Point3D p = new Point3D1();
        p.setY(0);
        assertEquals(0, p.getY(), .0001);
    }

    @Test 
    public void testSetYOne() {
        Point3D p = new Point3D1();
        p.setY(1);
        assertEquals(1, p.getY(), .0001);
    }

    @Test 
    public void testSetYMany() {
        Point3D p = new Point3D1();
        p.setY(15);
        assertEquals(15, p.getY(), .0001);
    }

    @Test 
    public void testSetZZero() {
        Point3D p = new Point3D1();
        p.setZ(0);
        assertEquals(0, p.getZ(), .0001);
    }

    @Test 
    public void testSetZOne() {
        Point3D p = new Point3D1();
        p.setZ(1);
        assertEquals(1, p.getZ(), .0001);
    }

    @Test 
    public void testSetZMany() {
        Point3D p = new Point3D1();
        p.setZ(15);
        assertEquals(15, p.getZ(), .0001);
    }

}
