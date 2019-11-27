/**
 * This class converts a value in dollars to a value in euros.
 */
public class CurrencyConverter
{
    /**
     * Converts a value in dollars to a value in euros.
     * @param exchangeRate the amount of euros 1 dollar is equivalent to
     * @param value the amount of dollars to convert
     * @return the value in euros
     */
    public double convert(double exchangeRate, double value)
    {
        return exchangeRate*value;
    }
}
