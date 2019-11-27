/**
 * This class determines the sum of positive integers
 * from 1 to n and the addition used to get to that sum.
 */
public class Exercise9
{
    public String getSum(int n)
    {
        int sum = 1;
        String add = "1 ";

        for (int i = 2; i <= n; i++)
        {
            add += "+ " + i + " ";
            sum += i;
        }

        return add + "= " + sum;
    }
}
