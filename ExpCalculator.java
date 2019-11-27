/**
 * This class prompts the user for a value x to raise e to
 * and prints approximations for that value until the difference
 * between two consecutive approximations reaches a certain threshold.
 */
import java.util.Scanner;

public class ExpCalculator
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.print("x: ");
        double a = kboard.nextDouble();
        double epsilon = Math.pow(10, -10);
        ExpApproximator myRoot = new ExpApproximator(a, epsilon);
        System.out.println(myRoot.nextGuess());

        while (myRoot.hasMoreGuesses())
            System.out.println(myRoot.nextGuess());

        System.out.println(myRoot.nextGuess());
    }
}
