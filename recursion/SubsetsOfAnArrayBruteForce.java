import java.util.*;
class SubsetsOfAnArrayBruteForce
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
		ArrayList<List<Integer>> ar=new ArrayList<>();
		ArrayList<Integer> ar2=new ArrayList<>();
		ar.add(ar2);
		//ArrayList<Integer> ar3;
		for(int i=0;i<n;i++)
		{
			ArrayList<List<Integer>> newsubsets=new ArrayList<>();
			int num=arr[i];
			for(List<Integer> ar3:ar)
			{
				ArrayList<Integer> temp=new ArrayList<>(ar3);
				temp.add(num);
				newsubsets.add(temp);
			}
			ar.addAll(newsubsets);
		}
		//System.out.println(newsubsets);
		System.out.println(ar);
		
				
	}
}