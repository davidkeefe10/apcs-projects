import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("What is your radius? ");
        int x = kboard.nextInt();

        Circle yourCircle = new Circle(x);
        System.out.println("The area of your circle is: " + yourCircle.getArea());
    }
}
