/**
 * This class simulates the path of a cannonball shot straight upward
 * given an initial velocity, and prints the position, velocity,
 * and exact formula position after each second and the last interval before it touches the ground.
 */
import java.util.Scanner;

public class CannonballRunner
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter the initial velocity: ");
        double d = kboard.nextDouble();
        Cannonball run = new Cannonball(d);
        double totalTime = 0.0;
        double epsilon = 0.00001;

        do
        {
            run.move(0.01);
            totalTime += 0.01;
            if (totalTime % 1.0 < epsilon || totalTime % 1.0 > (1.0 - epsilon))
            {
                System.out.println("Simulation position: " + run.getPosition() + " Velocity: " + run.getVelocity());
                System.out.println("The exact formula position is: " + (-0.5 * 9.81 * totalTime * totalTime + d * totalTime));
            }
            else if (run.getPosition() < 1 && run.getPosition() > 0)
            {
                System.out.println("Simulation position: " + run.getPosition() + " Velocity: " + run.getVelocity());
                System.out.println("The exact formula position is: " + (-0.5 * 9.81 * totalTime * totalTime + d * totalTime));
            }
        }
        while (run.getPosition() >= 0);
    }
}
