import java.util.*;
class LargestSubMatrixWithZero
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of rows and cols:");
		int rows=in.nextInt();
		int cols=in.nextInt();
		int mat[][]=new int[rows][cols];
		System.out.println("Enter matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				mat[i][j]=in.nextInt();
			}
		}
		int maxarea=0;
		for(int top=0;top<rows;top++)
		{
			int temp[]=new int[cols];
			for(int bottom=top;bottom<rows;bottom++)
			{
				for(int col=0;col<cols;col++)
				{
					temp[col]+=mat[bottom][col];
				}
				HashMap<Integer,Integer> hm=new HashMap<>();
				hm.put(0,-1);
				int ps=0,maxlen=0;
				for(int i=0;i<temp.length;i++)
				{
					ps+=temp[i];
					if(hm.containsKey(ps))
					{
						int len=i-hm.get(ps);
						maxlen=Math.max(len,maxlen);
					}
					else
						hm.put(ps,i);
				}
				int height=bottom-top+1;
				int area=height*maxlen;
				maxarea=Math.max(maxarea,area);
			}
		}
		System.out.println(maxarea);
	}
}	
