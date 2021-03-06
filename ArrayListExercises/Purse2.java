import java.util.ArrayList;
import java.util.Collections;
/**
 A purse holds a collection of coins.
 */
public class Purse2
{
    private ArrayList<String> coins;

    /**
     Constructs an empty purse.
     */
    public Purse2()
    {
        coins = new ArrayList<String>();
    }

    /**
     Adds a coin to the purse.
     @param coinName the coin to add
     */
    public void addCoin(String coinName)
    {
        coins.add(coinName);
    }

    /**
     Returns a string describing the object.
     @return a string in the format "Purse[coinName1,coinName2,...]"
     */
    public String toString()
    {
        String array = "Purse[";
        for (int a = 0; a < coins.size(); a++)
            array += coins.get(a) + ",";
        array = array.substring(0,array.length() - 1);
        array += "]";
        return array;
    }

    /**
     Reverses the elements in the purse.
     */
    public void reverse()
    {
            Collections.reverse(coins);
    }
}
