/**
 * This class determines if an element of a square matrix is on one of its diagonals.
 */
public class Exercise13
{
    private int n;
    private int[][] matrix = new int[n][n];

    public Exercise13 (int size)
    {
        n = size;
    }

    public boolean isOnDiagonal(int i, int j)
    {
        if (i > (n - 1) || j > (n - 1))
            throw new IndexOutOfBoundsException("element not in array");
        else if (i == j)
            return true;
        else if (i == (n-1 - j))
            return true;
        else
            return false;
    }
}
