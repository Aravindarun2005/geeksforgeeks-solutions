/*Equilibrium Index
Given an array arr[] of size n, find an equilibrium index (if any) or -1 if no equilibrium index exists. The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes. When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.

Note: If multiple equilibrium indices exist, return the first one encountered from left to right.

Examples:

Input: arr[] = [1, 2, 0, 3]
Output: 2
Explanation: The sum on the left of index 2 is 1 + 2 = 3 and sum on the right of index 2 is 3.

Input: arr[] = [1, 1, 1, 1]
Output: -1 
Explanation: There is no equilibrium index in the array.

Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum on the left of index 3 is -7 + 1 + 5 = -1 and sum on the right of index 3 is -4 + 3 + 0 = -1.*/
import java.util.Scanner;
class equilibrium_index_prefix_sum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr=new int[n];
		int[] psarr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int index=-1;
		psarr[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			psarr[i]=psarr[i-1]+arr[i];
		}
		for(int i=0;i<n;i++)
		{
			int leftsum=0,rightsum=0;
			if(i==0)
			{
			    leftsum=0;
			    rightsum=psarr[n-1]-arr[i];
			}
			else if(i==n-1)
			{
			    leftsum=psarr[n-2];
			    rightsum=0;
			}
			else
			{
				leftsum=psarr[i-1];
				rightsum=psarr[n-1]-psarr[i];
			}
			if(leftsum==rightsum)
			{
				index=i;
				break;
			}
		}			
		System.out.println("Equilibrium index is: "+index);
	}
}
			
			
		