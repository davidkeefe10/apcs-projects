/**
 * This class finds the first n twin primes,
 * which are prime numbers that have a difference of 2
 */
public class Exercise14
{
    /**
     * Determines if a number is prime.
     * @param n the number
     * @return true if it's prime, false if not
     */
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        else if (n % 3 == 0)
            return false;
        else
        {
            int m = 3;
            while (m * m <= n)
            {
                if (n % m == 0)
                    return false;
                m += 2;
            }

            return true;
        }
    }

    /**
     * Finds the first n twin primes.
     * @param n the number of twin primes to be found
     * @return the list of twin primes
     */
    public String findTwins(int n)
    {
        int pairs = 0;
        int number = 3;
        String list = "";

        while (pairs < n)
        {
            if (isPrime(number) && isPrime(number + 2))
            {
                list += "(" + number + ", " + (number + 2) + "), ";
                number += 4;
                pairs++;
            }
            else
            {
                number += 2;
            }
        }

        return list;
    }
}
