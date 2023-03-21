package LaboratoryWork2;

public class Point3D extends Point2D
{
    protected double coordinateZ;

    public Point3D(double coordinateX, double coordinateY, double coordinateZ)
    {
        super(coordinateX, coordinateY);
        this.coordinateZ = coordinateZ;
    }

    public Point3D()
    {
        this(0, 0, 0);
    }

    public void setCoordinateZ(double value) { this.coordinateZ = value; }
    public double getCoordinateZ() { return this.coordinateZ; }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != obj.getClass()) return false;

        var point = (Point3D) obj;

        return this.coordinateX == point.coordinateX &&
                this.coordinateY == point.coordinateY &&
                this.coordinateZ == point.coordinateZ;
    }
}
