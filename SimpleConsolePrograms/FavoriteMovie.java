/**
 * This program asks the user to input their
 * favorite movie and responds with a message.
 */

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.print("What is your favorite movie? ");
        String favoriteMovie = kboard.nextLine();

        System.out.println("I love " + favoriteMovie + ", it's one of my favorite movies too!");

        kboard.close();
    }
}
