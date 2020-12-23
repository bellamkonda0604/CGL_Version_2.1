package cgl_Package;


/**
 * 
 * 
 * @author BELLAMKONDA YASHWANTH AKHIL
 *
 * Create a Cells class and add Method isAlive()
 * 
 * 
 */
public class Cells {
	
	/**
	 * 
	 * @param board
	 * @return
	 */
	public static int  isAlive(boolean board[][]){
		int n=board.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				if(board[i][j])
				{
					count++;
				}
			}
		}
		
		return count;
	}
}

