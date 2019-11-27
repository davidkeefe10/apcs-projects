/**
 * This class is used to determine the amount someone should
 * be payed based on their hourly wage and the hours they worked.
 */

public class PayCheck
{
    private double wage;
    private double hours;

    /**
     * Constructs a paycheck object.
     * @param w the hourly wage
     * @param h the amount of hours worked
     */
    public PayCheck(double w, double h)
    {
        wage = w;
        hours = h;
    }

    /**
     * Determines the amount the user should be payed.
     * @return their pay
     */
    public double getPay()
    {
        double p;

        if (hours <= 40)
           p = wage*hours;
        else
            p = wage*40 + wage*1.5*(hours-40);

        return p;
    }
}
