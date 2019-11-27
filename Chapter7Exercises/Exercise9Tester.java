/**
 * This class tests the Exercise9 class.
 */
import java.util.Scanner;

public class Exercise9Tester
{
    public static void main(String[] args)
    {
        Exercise9 test = new Exercise9();

        Scanner kboard = new Scanner(System.in);
        int k;

        do
        {
            System.out.println("Enter a positive integer under 10: ");
            k = kboard.nextInt();
        }
        while (k < 0 || k >= 10);

        System.out.println(test.getSum(k));
    }
}
