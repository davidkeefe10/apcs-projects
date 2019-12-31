/**
 * This class tests the Exercise11 class.
 */
import java.util.Scanner;

public class Exercise11Tester
{
    public static void main(String[] args)
    {
        Exercise11 myTest = new Exercise11();
        Scanner kboard = new Scanner(System.in);
        System.out.println("Which value of the fibonacci sequence do you want to know?: ");
        int value = kboard.nextInt();
        int placeholder = value + 1;

        System.out.println("The first " + placeholder + " values of the fibonacci sequence are: " + myTest.fibonacci(value));
    }
}
