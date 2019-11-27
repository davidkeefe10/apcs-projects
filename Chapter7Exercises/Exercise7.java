/**
 * This class determines the number of months
 * it takes Kevin to learn 95% of his Java book.
 */
public class Exercise7
{
    public int getMonths()
    {
        double knowledge = 0.1;
        int months = 1;

        while (knowledge < 0.95)
        {
            knowledge += (1 - knowledge) * 0.1;
            months++;
        }

        return months;
    }

}
