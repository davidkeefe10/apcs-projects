/**
 * This class creates a checkerboard of alternating x's and .'s.
 */
public class Exercise15
{
    public char[][] fillCheckerboard(int r, int c)
    {
        char[][] board = new char[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int n = 0; n < c; n++)
            {
                if ((i + n) % 2 == 0)
                    board[i][n] = '.';
                else
                    board[i][n] = 'x';
            }
        }
        return board;
    }
}
