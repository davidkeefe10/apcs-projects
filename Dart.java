/**
 * This class simulates a dart thrown at at a 2 x 2 dartboard
 * with a unit circle inscribed into it.
 */
public class Dart
{
    private int tries;
    private int hits;
    private double xVal;
    private double yVal;

    public Dart()
    {
        tries = 0;
        hits = 0;
    }

    /**
     * Throws a dart into the square [-1,-1] x [1,1] and records
     * whether it hits the unit circle.
     */
    public void throwIntoSquare()
    {
        xVal = Math.random()*2 - 1;
        yVal = Math.random()*2 - 1;
        tries++;

        if (xVal*xVal + yVal*yVal <= 1.0)
            hits++;
    }

    /**
     * Gets the number of hits inside the unit circle.
     * @return hits number of hits
     */
    public int getHits()
    {
        return hits;
    }

    /**
     * Gets the number of tries.
     * @return the number of times the dart was thrown
     */
    public int getTries()
    {
        return tries;
    }
}
