/**
 * This class tests the FibonacciGenerator class.
 */
import java.util.Scanner;

public class FibonacciTester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        FibonacciGenerator test = new FibonacciGenerator();

        System.out.print("Which value of the Fibonacci sequence do you want to know? ");
        int n = kboard.nextInt();
        System.out.println(test.nextNumber(n));
    }
}
