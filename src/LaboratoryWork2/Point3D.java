package LaboratoryWork2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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

    public double distanceTo(Point3D point)
    {
        return sqrt(
                pow(this.coordinateX - point.coordinateX, 2) +
                pow(this.coordinateY - point.coordinateY, 2) +
                pow(this.coordinateZ - point.coordinateZ, 2)
        );
    }

    public static double computeArea(Point3D point1, Point3D point2, Point3D point3)
    {
        if (point1.equals(point2) || point2.equals(point3) || point3.equals(point1))
        {
            throw new RuntimeException("Unable to calculate area. Coordinates of two or more points are the same");
        }

        var a = point1.distanceTo(point2);
        var b = point2.distanceTo(point3);
        var c = point3.distanceTo(point1);
        var halfPerimeter = (a + b + c) / 2;

        return sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

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
