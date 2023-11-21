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

    @Override
    public void move(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    @Override
    public void move(Point3D p) {
        this.setX(p.getX());
        this.setY(p.getY());
        this.setZ(p.getZ());
    }

    @Override
    public double distance(Point3D p) {
        double xDifference = p.getX() - this.getX();
        double yDifference = p.getY() - this.getY();
        double zDifference = p.getZ() - this.getZ();
        double sum = xDifference * xDifference + yDifference * yDifference + zDifference * zDifference;
        return Math.sqrt(sum);
    }

    @Override
    public Point3D vectorTo(Point3D p) {
        Point3D vector = this.newInstance();
        vector.setX(this.getX() - p.getX());
        vector.setY(this.getY() - p.getY());
        vector.setZ(this.getZ() - p.getZ());
        return vector;
    }

    @Override
    public boolean isOrigin() {
        return this.getX() == 0 && this.getY() == 0 && this.getZ() == 0;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", this.getX(), this.getY(), this.getZ());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Point3D)) {
            return false;
        }

        Point3D p = (Point3D) obj;
        return this.getX() == p.getX() && this.getY() == p.getY() && this.getZ() == p.getZ();
    }

    @Override
    public int hashCode() {
        return (int) (this.getX() + this.getY() + this.getZ());
    }

}
