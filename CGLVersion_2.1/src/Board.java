/**
 * 
 */

/**
 * @author sunder
 *
 */

public class Board
{
	public boolean[][] createBoard(int n, int l[][])
	{
        boolean[][] board = new boolean[n][n];
        
	for (int i = 0; i < l.length; i++)
	{
            int row = l[i][0];
            int col = l[i][1];
            board[row][col] = true;
    }
        
	System.out.println("CurrentGenration");
        
	printBoard(board);
        
	System.out.println("NextGenration");
        
	return board;
    }

    public void printBoard(boolean board[][]) 
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < board.length; i++) 
        {
            for (int j = 0; j < board.length; j++) 
            {
                if (board[i][j])
                    sb.append("*");
                else
                    sb.append(".");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}