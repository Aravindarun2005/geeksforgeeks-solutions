import java.util.Scanner;
import java.util.Arrays;
class AlternatePosNeg
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int j=0,pos;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				if(arr[i]<0)
				{
					pos=search(arr,i);
					if(pos==-1)
						break;
					shift(arr,pos,i);
				}
			}
			else
			{
				if(arr[i]>=0)
				{
					pos=search(arr,i);
					if(pos==-1)
						break;
					shift(arr,pos,i);
				}
			}
		}
		System.out.println(Arrays.toString(arr));							
	}
	static int search(int[] arr,int i)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(i%2==0)
			{
				if(arr[j]>=0)
					return j;
			}
			else
			{
				if(arr[j]<0)
					return j;
			}
		}
		return -1;
	}
	static void shift(int[] arr,int pos,int k)
	{
		int temp=arr[pos];
		for(int i=pos;i>k;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[k]=temp;
	}
 }

					
		
		