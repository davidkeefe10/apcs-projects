/**
 * This class generates all the factors of a number.
 */
public class FactorGenerator
{
    private int num;

    /**
     * Creates a FactorGenerator object used to determine the factor
     * of an input value.
     * @param aNum is the input value
     */
    public FactorGenerator(int aNum)
    {
        num = aNum;
    }

    /**
     * Determine whether or not there are more factors.
     * @return true there are more factors
     */
    public boolean hasMoreFactors()
    {
        if (num == 1)
            return false;
        else
            return true;
    }

    /**
     * Calculate the next factor of a value.
     * @return factor the next factor
     */
    public int nextFactor()
    {
        int i = 2;

        while (num % i != 0)
            i++;

        num /= i;
        return i;
    }
}
