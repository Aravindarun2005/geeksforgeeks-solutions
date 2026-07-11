import java.util.*;
class SubsetsOfAnArrayRecursion
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
		ArrayList<Integer> ar=new ArrayList<>();
		findSubsets(arr,0,ar);	
	}
	static void findSubsets(int[] arr,int i,ArrayList<Integer> curr)
	{
		if(i==arr.length)
		{
			System.out.println(curr);
			return;
		}
		curr.add(arr[i]);
		findSubsets(arr,i+1,curr);
		curr.remove(curr.size()-1);
		findSubsets(arr,i+1,curr);
	}
}