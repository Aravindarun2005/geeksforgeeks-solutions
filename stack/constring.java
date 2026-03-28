import java.util.Scanner;
class constring
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of strings:");
		int n=in.nextInt();
		String []arr=new String[n];
		System.out.println("Enter the strings:");
		for(int i=0;i<n;i++)
		{
		     arr[i]=in.next();
		}
		boolean c=true;
		while(c)
		{
			c=false;
			System.out.println("OUter called");
			outer:
			for(int i=0;i<n;i++)
			{
					if(arr[i].equals(arr[i+1]))
					{
			 			arr=delete(arr,i,i+1);
						/*System.out.println("New arr");
						for(int k=0;k<arr.length;k++)
						{
							System.out.print(arr[k]+" ");
						}*/
						n=arr.length;
						break outer;
					}
	        	}
		}
		/*for(String s:arr)
		{
			System.out.print(s+" ");
		}
		System.out.print(arr.length);*/
	  	
	}
	public static String[] delete(String []arr,int a,int b)
	{
		int j=0;
		String newarr[]=new String[arr.length-2];
		for(int i=0;i<arr.length;i++)
		{
		     if(i!=a&&i!=b)
		     {
			newarr[j]=arr[i];
			j++;
		     }
		}
		System.out.println("New arr from delete");
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}
		return newarr;
	} 	
}
			