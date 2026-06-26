import java.util.*;
class LongestSpanPrefixSum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		int[] diff=new int[n];
		System.out.println("Enter array 1 elements:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter array 2 elements:");
		for(int i=0;i<n;i++)
		{
			arr2[i]=in.nextInt();
		}
		int max=0,sum1=0,sum2=0;
		for(int i=0;i<n;i++)
		{
			diff[i]=arr1[i]-arr2[i];
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		int sum=0,len=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=diff[i];
			if(hm.containsKey(sum))
			{
				len=Math.max(len,i-hm.get(sum));
			}
			if(!hm.containsKey(sum))
				hm.put(sum,i);
		}
		System.out.println(len);			
	}		
}
		
			
			   

		
