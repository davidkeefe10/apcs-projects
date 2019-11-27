/**
 * This class determines if a number is a perfect square.
 */
public class Exercise11
{
    public static boolean isPerfectSquare(int n)
    {
        int sum = 0;
        int i = 1;

        while (sum < n)
        {
            sum += i;
            i += 2;
        }

        if (sum == n)
            return true;
        else
            return false;
    }
}
