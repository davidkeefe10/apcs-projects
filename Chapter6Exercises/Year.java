/**
 * This class determines if a year is a leap year.
 */

public class Year
{
    private int year;

    /**
     * Constructs a year object.
     * @param y the year
     */
    public Year(int y)
    {
        year = y;
    }

    /**
     * Determines if the given year is a leap year.
     * @return true if it is a leap year, false if not
     */
    public boolean isLeapYear()
    {
        if (year >= 1582)
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                return true;
            else
                return false;
        }
        else
        {
            if (year % 4 == 0)
                return true;
            else
                return false;
        }
    }
}
