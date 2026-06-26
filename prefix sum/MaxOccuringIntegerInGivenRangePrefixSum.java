import java.util.*;
class MaxOccuringIntegerInGivenRangePrefixSum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Enter array 1 elements:");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter array 2 elements:");
		for(int i=0;i<n;i++)
		{
			arr2[i]=in.nextInt();
			if(arr2[i]>max)
				max=arr2[i];
		}
		int[] diff=new int[max+2];
		for(int i=0;i<n;i++)
		{
			diff[arr1[i]]++;
			diff[arr2[i]+1]--;
		}
		int ans=0,prefixsum=0,maxcount=0;
		for(int i=0;i<diff.length;i++)
		{
			prefixsum+=diff[i];
			if(prefixsum>maxcount)
			{
				maxcount=prefixsum;
				ans=i;
			}
		}
		System.out.println(ans);		
					
	}		
}
		
			
			   

		
