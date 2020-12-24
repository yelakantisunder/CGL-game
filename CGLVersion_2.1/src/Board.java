/**
 * 
 */

/**
 * @author sunder
 *
 */

public class Board {
	boolean[][] board;int size;int[][]liveCells;
	public Board(int n, int[][] l) {
		// TODO Auto-generated constructor stub
		boolean[][] board = new boolean[n][n];
		
		for (int i = 0; i < l.length; i++) {
			int row = l[i][0];
			int col = l[i][1];
			board[row][col] = true;
		}
		this.board=board;
		this.size=n;
		this.liveCells = l;
	}

	
	public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (this.board[i][j])
                    sb.append("*");
                else
                    sb.append(".");
            }
            if(i== this.size-1) {
            break;
            }
            else {
            	sb.append("\n");
            }
        }
        
		return sb.toString() ;
    }

}