package components.geometry;

import components.standard.Standard;

public interface Point3DKernel extends Standard<Point3D> {

    /**
     * Retrieves the x-coordinate of this point.
     * 
     * @return the x-coordinate of this
     * @ensures TODO
     */
    double getX();

    /**
     * Retrieves the y-coordinate of this point.
     * 
     * @return the y-coordinate of this
     * @ensures TODO
     */
    double getY();

    /**
     * Retrieves the z-coordinate of this point.
     * 
     * @return the z-coordinate of this
     * @ensures TODO
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
