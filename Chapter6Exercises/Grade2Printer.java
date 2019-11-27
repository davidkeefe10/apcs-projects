/**
 * This class prints the letter grade corresponding to a numeric value given by the user.
 */

import java. util.Scanner;

public class Grade2Printer
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a numeric value:"); double numGrade =
            in.nextDouble();

        Grade2 g = new Grade2(numGrade);

        System.out.println("Letter grade: " + g.getLetterGrade()) ;
    }
}
