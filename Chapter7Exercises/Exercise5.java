/**
 * This program prompts the user to enter
 * a positive integer n and a line of text
 * and displays that line n times.
 *
 * It is called HelloNTimes in the book.
 */
import java.util.Scanner;

public class Exercise5
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = kb.nextInt();
        kb.nextLine();  // consume the rest of the line

        System.out.print("Enter a line of text: ");
        String text = kb.nextLine();
        kb.close();

        for (int count = 1; count <= n; count++)
            System.out.println(text);
    }
}
