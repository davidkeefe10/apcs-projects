/**
 * This class prompts the user for an integer and then
 * prints all prime numbers up to and including that integer.
 */
import java.util.Scanner;

public class PrimePrinter
{
    public static void main(String[] args)
    {
        PrimeGenerator myGenerator = new PrimeGenerator();
        Scanner kboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = kboard.nextInt();
        int d = myGenerator.nextPrime();

        while (d <= i)
        {
            System.out.println(d);
            d = myGenerator.nextPrime();
        }
    }
}
