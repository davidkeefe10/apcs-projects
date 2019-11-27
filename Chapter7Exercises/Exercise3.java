/**
 * This class returns the product of a and b.
 * Precondition: a >= 0, b >= 0
 */
public class Exercise3
{
    public int product(int a, int b)
    {
        int sum = 0;

        for (int n=1; n<=a; n++)
        {
            sum += b;
        }

        return sum;
    }
}
