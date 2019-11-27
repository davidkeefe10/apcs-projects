/**
 * This class creates lines in different formats and
 * determines if they intersect, are equal, or are parallel.
 */

public class Line
{
    private double xPoint1;
    private double xPoint2;
    private double yPoint1;
    private double yPoint2;
    private double slope;
    private double yIntercept;

    /**
     * Constructs a line given a point and a slope.
     * @param x the x point
     * @param y the y point
     * @param m the slope
     */
    public Line(double x, double y, double m)
    {
        xPoint1 = x;
        yPoint1 = y;
        slope = m;
        yIntercept = -1*x*m + y;
    }

    /**
     * Constructs a line given two points.
     * @param x1 the first x point
     * @param y1 the first y point
     * @param x2 the second x point
     * @param y2 the second y point
     */
    public Line(double x1, double y1, double x2, double y2)
    {
        xPoint1 = x1;
        yPoint1 = y1;
        xPoint2 = x2;
        yPoint2 = y2;
        slope = (y2-y1)/(x2-x1);
        yIntercept = -1*x1*((y2-y1)/(x2-x1)) + y1;
    }

    /**
     * Constructs a line in slope-intercept form.
     * @param m the slope
     * @param i the y-intercept
     */
    public Line(double m, double i)
    {
        slope = m;
        yIntercept = i;
    }

    /**
     * Constructs a line that is vertical.
     * @param a the x-intercept
     */
    public Line(double a)
    {
        xPoint1 = a;
    }

    /**
     * Determines if two lines intersect.
     * @param other the second line
     * @return true if they intersect, false if they don't
     */
    public boolean intersects(Line other)
    {
        if (slope != other.slope)
            return true;
        else
            return false;
    }

    /**
     * Determines if two lines are equal.
     * @param other the second line
     * @return true if they are equal, false if not
     */
    public boolean equals(Line other)
    {
        if (xPoint1 - xPoint2 == 0)
        {
            if (xPoint1 == other.xPoint1)
                return true;
            else
                return false;
        }
        else
        {
            if (slope == other.slope && yIntercept == other.yIntercept)
                return true;
            else
                return false;
        }
    }

    /**
     * Determines if two lines are parallel.
     * @param other the second line
     * @return true if they are parallel, false if not
     */
    public boolean isParallel(Line other)
    {
        if (slope == other.slope && yIntercept != other.yIntercept)
            return true;
        else if (xPoint1 - xPoint2 == 0 && other.xPoint1 - xPoint2 == 0)
            return true;
        else
            return false;
    }
}
