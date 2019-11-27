/**
 * This class creates a Fibonacci sequence.
 */
public class FibonacciGenerator
{
    int value1 = 1;
    int value2 = 1;

    /**
     * Calculates the nth value in the Fibonacci sequence.
     * @param n n
     * @return the nth value
     */
    public int nextNumber(int n)
    {
        for(int i = 2; i < n; i++)
        {
            value2 += value1;
            value1 = value2 - value1;
        }

        return value2;
    }
}
