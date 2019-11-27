/**
 * This program asks the user to decide whether to continue.
 */

import java.util.Scanner;

public class Continue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String input = in.nextLine();
        YesNoChecker c = new YesNoChecker(input);
        if(c.isYes())
            System.out.println("OK"); else if (c.isNo())
            System.out.println("Terminating"); else
            System.out.println("Bad Input") ;
    }
}