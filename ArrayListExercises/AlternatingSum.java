/**
 This class computes the alternating sum
 of a set of data values.
 */
public class AlternatingSum
{
    private double[] data;
    private int dataSize;

    /**
     Constructs an empty data set.
     */
    public AlternatingSum()
    {
        final int DATA_LENGTH = 100;
        data = new double[DATA_LENGTH];
        dataSize = 0;
    }
    /**
     Adds a data value to the data set.
     @param x a data value
     */
    public void add(double x)
    {
        if (dataSize >= data.length)
        {
            // make a new array of twice the size
            double[] newData = new double[2 * data.length];
            // copy over all elements from data to newData
            System.arraycopy(data, 0, newData, 0, data.length);
            // abandon the old array and store in data
            // a reference to the new array
            data = newData;
        }
        data[dataSize] = x;
        dataSize++;
    }
    /**
     Gets the alternating sum of the added data.
     @return sum the sum of the alternating data or 0 if no data has been added
     */
    public double getAlternatingSum()
    {
        double sum = 0;
        for(int i = 0; i < data.length; i++)
        {
            if (i % 2 == 0)
                sum += data[i];
            else
                sum -= data[i];
        }
        return sum;
    }
}

