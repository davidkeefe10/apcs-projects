/**
 * This class determines the number of years it
 * will take Mexico to reach a target population.
 */
public class Exercise6
{
    int year = 2014;
    double population = 123.8;
    double rate = 0.5;

    public int yearsRemaining (double targetPopulation)
    {
        int year = 2014;
        double population = 123.8;
        double rate = 0.5;

        while (population < targetPopulation)
        {
            population += population * rate/100;
            year++;
        }

        return year;
    }

}
