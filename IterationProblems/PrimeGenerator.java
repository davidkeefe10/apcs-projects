/**
 * This class prints out all the prime numbers of an input value.
 */
public class PrimeGenerator
{
    int value;

    public PrimeGenerator()
    {
        value = 0;
    }

    /**
     * Calculates the next prime number of an input.
     * @return the next prime number
     */
    public int nextPrime()
    {
        value++;
        boolean prime = false;

        while (!prime)
        {
            if (value <= 1)
                value++;

            int m = 2;

            while (m * m <= value)
            {
                if (value % m == 0)
                {
                    value++;
                    m = 2;
                }
                else
                    m++;
            }

            prime = true;
        }

        return value;
    }
}
