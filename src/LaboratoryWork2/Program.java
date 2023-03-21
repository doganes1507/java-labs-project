package LaboratoryWork2;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        var point1 = new Point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        var point2 = new Point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        var point3 = new Point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.println(Point3D.computeArea(point1, point2, point3));
    }
}
