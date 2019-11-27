/**
 * Returns an estimate x of the square root of a,
 * such that [x^2 - a] < 0.01
 * Precondition: a is greater than 5.
 */
public class ExerciseA15
{
    public static double sqrtEst(double a)
    {
        double x = a/2;
        double diff;

        do
        {
            x = 0.5*(x + a/x);
            diff = x*x - a;
        } while(diff >= 0.01);

        return x;
    }
}
