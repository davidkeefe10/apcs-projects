/**
 * This class tests the Exercise9 class.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise09Tester
{
    public static void main(String[] args)
    {
        Exercise09 myTest = new Exercise09();
        Scanner kboard = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int firstInt = kboard.nextInt();
        System.out.println("Enter another positive integer: ");
        int secondInt = kboard.nextInt();

        System.out.println("Your pythagorean triple is: " + Arrays.toString(myTest.makePythagoreanTriple(firstInt, secondInt)));
    }
}
