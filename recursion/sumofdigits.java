import java.util.Scanner;
/*class sumofdigits
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int sum=0;
		int temp=n;
		while(temp>0)
		{
			sum+=temp%10;
			temp=temp/n;
		}
		System.out.println(sum);
	}
}*/
class sumofdigits
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int sum=findsum(n);
		System.out.println(sum);
	}
	public static int findsum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n%10+findsum(n/10);
		}
	}
}
