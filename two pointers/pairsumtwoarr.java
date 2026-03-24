import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Math;
class pairsumtwoarr
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the first array:");
		int n1=in.nextInt();
		System.out.println("Enter the size of the second array:");
		int n2=in.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		System.out.println("Enter array 1 elements:");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter array 2 elements:");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=in.nextInt();
		}
		System.out.println("Enter X:");
		int x=in.nextInt();
		int left=0;
		int right=n2-1;
		ArrayList<Integer> res=new ArrayList<>();
		int mindiff=Integer.MAX_VALUE;
		while(left<n1 && right>=0)
		{
			int sum=arr1[left]+arr2[right];
			if(Math.abs(sum-x)<mindiff)
			{
				mindiff=Math.abs(sum-x);
				res.clear();
				res.add(arr1[left]);
				res.add(arr2[right]);
			}
			if(sum<x)
			{
				left++;
			}
			else
			{
				right--;
			}
	        }
		System.out.println(res);
	}
}
			

		