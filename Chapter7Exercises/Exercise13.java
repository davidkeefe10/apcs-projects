/**
 * This class calculates the average score
 * from a group of integer scores.
 *
 * It is called AverageScore in the book.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise13
{
    public static void main(String[] args)
    {
        Scanner input = null;

        try
        {
            input = new Scanner(new File("C:/Users/David/IdeaProjects/Chapter7Exercises.java/out/production/Chapter7Exercises.java/scores.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("***  Can't open scores.dat ***");
            System.exit(1);
        }

        double sum = 0;
        int number = 0;

        while (input.hasNextInt() == true)
        {
            sum += input.nextInt();
            number++;
        }

        System.out.println("The average score is: " + sum/number);
    }
}
