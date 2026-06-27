import java.util.*;
class CountSubArraysWithSumDivByK
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
		hm.put(0,1);
		for(int i=0;i<n;i++)
		{
			prefixsum+=arr[i];
			if(hm.containsKey(prefixsum%k))
			{
				res+=hm.get(prefixsum%k);
				hm.put(prefixsum%k,hm.get(prefixsum%k)+1);
			}
			else
			{
				hm.put(prefixsum%k,1);
			}
		}
		System.out.println(res);			
	}		
}
		
			
			   

		
