import java.util.Arrays;
class dompair
{
	public static void main(String args[])
	{
		int[] arr={10,8,2,1,1,2};
		Arrays.sort(arr,0,arr.length/2);
		Arrays.sort(arr,arr.length/2,arr.length);
		int left=0,right=arr.length/2,count=0;
		for(left=0;left<arr.length/2;left++)
		{
			while(right<arr.length && arr[left]>=5*arr[right])
			{
				right++;
			}
			count+=(right-arr.length/2);
		}
		System.out.println(count);
	}
}		
		