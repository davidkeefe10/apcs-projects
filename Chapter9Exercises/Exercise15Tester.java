/**
 * This class tests the Exercise15 class.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise15Tester
{
    public static void main(String[] args)
    {
        Exercise15 myTest = new Exercise15();
        Scanner kboard = new Scanner(System.in);
        System.out.println("What are the dimensions of your checkerboard? ");
        int row = kboard.nextInt();
        int col = kboard.nextInt();
        System.out.println(Arrays.deepToString(myTest.fillCheckerboard(row,col)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]").replace(",", ""));
    }
}
