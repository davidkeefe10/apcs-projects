/**
 * This class is used to calculate the average
 * and standard deviation of a data set.
 */
public class DataSet
{
    private double sum;
    private double sumSquare;
    private int n;
    private double value; //Used for getMaximum method

    /**
     * Constructs a DataSet object to hold the total number of inputs,
     * the sum, and the sum of square.
     */
    public DataSet()
    {
        sum = 0;
        sumSquare = 0;
        n = 0;
    }

    /**
     * Adds a value to this data set.
     * @param x the input value
     */
    public void add(double x)
    {
        value = x;
        sum = sum + x;
        sumSquare = sumSquare + x * x;
        n++;
    }

    /**
     * Method used to calculate the average of the data set.
     * @return average the average of the data set
     */
    public double getAverage()
    {
        return sum/n;
    }

    /**
     * Method used to calculate the standard deviation.
     * @return stddev the standard deviation of data set
     */
    public double getStandardDeviation()
    {
        return Math.sqrt((sumSquare - (1.0/n)*sum*sum)/(n-1));
    }

    /**
     * Gets the total number of input values.
     * @return n the total number of inputs
     */
    public int getCount()
    {
        return n;
    }

    /**
     * Determines the maximum value in the data set.
     * Used for RandomDataAnalyzer (problem 11)
     * @return the maximum value
     */
    public double getMaximum()
    {
        double max = -Double.MAX_VALUE;

        if (value > max)
            max = value;

        return max;
    }
}
