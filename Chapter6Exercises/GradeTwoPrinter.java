/**
 * This class prints the letter grade corresponding to a numeric value given by the user.
 */

import java.util.Scanner;

public class GradeTwoPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a numeric value:"); double numGrade =
            in.nextDouble();

        GradeTwo g = new GradeTwo(numGrade);

        System.out.println("Letter grade: " + g.getLetterGrade()) ;
    }
}
