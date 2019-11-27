/**
 This class finds the smallest, middle, and largest of three numbers.
 */

public class DataSet
{
    private double firstNum;
    private double secondNum;
    private double thirdNum;
    private double s;
    private double l;
    private double m;

    /** Constructs a data set that processes three numbers.
     @param num1 the first number to sort
     @param num2 the second number to sort @param num3 the third
     number to sort
     */
    public DataSet(double num1, double num2, double num3)
    {
        firstNum = num1;
        secondNum = num2;
        thirdNum = num3;
    }

    /** Gets the smallest number in the data set.
     @return smallest the smallest of three numbers
     */
    public double getSmallest()
    {
        if (firstNum <= secondNum && firstNum <= thirdNum)
            s = firstNum;
        else if (secondNum <= firstNum && secondNum <= thirdNum)
            s = secondNum;
        else
            s = thirdNum;

        return s;
    }

    /** Gets the largest number in the data set.
     * @return largest the largest of three numbers
     */
    public double getLargest()
    {
        if (firstNum >= secondNum && firstNum >= thirdNum)
            l = firstNum;
        else if (secondNum >= firstNum && secondNum >= thirdNum)
            l = secondNum;
        else
            l = thirdNum;

        return l;
    }

    /** Gets the middle number in the data set.
    * @return middle the middle number of three numbers
    */
    public double getMiddle()
    {
        if ((firstNum >= secondNum && firstNum <= thirdNum) || (firstNum <= secondNum && firstNum >= thirdNum))
            m = firstNum;
        else if ((secondNum >= firstNum && firstNum <= thirdNum) || (secondNum <= firstNum && firstNum >= thirdNum))
            m = secondNum;
        else
            m = thirdNum;

        return m;
    }
}