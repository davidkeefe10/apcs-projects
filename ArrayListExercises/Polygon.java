import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.util.ArrayList;
/**
 A polygon is a closed curve made up from line segments
 that join the corner points.
 */
public class Polygon
{
    private ArrayList<Double> xVals;
    private ArrayList<Double> yVals;

    /**
     Constructs a polygon with no corner points.
     */
    public Polygon()
    {
        xVals = new ArrayList<Double>();
        yVals = new ArrayList<Double>();
    }
    /**
     Adds a corner point to the polygon.
     @param x the x-coordinate of the point
     @param y the y-coordinate of the point
     */
    public void add (double x, double y)
    {
        xVals.add(x);
        yVals.add(y);
    }
    /**
    Calculates the perimeter of a polygon.
    @return the perimeter of this polygon
    */
    public double getPerimeter()
    {
        double perimeter = 0;
        for(int i = 0; i <= xVals.size() - 2; i++)
        {
            perimeter += Math.sqrt(Math.pow(xVals.get(i+1) - xVals.get(i), 2) + Math.pow(yVals.get(i+1) - yVals.get(i), 2));
        }
        perimeter += Math.sqrt(Math.pow(xVals.get(0) - xVals.get(xVals.size() - 1), 2) + Math.pow(yVals.get(0) - yVals.get(yVals.size() - 1), 2));
        return perimeter;
    }
    /**
     Calculates the area of a polygon.
     @return the area of this polygon
     */
    public double getArea()
    {
        double area = 0;
        for(int n = 0; n <= xVals.size() - 2; n++)
        {
            area += xVals.get(n)*yVals.get(n+1);
        }
        area += xVals.get(xVals.size() - 1)*yVals.get(0);

        for (int k = 0; k <= yVals.size() - 2; k++)
        {
            area -= yVals.get(k)*xVals.get(k+1);
        }
        area -= yVals.get(yVals.size() - 1)*xVals.get(0);

        area = area/2;
        return area;
    }
}