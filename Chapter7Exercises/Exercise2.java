/**
 * This class calculates the sum of the sequence
 * 1 - 1/2 + 1/3 - ... + (or -) 1/n.
 */
public class Exercise2
{
    /**
     *  Calculates the sum of the sequence
     *  * 1 - 1/2 + 1/3 - ... + (or -) 1/n.
     * @param n the last value to plug into the sequence
     * @return the sum
     */
    public double alternatingSequence(int n)
    {
        double sum = 0;

        for (int i = 1; i <= n; i++)
            sum += Math.pow(-1, i - 1)/i;

        return sum;
    }

    /**
     * Calculates how close the sum of the above series
     * evaluated at k is to ln2, which is the value
     * that the sequence converges to.
     * @param k the last value to plug into the sequence
     * @return the difference between ln2 and the sum from the sequence
     */
    public double testCloseness(int k)
    {
        return Math.log(2) - alternatingSequence(k);
    }
}
