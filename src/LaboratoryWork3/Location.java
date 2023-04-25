package LaboratoryWork3;

import java.util.Objects;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || obj.getClass() != obj.getClass()) return false;

        var location = (Location) obj;
        return this.xCoord == location.xCoord && this.yCoord == location.yCoord;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.xCoord, this.yCoord);
    }
}