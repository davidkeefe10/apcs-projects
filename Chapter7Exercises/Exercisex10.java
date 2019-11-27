/**
 * This class determines if an integer is a prime number.
 */
public class Exercisex10
{
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
            while (m * m <= 9)
            {
                if (n % m == 0)
                    return false;
                m += 2;
            }

            return true;
        }
    }
}
