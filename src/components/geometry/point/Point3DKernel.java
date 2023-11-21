package components.geometry.point;

import components.standard.Standard;

/**
 * Point3D kernel component with primary methods. (Note: by
 * package-wide convention, all references are non-null.)
 * 
 * @mathmodel type Point3DKernel is modeled by a mathematical point: (x, y, z)
 */
public interface Point3DKernel extends Standard<Point3D> {

    /**
     * Retrieves the x-coordinate of this point.
     * 
     * @return the x-coordinate of this
     * @ensures getX = x
     */
    double getX();

    /**
     * Retrieves the y-coordinate of this point.
     * 
     * @return the y-coordinate of this
     * @ensures getY = y
     */
    double getY();

    /**
     * Retrieves the z-coordinate of this point.
     * 
     * @return the z-coordinate of this
     * @ensures getZ = z
     */
    double getZ();

    /**
     * Sets the x-coordinate of this point.
     * 
     * @param x the x-coordinate value
     * @ensures TODO 
     * @replaces this
     */
    double setX(double x);

    /**
     * Sets the y-coordinate of this point.
     * 
     * @param y the y-coordinate value
     * @ensures TODO
     * @replaces this
     */
    double setY(double y);

    /**
     * Sets the z-coordinate of this point.
     * 
     * @param z the z-coordinate value
     * @ensures TODO
     * @replaces this
     */
    double setZ(double z);

}
