/**
 * This class prompts the user to enter the values of a data set
 * and prints the number of values, its average, and  its standard deviation.
 */
import java.util.Scanner;

public class DataAnalyzer
{
    public static void main(String[] args)
    {
        DataSet mySet = new DataSet();
        Scanner kboard = new Scanner(System.in);

        System.out.print("Enter Value (Q to quit): ");
        String s = kboard.next();

        boolean done = false;

        while (!done)
        {
            if (s.equals("Q"))
                done = true;
            else
            {
                double d = Double.parseDouble(s);
                mySet.add(d);
                System.out.print("Enter Value (Q to quit): ");
                s = kboard.next();
                done = false;
            }
        }

        if (mySet.getCount() > 0)
        {
            System.out.println("There is a total of " + mySet.getCount() + " values");
            System.out.println("The average is " + mySet.getAverage());
            System.out.println("The standard deviation is " + mySet.getStandardDeviation());
        }
        else
            System.out.println("There is a total of " + mySet.getCount() + " values");
    }
}
