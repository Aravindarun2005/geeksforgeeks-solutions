import java.util.Scanner;
class smallestsubarrsum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter x:");
		int x=in.nextInt();
		int start=0,sum=0,minlen=Integer.MAX_VALUE;
		for(int end=0;end<n;end++)
		{
			sum+=arr[end];
			while(sum>x)
			{
				minlen=Math.min(minlen,end-start+1);
				sum-=arr[start];
				start++;
			}
		}
		if(minlen==Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(minlen);
	   }
}
			
		