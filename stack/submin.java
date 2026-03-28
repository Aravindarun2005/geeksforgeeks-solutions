/*Given an array arr[], Find the number of subarrays whose first element is not greater than other elements of the subarray.

Examples:

Input: arr[] = [1, 2, 1]
Output: 5
Explanation: All subarray are: {1}, {1, 2}, {1, 2, 1}, {2}, {2, 1}, {1}
 From above subarray the following meets the condition: {1}, {1, 2}, {1, 2, 1}, {2}, {1}

Input: arr[] = [1, 3, 5, 2]
Output: 8
Explanation: We have the following subarrays which meet the condition:
 {1}, {1, 3}, {1, 3, 5}, {1, 3, 5, 2}, {3}, {3, 5}, {5}, {2}*/
import java.util.Scanner;
class submin
{
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
		int count=0,nextsmall=-1,temp;
		for(int i=0;i<n;i++)
		{
			int ele=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<ele)
				{
					nextsmall=j;
				        temp=j-i;
					count+=temp;
					break;
				}
			}
			if(nextsmall==-1)
			{
				temp=n-i;
				count+=temp;
			}
			nextsmall=-1;
		}	
		System.out.println(count);
	 }
}	
		
