import java.util.*;
class selectionsort
{
	static int[] selectionsort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int minindex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minindex])
					minindex=j;
			}
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println(Arrays.toString(selectionsort(arr)));
	}
}
	
		