package components.geometry;

public interface Point3D extends Point3DKernel {

    /**
     * Moves this by translating each coordinate by 
     * x, y, and z, respectively.
     * 
     * @param x the x component
     * @param y the y component
     * @param z the z component
     * @ensures this = (#x + x, #y + y, #z + z)
     * @updates this
     */
    void translate(double x, double y, double z);

    void translate(Point3D p);

    void move(double x, double y, double z);

    void move(Point3D p);

    double distance(Point3D p);

    Point3D vectorTo(Point3D p);

    boolean isOrigin();

}
