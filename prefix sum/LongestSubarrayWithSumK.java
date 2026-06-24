import java.util.*;
class LongestSubarrayWithSumK
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter k:");
		int k=in.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		int prefixsum=0,res=0;
		for(int i=0;i<n;i++)
		{
			prefixsum+=arr[i];
			if(prefixsum==k)
				res=i+1;
			else if(hm.containsKey(prefixsum-k))
				res=Math.max(res,i-hm.get(prefixsum-k));
			if(!hm.containsKey(prefixsum-k))
				hm.put(prefixsum,i);
		}
		System.out.println(res);			
	}		
}
		
			
			   

		
