/**
 * This class tests the Exercise13 class.
 */
import java.util.Scanner;

public class Exercise13Tester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("How big is your matrix? ");
        int dimension = kboard.nextInt();
        Exercise13 myTest = new Exercise13(dimension);

        System.out.println("Which element do you want to check? ");
        int row = kboard.nextInt();
        int col = kboard.nextInt();

        if (myTest.isOnDiagonal(row, col))
            System.out.println("Your element is on a diagonal of the matrix.");
        else
            System.out.println("Your element is not on a diagonal of the matrix.");
    }
}
