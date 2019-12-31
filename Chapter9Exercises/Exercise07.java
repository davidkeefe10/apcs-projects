/**
 * This class determines the roots of a quadratic equation.
 */
import java.util.ArrayList;
import java.util.List;

public class Exercise07
{
    private double[] coefficients = new double[3];

    public Exercise07(double[] quadEq)
    {
        for (int i = 0; i < quadEq.length; i++)
            coefficients[i] = quadEq[i];
    }

    public List<Double> findRoots()
    {
        List<Double> solutions = new ArrayList<Double>();
        double root1 = (-1*coefficients[1] + Math.sqrt(coefficients[1]*coefficients[1] - 4*coefficients[0]*coefficients[2])) / 2*coefficients[0];
        double root2 = (-1*coefficients[1] - Math.sqrt(coefficients[1]*coefficients[1] - 4*coefficients[0]*coefficients[2])) / 2*coefficients[0];

        if (coefficients[0] == 0)
            throw new IllegalArgumentException("a = 0");
        else if (root1 == root2)
            solutions.add(root1);
        else
        {
            solutions.add(root1);
            solutions.add(root2);
        }

        return solutions;
    }
}
