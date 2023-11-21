package components.geometry.point;

public interface Point3D extends Point3DKernel {

    /**
     * Moves this by translating each coordinate by 
     * x, y, and z, respectively.
     * 
     * @param x the x component
     * @param y the y component
     * @param z the z component
     * @ensures this = #this + (x, y, z)
     * @updates this
     */
    void translate(double x, double y, double z);

    /**
     * Moves this by treating p as a vector.
     * 
     * @param p the vector to translate by
     * @ensures this = #this + p
     * @updates this
     */
    void translate(Point3D p);

    /**
     * Moves this by overwriting each coordinate with 
     * x, y, and z, respectively.
     * 
     * @param x the new x-coordinate
     * @param y the new y-coordinate
     * @param z the new z-coordinate
     * @ensures this = (x, y, z)
     * @replaces this
     */
    void move(double x, double y, double z);

    /**
     * Moves this to p.
     * 
     * @param p the point to move to
     * @ensures this = p
     * @replaces this
     */
    void move(Point3D p);

    /**
     * Gives the distance between this and p.
     * 
     * @param p the location of the second point for distance calculation
     * @return the distance between this and p
     * @ensures distance = [the distance formula between this and p]
     */
    double distance(Point3D p);

    /**
     * Gives the vector from this to p.
     * 
     * @param p the location of the second point for vector
     * @return the vector between this and p
     * @ensures vectorTo = this - p
     */
    Point3D vectorTo(Point3D p);

    /**
     * Returns true if all three coordinates are zero.
     * 
     * @return true when this is at the origin; false otherwise
     * @ensures isOrigin = [true iff (x, y, z) = (0, 0, 0)]
     */
    boolean isOrigin();

}
