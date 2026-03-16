import java.util.Scanner;
import java.util.Arrays;
class removeduplicates
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements:");
		for(int k=0;k<n;k++)
		{
			arr[k]=in.nextInt();
		}
		int idx=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				arr[idx]=arr[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}