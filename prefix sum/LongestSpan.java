import java.util.*;
class LongestSpan
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
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
		//System.out.println(Arrays.toString(arr1));
		//System.out.println(Arrays.toString(arr2));
		int max=0,sum1=0,sum2=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				sum1+=arr1[j];
				sum2+=arr2[j];
				if(sum1==sum2)
					max=Math.max(max,j-i+1);
			}
			sum1=0;
			sum2=0;
		}
		System.out.println(max);
					
	}		
}
		
			
			   

		
