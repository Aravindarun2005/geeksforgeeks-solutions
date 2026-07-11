import java.util.*;
class SubsetsOfAnArrayTarget
{
	static int count=0;
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
		System.out.println("Enter target:");
		int tar=in.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		findSubsetsSum(arr,0,0,tar,ar);
		System.out.println(count);
	}
	static void findSubsetsSum(int[] arr,int i,int sum,int target,ArrayList<Integer> curr)
	{
		if(i==arr.length)
		{
			if(sum==target)
			{
				System.out.println(curr);
			}
			return;
		}
		curr.add(arr[i]);
		findSubsetsSum(arr,i+1,sum+arr[i],target,curr);
		curr.remove(curr.size()-1);
		findSubsetsSum(arr,i+1,sum,target,curr);

	}
}