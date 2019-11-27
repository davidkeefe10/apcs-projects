/**
 * This class approximates the value of
 * a square root using the Heron method.
 */
public class RootApproximator
{
    private double root;
    private double difference;
    private double lastGuess;
    private double thisGuess = 0;

    /**
     * Constructs a root approximator object.
     * @param r the root to be approximated
     * @param d the highest acceptable difference
     */
    public RootApproximator (double r, double d)
    {
        root = r;
        difference = d;
    }

    /**
     * Calculates the next guess based on Heron's method.
     * @return the next guess
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
            thisGuess = (lastGuess + root/lastGuess)/2.0;
            return thisGuess;
        }
    }

    /**
     * Determines if the guess is accurate enough
     * by comparing the difference between the last
     * two guesses with the assigned value for difference.
     * @return true if the guesses are close enough, false if not
     */
    public boolean hasMoreGuesses()
    {
        if ((Math.abs(thisGuess - lastGuess)) > difference)
            return true;
        else
            return false;
    }
}
