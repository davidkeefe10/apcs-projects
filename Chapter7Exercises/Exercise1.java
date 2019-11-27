/**
 * This class calculates the sum of the sequence
 * 1 + 1/2^2 + 1/3^2 + ... + 1/n^2.
 */
public class Exercise1
{
    /**
     * Calculates the sum of the sequence
     * 1 + 1/2^2 + 1/3^2 + ... + 1/n^2.
     * @param n the last value to plug into the sequence
     * @return the sum
     */
    public double sumInverseSquares(int n)
    {
        double sum = 0;

        for (int i = 1; i <= n; i++)
            sum += 1.0 / (i * i);

        return sum;
    }

    /**
     * Calculates how close the sum of the above series
     * evaluated at k is to pi^2/6, which is the value
     * that the sequence converges to.
     * @param k the last value to plug into the sequence
     * @return the difference between pi^2/6 and the sum from the sequence
     */
    public double testCloseness(int k)
    {
        return Math.PI*Math.PI/6 - sumInverseSquares(k);
    }
}
