import java.util.Scanner;
class rotpairsum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a array length:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter target:");
		int target=in.nextInt();
		int pivot=-1;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				pivot=i;
				break;
			}
		}
		int left,right;
		left=(pivot+1)%n;
		if(pivot!=-1)
			right=pivot;
		else
			right=n-1;
		while(left!=right)
		{
			int sum=arr[left]+arr[right];
			if(sum==target)
			{
				System.out.println("true");
				return;
			}
			else if(sum<target)
			{
				left=(left+1)%n;

			}
			else
				right=(right-1+n)%n;
		}
		System.out.println("False");
	}
}

				