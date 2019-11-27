/**
 * This class determines the number of days in a month.
 */

public class Month
{
    private int month;
    private int days;

    /**
     * Constructs a month object.
     * @param m the integer of the month
     */
    public Month(int m)
    {
        month = m;
    }

    /**
     * Determines the number of days in a given month.
     * @return the days
     */
    public int getDays()
    {
        if (month < 8)
        {
            if ((month - 1) % 2 == 0)
                return 31;
            else if (month == 2)
                return 28;
            else
                return 30;
        }
        else
        {
            if (month % 2 == 0)
                return 31;
            else
                return 30;
        }
    }
}
