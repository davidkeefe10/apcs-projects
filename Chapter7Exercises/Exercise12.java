/**
 * This class calculates the sum of all
 * the digits of a non-negative number.
 */
public class Exercise12
{
    public int sumDigits(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }
}
