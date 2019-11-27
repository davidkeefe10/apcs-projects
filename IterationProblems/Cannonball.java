/**
 * This class simulates a cannonball fired up in the air.
 */
public class Cannonball
{
    private double velocity;
    private double position;

    /**
     * Creates a Cannonball object at position 0.
     * @param ivel the initial velocity
     */
    public Cannonball(double ivel)
    {
        velocity = ivel;
        position = 0;
    }

    /**
     * Updates the position and velocity of this
     * cannonball after a given time interval.
     * @param deltaT the time interval
     */
    public void move(double deltaT)
    {
        position = position + velocity*deltaT;
        velocity = velocity - 9.81*deltaT;
    }

    /** Gets the velocity of this cannonball.
     * @return the velocity
     */
    public double getVelocity()
    {
        return velocity;
    }

    /**
     * Gets the position of this cannon ball.
     * @return the (vertical) position
     */
    public double getPosition()
    {
        return position;
    }
}
