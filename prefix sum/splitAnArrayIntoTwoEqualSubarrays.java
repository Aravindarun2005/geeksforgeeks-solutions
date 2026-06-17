import java.util.*;
class splitAnArrayIntoTwoEqualSubarrays
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
		for(int i=1;i<n;i++)
		{
			arr[i]=arr[i]+arr[i-1];
		}
		for(int i=0;i<n;i++)
		{
			int l,r;
			if(i==n-1)
			{
			   r=arr[n-1];
			   l=arr[n-2];
			   if(l==r)
			   {
				System.out.println("true");
				return;
			   }
			}
			else
			{
			   l=arr[i];
			   r=arr[n-1]-arr[i];
			   if(l==r)
			   {	
				System.out.println("true");
				return;
			   }
			}
		}
		System.out.println("false");
	}
}
		
			
			   

		
