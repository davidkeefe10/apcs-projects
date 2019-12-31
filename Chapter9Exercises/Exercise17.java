/**
 * This class computes the average of the values in an array.
 */
public class Exercise17
{
    public double average(int[] scores)
    {
        double sum = 0;
        for (int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
        }

        return sum/scores.length;
    }

}

