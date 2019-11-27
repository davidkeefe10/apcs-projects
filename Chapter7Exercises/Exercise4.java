/**
 * This class calculates the integer quotient and
 * remainder when two positive integers are divided.
 */
public class Exercise4
{
    public String divide(int m, int n)
    {
        int quotient = 1;
        int remainder = 0;

        if (m < n)
        {
            quotient = 0;
            remainder = m;
        }
        else
        {
            int k = n;
            while (m - n >= k)
            {
                quotient++;
                n += k;
                remainder = m - n;
            }
        }

        return "The quotient is " + quotient + ", with a remainder of " + remainder + ".";
    }
}
