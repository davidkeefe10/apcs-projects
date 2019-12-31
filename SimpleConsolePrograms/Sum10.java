import java.util.Scanner;

public class Sum10
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.print("What is your first number? ");
        int firstNumber = kboard.nextInt();

        System.out.print("What is your second number? ");
        int secondNumber = kboard.nextInt();

        if (firstNumber < secondNumber) {
            System.out.print("Your sum is: " + ((secondNumber)*(secondNumber + 1) / 2 - (firstNumber)*(firstNumber - 1) / 2));
        } else {
            System.out.print("Your sum is: " + ((firstNumber) * (firstNumber + 1) / 2 - (secondNumber) * (secondNumber - 1) / 2));
        }

        kboard.close();
    }
}
