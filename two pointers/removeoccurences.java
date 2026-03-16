import java.util.Scanner;
import java.util.Arrays;
class removeoccurences
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
		System.out.println("Enter the ele:");
		int ele=in.nextInt();
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=ele)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(j);
	}
}