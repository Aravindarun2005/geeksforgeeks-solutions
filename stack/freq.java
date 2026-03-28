import java.util.Scanner;
import java.util.Arrays;
class freq
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=in.nextInt();
		int[] arr=new int[n];
		int[] vis=new int[n];
		int[] uniq=new int[n];
		int[] frequ=new int[n];
		int[] out=new int[n];
		int c=1,u=0,f=0;
		System.out.println("Enter the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			vis[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			if(vis[i]==0)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						c+=1;
						vis[j]=1;
					}
				}
				uniq[u]=arr[i];
				frequ[f]=c;
				u++;
				f++;
				c=1;
			}
	  	}
		System.out.println(Arrays.toString(uniq));
		System.out.println(Arrays.toString(frequ));
		int max=-1;
		for(int i=0;i<n;i++)
		{
	                int temp=find(arr,i,uniq,u,frequ,f);
			max=temp>max?temp:max;
			out[i]=max;
		}
		System.out.println(Arrays.toString(out));
			
	}
	public static int find(int[] arr,int pos,int[] uniq,int u,int[] frequ,int f)
	{
		int m=-1;
		int ind=-1;
		for(int i=pos+1;i<arr.length;i++)
		{
			int ele=arr[i];
			for(int j=0;j<u;j++)
			{
				if(ele==uniq[j])
				{
					if(frequ[j]>m)
					{
						m=frequ[j];
						ind=j;
					}
				}
			}
		}
		return ind==-1?ind:arr[ind];
	}	
				
				
}
				
		