/**
 * This class prompts the user for a value and prints approximations
 * for the square root of that value until the difference between
 * two consecutive approximations reaches a certain threshold.
 */
import java.util.Scanner;

public class RootCalculator
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter a number that you want a square root of: ");
        double a = kboard.nextDouble();
        double epsilon = Math.pow(10, -10);
        RootApproximator myRoot = new RootApproximator(a, epsilon);
        System.out.println(myRoot.nextGuess());

        while (myRoot.hasMoreGuesses())
            System.out.println(myRoot.nextGuess());
    }
}
