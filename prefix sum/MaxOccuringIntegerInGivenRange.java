import java.util.*;
class MaxOccuringIntegerInGivenRange
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=in.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Enter array 1 elements:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter array 2 elements:");
		for(int i=0;i<n;i++)
		{
			arr2[i]=in.nextInt();
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int l=arr1[i];
			int r=arr2[i];
			for(int j=l;j<=r;j++)
			{
				if(hm.containsKey(j))
					hm.put(j,hm.getOrDefault(j,0)+1);
				else
					hm.put(j,1);
			}
		}
		int maxfreq=Integer.MIN_VALUE,answer=-1;
		for(Map.Entry<Integer,Integer> entry:hm.entrySet())
		{
			int ele=entry.getKey();
			int freq=entry.getValue();
			if(freq>maxfreq)
			{
				maxfreq=freq;
				answer=ele;
			}
			else if(freq==maxfreq && ele<answer)
				answer=ele;
		}
		System.out.println(answer);			
	}		
}
		
			
			   

		
