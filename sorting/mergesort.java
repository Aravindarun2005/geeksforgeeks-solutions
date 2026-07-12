import java.util.*;
class mergesort
{
	static int[] mergesort(int[] arr)
	{
		if(arr.length==1)
			return arr;
		int mid=arr.length/2;
		int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
		int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,right);
	}
	static int[] merge(int[] left,int[] right)
	{
		int[] joined=new int[left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
				joined[k++]=left[i++];
			else
				joined[k++]=right[j++];
		}
		while(i<left.length)
		{
			joined[k++]=left[i++];
		}
		while(j<right.length)
		{
			joined[k++]=right[j++];
		}
		return joined;
	}
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
		System.out.println(Arrays.toString(mergesort(arr)));
	}
}
	
		