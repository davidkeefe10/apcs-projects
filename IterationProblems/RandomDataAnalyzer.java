/**
 * This class generate 100 random numbers between
 * 0 and 100 and prints the average and maximum.
 */
public class RandomDataAnalyzer
{
    public static void main(String[] args)
    {
        DataSet randomSet = new DataSet();
        double val = 1000*Math.random();
        int totalValues = 0;

        while (totalValues < 1000)
        {
            if (val >= 0 && val <= 1000)
            {
                randomSet.add(val);
                randomSet.getMaximum();
                totalValues++;
                val = 1000*Math.random();
            }
            else
            {
                val = 1000*Math.random();
            }
        }

        System.out.println("The average value is " + randomSet.getAverage() + ".");
        System.out.println("The maximum value is " + randomSet.getMaximum() + ".");
    }
}
