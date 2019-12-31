/**
 * This class prints a character 'r', 'p', or 's',
 * chosen randomly with odds of 3:5:6, respectively.
 */
public class Exercise05Tester
{
    public static void main(String[] args)
    {
        Exercise05 myTest = new Exercise05();
        char[] rps = new char[]{'r','r','r','p','p','p','p','p','s','s','s','s','s','s'};
        System.out.println(myTest.getRandomRps(rps));
    }
}
