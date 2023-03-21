package LaboratoryWork2;

public class Point2D
{
    private double coordinateX;
    private double coordinateY;

    public Point2D(int coordinateX, int coordinateY)
    {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void setCoordinateX(double value) { this.coordinateX = value; }
    public void setCoordinateY(double value) { this.coordinateY = value; }

    public double getCoordinateX() { return this.coordinateX; }
    public double getCoordinateY() { return this.coordinateY; }
}
