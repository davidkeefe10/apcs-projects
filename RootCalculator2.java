/**
 * This class prompts the user for a number and a root to be extracted
 * and prints approximations for that value until the difference
 * between two consecutive approximations reaches a certain threshold.
 */
import java.util.Scanner;

public class RootCalculator2
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        double epsilon = Math.pow(10, -10);

        System.out.print("Please enter a number: ");
        double a = kboard.nextDouble();
        System.out.print("Extract which root? ");
        int r = kboard.nextInt();

        RootApproximator2 myRoot = new RootApproximator2(a, r, epsilon);
        System.out.println(myRoot.nextGuess());

        while (myRoot.hasMoreGuesses())
            System.out.println(myRoot.nextGuess());

    }
}
