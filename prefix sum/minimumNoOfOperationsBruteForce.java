import java.util.*;
class minimumNoOfOperationsBruteForce
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter k:");
		int k=in.nextInt();
		int ans=Integer.MAX_VALUE;
		for(int leftcount=0;leftcount<=n;leftcount++)
		{
			int leftsum=0;
			for(int i=0;i<leftcount;i++)
			{
				leftsum+=arr[i];
			}
			int rightsum=0;
			for(int rightcount=0;rightcount<=n-leftcount;rightcount++)
			{
				if(leftsum+rightsum==k)
				{
					ans=Math.min(ans,leftcount+rightcount);
				}
				if(rightcount<n-leftcount)
				{
					rightsum+=arr[n-1-rightcount];
				}
			}
		}
		if(ans==Integer.MAX_VALUE)
			System.out.println("-1");
		else
			System.out.println(ans);		
	}		
}
		
			
			   

		
