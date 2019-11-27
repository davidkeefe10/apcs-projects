/**
 * This class tests the Exercise6 class.
 */
import java.util.Scanner;

public class Exercise6Tester
{
    public static void main(String[] args)
    {
        Exercise6 testYear = new Exercise6();

        Scanner kboard = new Scanner(System.in);
        System.out.println("What is your target population in millions? ");
        double p = kboard.nextDouble();

        System.out.println(testYear.yearsRemaining(p));
    }

}
