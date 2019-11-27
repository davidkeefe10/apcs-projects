/**
 * This class implements the Newton-Raphson method to approximate the
 * nth root of an input value.
 */
public class RootApproximator2
{
    private double value;
    private double root;
    private double difference;
    private double lastGuess;
    private double thisGuess = 0;

    /**
     * Creates a RootApproximator object used to approximate the root
     * of a number.
     * @param a the value whose nth root is to be obtained
     * @param n the root to be extracted
     * @param eps the comparison threshold
     */
    public RootApproximator2(double a, int n, double eps)
    {
        value = a;
        root = n;
        difference = eps;
    }

    /**
     * Method used to calculate the next root number.
     * @return the next guess number
     */
    public double nextGuess()
    {
        if (thisGuess == 0)
        {
            thisGuess = 1.0;
            return thisGuess;
        }
        else
        {
            lastGuess = thisGuess;
            thisGuess = lastGuess - (Math.pow(lastGuess, root) - value)/(root*Math.pow(lastGuess, (root - 1)));
            return thisGuess;
        }
    }

    /**
     * Determine if there are more guesses.
     * @return true we are close enough to the answer
     */
    public boolean hasMoreGuesses()
    {
        if ((Math.abs(thisGuess - lastGuess)) > difference)
            return true;
        else
            return false;
    }
}