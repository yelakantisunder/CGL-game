/**
 * 
 */

/**
 * @author Sunder
 *
 */


public class Board {
	Cell c=new Cell();
	public String printBoard(boolean[][] board)
	{
	if(board==null)
	return "Board is printed";
	int n2=board.length;
	        for(int i=0;i<n2;i++) 
	        {
	            for(int j=0;j<n2;j++)
	            {
	                if(board[i][j]==true)
	                {
	                System.out.print('*');
	                }
	                else
	                {
	               
	                System.out.print('.');
	                }
	            }
	            System.out.println();
	        }
	        return "";
	}
	public boolean createboard(int size,int l[][])
	{


	if(size>=0)
	{
	if(l==null)
	return true;
	boolean s[][]=new boolean[size][size];
	        for(int i=0;i<size;i++)  
	        {
	            for(int j=0;j<size;j++)
	            {
	                s[i][j]=false;
	            }
	        }
	        for(int i=0;i<l.length;i++)
	        {
	            int a=l[i][0],b=l[i][1];
	            s[a][b]=true;
	        }
	        System.out.println("CurrentGenration");
	        printBoard(s);
	        System.out.println("NextGenration");
	        printBoard(c.nextgen(s));
	       
	return true;
	}
	else
	return false;
	       
	}

}