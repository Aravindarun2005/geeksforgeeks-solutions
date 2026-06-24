import java.util.*;
class minimumNoOfOperationsPrefixSum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		int tot=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			tot+=arr[i];
		}
		System.out.println("Enter k:");
		int k=in.nextInt();
		k=tot-k;
		int ans=Integer.MAX_VALUE,prefixsum=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(0,-1);
		for(int i=0;i<n;i++)
		{
			prefixsum+=arr[i];
			int target=prefixsum-k;
			if(hm.containsKey(target))
			{
				ans=Math.min(ans,i-hm.get(target));
			}
			if(!hm.containsKey(target))
			{
				hm.put(prefixsum,i);

			}
		}
		if(ans==Integer.MAX_VALUE)
			System.out.println("-1");
		else
			System.out.println(n-ans);
		
	}		
}
		
			
			   

		
