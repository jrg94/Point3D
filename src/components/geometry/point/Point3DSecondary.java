package components.geometry.point;

public abstract class Point3DSecondary implements Point3D {
    
    @Override
    public void translate(double x, double y, double z) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
        this.setZ(this.getZ() + z);
    }

    @Override
    public void translate(Point3D p) {
        this.setX(this.getX() + p.getX());
        this.setY(this.getY() + p.getY());
        this.setZ(this.getZ() + p.getZ());
    }

}
