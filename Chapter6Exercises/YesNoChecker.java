/**
 * This class determines if user responses mean yes or no.
 */

public class YesNoChecker
{
    private String response;

    /**
     * Constructs an object with a string as its parameter.
     * @param r the user input
     */
    public YesNoChecker(String r)
    {
        response = r;
    }

    /**
     * Determines if the user input is some variation of "Yes".
     * @return true if the input is yes, false if not
     */
    public boolean isYes()
    {
        if (response.equals("Y") || response.equals("Yes") || response.equals("OK") || response.equals("Sure") || response.equals("Why not?"))
            return true;
        else
            return false;
    }

    /**
     * Determines if the user input is some variation of "No".
     * @return true if the input is no, false if not
     */
    public boolean isNo()
    {
        if (response.equals("N") || response.equals("No"))
            return true;
        else
            return false;
    }
}
