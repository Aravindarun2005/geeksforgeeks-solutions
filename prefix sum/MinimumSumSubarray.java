import java.util.*;
class MinimumSumSubarray
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
		int currsum=arr[0];
		int minsum=arr[0];
		for(int i=1;i<n;i++)
		{
			currsum=Math.min(arr[i],currsum+arr[i]);
			minsum=Math.min(currsum,minsum);
		}
		System.out.println(minsum);			
	}		
}
		
			
			   

		
