/**
 * This class prompts the user to enter an integer
 * and prints all of its factors.
 */
import java.util.Scanner;

public class FactorPrinter
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = kboard.nextInt();
        FactorGenerator myFactor = new FactorGenerator(i);

        while (myFactor.hasMoreFactors())
        {
            System.out.println(myFactor.nextFactor());
        }
    }
}
