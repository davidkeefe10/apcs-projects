/**
 * This class calculates ex as a power series.
 */

public class ExpApproximator
{
    private double input;
    private double difference;
    private int count = 0;
    private double lastTotal;
    private double thisTotal = 0.0;
    private double term = 0.0;

    /**
     * Creates a ExpApproximator object to calculate ex.
     * @param x the input value
     * @param eps the comparison threshold
     */
    public ExpApproximator(double x, double eps)
    {
        input = x;
        difference = eps;
    }

    /**
     * Method used to calculate the next e number.
     * @return the next e number
     */
    public double nextGuess()
    {
        if (term == 0)
        {
            term = 1.0;
            thisTotal += term;
            count++;
            return thisTotal;
        }
        else
        {
            lastTotal = thisTotal;
            term = term * input/count;
            count++;
            thisTotal += term;
            return thisTotal;
        }
    }

    /**
     * Determine if there are more numbers from the input.
     * @return true input value has more numbers
     */
    public boolean hasMoreGuesses()
    {
        if ((Math.abs(thisTotal - lastTotal)) > difference)
            return true;
        else
            return false;
    }
}