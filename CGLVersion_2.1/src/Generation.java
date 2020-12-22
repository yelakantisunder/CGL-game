/**
 * 
 */

/**
 * @author Sunder
 *
 */

public class Generation 
{
	public int countLiveCells(boolean[][] currentGeneration, int p, int q) 
	{
        int n = currentGeneration.length;
        int countOfLives = 0;
        for (int i = p - 1; i <= p + 1; ++i)
        {
            for (int j = q - 1; j <= q + 1; ++j)
            {
                if (i != p || j != q) {
                    if (i >= 0 && i < n && j >= 0 && j < n && currentGeneration[i][j]) 
                    {
                        countOfLives += 1;
                    }
                }
            }
        }
        return countOfLives;
    }
}