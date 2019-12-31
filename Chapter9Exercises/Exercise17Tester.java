/**
 * This class tests the Exercise17 class.
 */
import java.util.Scanner;

public class Exercise17Tester
{
    public static void main(String[] args)
    {
        Exercise17 myTest = new Exercise17();
        Scanner kboard = new Scanner(System.in);

        System.out.println("How many scores will you enter? ");
        int size = kboard.nextInt();
        int[] myScores = new int[size];

        System.out.println("Enter your scores: ");
        for (int i = 0; i < size; i++)
            myScores[i] = kboard.nextInt();

        System.out.println("The average score is: " + myTest.average(myScores));
    }
}
