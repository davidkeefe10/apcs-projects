/**
 * This class tests the Exercise7 class.
 */
import java.util.Scanner;

public class Exercise07Tester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        double[] equation = new double[3];
        System.out.println("Enter the first coefficient of your quadratic equation: ");
        equation[0] = kboard.nextDouble();
        System.out.println("Enter the second coefficient: ");
        equation[1] = kboard.nextDouble();
        System.out.println("Enter the third coefficient: ");
        equation[2] = kboard.nextDouble();
        Exercise07 myTest = new Exercise07(equation);

        System.out.println("The roots of your equation are: " + myTest.findRoots());
    }
}
