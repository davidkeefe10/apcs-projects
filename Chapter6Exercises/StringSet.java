/**
 This class finds the smallest, middle, and largest of three strings.
 */

public class StringSet
{
    private String firstString;
    private String secondString;
    private String thirdString;
    private String s;
    private String l;
    private String m;

    /** Constructs a string set that processes three strings.
     @param str1 the first string to sort
     @param str2 the second string to sort
     @param str3 the third string to sort
     */
    public StringSet(String str1, String str2, String str3)
    {
        firstString = str1;
        secondString = str2;
        thirdString = str3;
    }

    /** Gets the smallest string in the string set.
     @return smallest the smallest of three strings
     */
    public String getSmallest()
    {
        if ((firstString.compareTo(secondString) <= 0) && (firstString.compareTo(thirdString) <= 0))
            s = firstString;
        else if ((secondString.compareTo(firstString) <= 0) && (secondString.compareTo(thirdString) <= 0))
            s = secondString;
        else
            s = thirdString;

        return s;
    }

    /** Gets the largest string in the string set. @return largest the
     largest of three strings
     */
    public String getLargest()
    {
        if ((firstString.compareTo(secondString) >= 0) && (firstString.compareTo(thirdString) >= 0))
            l = firstString;
        else if ((secondString.compareTo(firstString) >= 0) && (secondString.compareTo(thirdString) >= 0))
            l = secondString;
        else
            l = thirdString;

        return l;
    }

    /** Gets the middle string in the string set.
     @return middle the middle string of three strings
     */
    public String getMiddle()
    {
        if ((firstString.compareTo(secondString) <= 0 && firstString.compareTo(thirdString) >= 0) || (firstString.compareTo(secondString) >= 0 && firstString.compareTo(thirdString) <= 0))
            m = firstString;
        else if ((secondString.compareTo(firstString) <= 0 && secondString.compareTo(thirdString) >= 0) || (secondString.compareTo(firstString) >= 0 && secondString.compareTo(thirdString) <= 0))
            m = secondString;
        else
            m = thirdString;

        return m;
    }
}