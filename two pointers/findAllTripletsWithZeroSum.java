import java.util.*;
class pair
{
	int value;
	int index;
	pair(int v,int i)
	{
		this.value=v;
		this.index=i;
	}
}
class findAllTripletsWithZeroSum
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
		pair[] a=new pair[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new pair(arr[i],i);
		}
		Arrays.sort(a, (p1,p2) -> Integer.compare(p1.value,p2.value));
		ArrayList<Integer> ar=new ArrayList<>();
		ArrayList<List<Integer>> res=new ArrayList<>();
		for(int i=0;i<n-2;i++)
		{
			int l=i+1,r=n-1;
			while(l<r)
			{
				int sum=a[i].value+a[l].value+a[r].value;
				if(sum==0)
				{
					ar.add(a[i].index);
					ar.add(a[l].index);
					ar.add(a[r].index);
					Collections.sort(ar);
					res.add(new ArrayList(ar));
					ar.clear();
					l++;
					r--;
				}
				else if(sum>0)
					r--;
				else
					l++;
			}
		}
		System.out.println(res);
	}
}

		