/**
 * This class determines the first n integers of the fibonacci sequence.
 */
import java.util.ArrayList;
import java.util.List;

public class Exercise11
{
    public List<Integer> fibonacci(int n)
    {
        List<Integer> sequence = new ArrayList<Integer>();
        sequence.add(0);
        sequence.add(1);
        for (int i = 2; i <= n; i++)
            sequence.add(sequence.get(i-2) + sequence.get(i-1));
        return sequence;
    }
}
