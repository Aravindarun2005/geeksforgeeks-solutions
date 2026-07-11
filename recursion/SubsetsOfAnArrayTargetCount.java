import java.util.*;
class SubsetsOfAnArrayTargetCount
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
		//ArrayList<Integer> ar=new ArrayList<>();
		System.out.println(findSubsetsSumCount(arr,0,0,tar));
	}
	static int findSubsetsSumCount(int[] arr,int i,int sum,int target)
	{
		if(i==arr.length)
		{
			if(sum==target)
			{
				return 1;
			}
			return 0;
		}
		//curr.add(arr[i]);
		int take=findSubsetsSumCount(arr,i+1,sum+arr[i],target);
		//curr.remove(curr.size()-1);
		int skip=findSubsetsSumCount(arr,i+1,sum,target);
		return take+skip;
	}
}