/**
 * This class tests the Exercise19 class.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise19Tester
{
    public static void main(String[] args)
    {
        Exercise19 myTest = new Exercise19();
        Scanner kboard = new Scanner(System.in);

        System.out.println("How many strings will you enter? ");
        int size = kboard.nextInt();
        String[] words = new String[size];

        System.out.println("Enter your words: ");
        for (int i = 0; i < size; i++)
            words[i] = kboard.next();
        System.out.println(Arrays.deepToString(myTest.substring2D(words)).replace("], ", "]\n").replace("[[[","[[").replace("[[", "[").replace("]]]", "]]").replace("]]", "]"));
    }
}
