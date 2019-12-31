/**
 * This class creates a pythagorean triple based on two integers.
 */
public class Exercise09
{
    public int[] makePythagoreanTriple(int m, int n)
    {
        int placeholder;
        if (m < n)
        {
            placeholder = m;
            m = n;
            n = placeholder;
        }

        int a;
        int b;
        int c;

        a = m*m - n*n;
        b = 2*m*n;
        c = m*m + n*n;

        if (a > b)
        {
            placeholder = a;
            a = b;
            b = placeholder;
        }

        int[] triple = new int[] {a,b,c};
        return triple;
    }
}
