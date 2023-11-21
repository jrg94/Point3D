package components.geometry.point;

public class Point3D1 extends Point3DSecondary {

    private double x;
    private double y;
    private double z;

    private void createNewRep() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D1() {
        this.createNewRep();
    }

    public Point3D1(double x, double y, double z) {
        this.createNewRep();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public double getZ() {
        return this.z;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void clear() {
        this.createNewRep();
    }

    @Override
    public Point3D newInstance() {
        return new Point3D1();
    }

    @Override
    public void transferFrom(Point3D arg0) {
        // TODO: not correct according to our discipline
        this.x = arg0.getX();
        this.y = arg0.getY();
        this.z = arg0.getZ();
        arg0.clear();
    }
    
}
