/**
 This class is used to test whether two floating-point numbers are the same.
 */

public class Comparer
{
    private int digits;

    /**
     Creates a Comparer object to determine if two floating-point numbers are approximately the same.
     @param d the number of significant digits in the comparison
     */
    public Comparer(int d)
    {
        digits = d;
    }

    /** Tests whether two numbers are close to each other.
     @param x1 the first number
     @param x2 the second number
     @return true if the two numbers differ by less than the number of significant digits
     */
    public boolean areClose(double x1, double x2)
    {
        if (Math.round(Math.abs(x1 - x2)*Math.pow(10, digits))/Math.pow(10, digits) == 0)
            return true;
        else
            return false;
    }

    /** Tests whether two numbers round to the same value.
    * @param x1 the first number
    * @param x2 the second number
    * @return true if the two numbers, when rounded to the number of significant digits, yield the same value
    */
    public boolean roundToSame(double x1, double x2)
    {
        if (Math.round(x1*Math.pow(10, digits))/Math.pow(10, digits) == Math.round(x2*Math.pow(10, digits))/Math.pow(10, digits))
            return true;
        else
            return false;
    }
}