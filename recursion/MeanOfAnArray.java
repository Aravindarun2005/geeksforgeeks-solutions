import java.util.Scanner;
class MeanOfAnArray
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println(mean(arr,0)/n);
	}
	static double mean(int[] arr,int i)
	{
		int sum=0;
		if(i==arr.length)
			return 0.0;
		else
		{
			sum+=arr[i]+mean(arr,i+1);
			return sum;
		}
	}
}