import java.util.*;
class findAllPossiblePaths
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter rows and cols:");
		int rows=in.nextInt();
		int cols=in.nextInt();
		int[][]mat=new int[rows][cols];
		System.out.println("Enter matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				mat[i][j]=in.nextInt();
			}
		}
		ArrayList<Integer>path=new ArrayList<>();
		findpaths(mat,0,0,path);
	}
	static void findpaths(int[][] mat,int row,int col,ArrayList<Integer> path)
	{
		path.add(mat[row][col]);
		if(row==mat.length-1 && col==mat[0].length-1)
		{
			System.out.println(path);
			path.remove(path.size()-1);
			return;
		}
		//go right
		if(row+1<mat.length)
			findpaths(mat,row+1,col,path);
		//go down
		if(col+1<mat[0].length)
			findpaths(mat,row,col+1,path);
		//remove element
		path.remove(path.size()-1);
	}
}