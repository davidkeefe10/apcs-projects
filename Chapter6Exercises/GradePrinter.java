/**
 * This class tests the Grade class.
 */

import java.util.Scanner;

public class GradePrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter grade:");
        String input = in.nextLine();
        Grade g = new Grade(input); double grade =
            g.getNumericGrade();
        System.out.println("Numeric value: "+ grade);
    }
}
