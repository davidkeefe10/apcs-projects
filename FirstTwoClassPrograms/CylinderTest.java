import java.util.Scanner;

public class CylinderTest
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("What is your radius? ");
        int r = kboard.nextInt();

        System.out.println("What is your height? ");
        int h = kboard.nextInt();

        Cylinder yourCylinder = new Cylinder(r,h);
        System.out.println("The volume of your cylinder is: " + yourCylinder.getVolume());
    }
}
