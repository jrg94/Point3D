package components.geometry.point;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public abstract class Point3DTest {

    protected abstract Point3D constructorTest();

    // TODO: include second constructor

    protected abstract Point3D constructorRef();
    
    @Test 
    public void testNoArgumentConstructor() {
        Point3D p = constructorTest();
        Point3D pExpected = constructorRef();

        assertEquals(pExpected, p);
    }

}
