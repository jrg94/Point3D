package components.geometry;

public abstract class Point3DSecondary implements Point3D {
    
    @Override
    public void translate(double x, double y, double z) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
        this.setZ(this.getZ() + z);
    }

}
