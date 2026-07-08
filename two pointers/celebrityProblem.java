import java.util.Scanner;
class celebrityProblem
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter rows and cols:");
		int r=in.nextInt();
		int c=in.nextInt();
		int[][] mat=new int[r][c];
		int res=-1;
		System.out.println("Enter matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			boolean isceleb=true;
			for(int j=0;j<c;j++)
			{
				if(i!=j)
				{
					if(mat[i][j]==1)
						isceleb=false;
				}
			}
			if(isceleb)
			{
				for(int k=0;k<c;k++)
				{
					if(mat[k][i]==0)
					{
						isceleb=false;
					}
				}
				//System.out.println("rows with 1 found in "+i);
			}
			if(isceleb)
			{
				res=i;
				break;
			}
		}
		System.out.println(res);
	}
}
		