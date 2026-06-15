import java.util.Scanner;
class equilibrium_index_brute_force
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
		int index=-1;
		for(int i=0;i<n;i++)
		{
			int leftsum=0,rightsum=0;
			for(int j=0;j<i;j++)
			{
				leftsum+=arr[j];
			}
			for(int j=i+1;j<n;j++)
			{
				rightsum+=arr[j];
			}
			if(leftsum==rightsum)
			{
				index=i;
				break;
			}
			System.out.println("Iteration: "+i+"leftsum:"+leftsum+"rightsum:"+rightsum);
		}
		System.out.println("Equilibrium index is: "+index);
	}
}
			
			
		