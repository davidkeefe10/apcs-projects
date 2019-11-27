/**
 * This class calculates the sum of
 * all odd integers from 1 to n.
 */
public class Exercise8
{
    public int addOdds(int n)
    {
        int sum = 0;

        for (int i = 1; i <= n; i += 2)
        {
            sum += i;
        }

        return sum;
    }
}
