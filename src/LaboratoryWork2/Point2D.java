package LaboratoryWork2;

public class Point2D
{
    protected double coordinateX;
    protected double coordinateY;

    public Point2D(double coordinateX, double coordinateY)
    {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Point2D()
    {
        this(0, 0);
    }

    public void setCoordinateX(double value) { this.coordinateX = value; }
    public void setCoordinateY(double value) { this.coordinateY = value; }

    public double getCoordinateX() { return this.coordinateX; }
    public double getCoordinateY() { return this.coordinateY; }
}
