/**
 * This class generates a random number between 0 (inclusive) and 14 (exclusive).
 */
public class Exercise05
{
    public char getRandomRps(char[] list)
    {
        return list[(int) (Math.random() * 14)];
    }
}
