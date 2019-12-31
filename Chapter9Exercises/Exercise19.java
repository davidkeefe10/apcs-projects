/**
 * This class separates strings into all of their substrings.
 */
import java.util.Arrays;

public class Exercise19
{
    /**
     * Separates a string into all of its substrings.
     * @param input a string
     * @return the array which contains all of its substrings
     */
    public String[] allSubstrings(String input)
    {
        String[] substrings = new String[(input.length()*(input.length()+1)) / 2];
        int count = 0;
        int i;
        for (i = 1; i <= input.length(); i++)
        {
            for (int n = 0; n < input.length(); n++)
            {
                if (n+i <= input.length())
                {
                    substrings[count] = input.substring(n,n+i);
                    count++;
                }
            }
        }
        return substrings;
    }

    /**
     * Separates an array of strings into their substrings.
     * @param words the array of strings
     * @return a 2-D array which contains all of the substrings of the words.
     */
    public String[][] substring2D(String[] words)
    {
        String[][] output = new String[words.length][1];
        for (int i = 0; i < words.length; i++)
        {
            String s = words[i];
            output [i][0] = Arrays.toString(allSubstrings(s));
        }
        return output;
    }
}
