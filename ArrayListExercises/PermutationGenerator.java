import java.lang.Math;
import java.util.ArrayList;
/**
 This class generates permutations of a sequence of
 integers 1...length.
 */
public class PermutationGenerator
{
    private ArrayList<Integer> fixedValues;
    private int place = 0;

    /**
     Constructs a PermutationGenerator object.
     @param length the length of the permutations generated
     by this generator.
     */
    public PermutationGenerator(int length)
    {
        fixedValues = new ArrayList<Integer>();

        for(int i = 0; i < length; i++)
            fixedValues.add(i+1);
    }

    /**
     Gets the next permutation.
     @return the array containing the next permutation
     */
    public int[] nextPermutation()
    {
        int[] permutation = new int[1];
        int r = (int)(Math.random()*(9 - place));
        permutation[0] = fixedValues.get(r);
        fixedValues.remove(r);
        place++;

        return permutation;
    }
}
