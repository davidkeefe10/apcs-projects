/**
 * This class takes a value and raises it
 * to the next power, starting with 0.
 */
public class PowerGenerator
{
    private int factor;
    private int power = -1;

    /**
     * Constructs a power generator.
     * @param aFactor the number that will be raised to a power
     */
    public PowerGenerator(int aFactor)
    {
        factor = aFactor;
    }

    /**
     * Computes the next power.
     * @return the next power
     */
    public double nextPower()
    {
        power++;
        return (Math.pow(factor, power));
    }
}
