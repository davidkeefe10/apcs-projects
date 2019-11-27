/**
 * This class reads U.S. dollar values and converts
 * each to euro values until the user enters "Q".
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverterTester
{
    public static void main(String[] args)
    {
        CurrencyConverter test = new CurrencyConverter();

        Scanner kboard = new Scanner(System.in);
        DecimalFormat twoDigits = new DecimalFormat("###.##"); //Used to round the output to two decimal places.

        System.out.print("How many euros is one dollar? ");
        double k = kboard.nextDouble();
        System.out.print("Dollar value (Q to quit): ");
        String s = kboard.next();

        boolean done = false;

        while (!done)
        {
            if(s.equals("Q"))
                done = true;
            else
            {
                double d = Double.parseDouble(s);
                System.out.println(d + " dollar = " + twoDigits.format(test.convert(k, d)) + " euro");
                System.out.print("Dollar value (Q to quit): ");
                s = kboard.next();
                done = false;
            }
        }
    }
}
