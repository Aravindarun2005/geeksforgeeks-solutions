import java.util.Scanner;
/*class reverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int rev=0;
		int temp=n;
		while(temp>0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		System.out.println(rev);
	}
}*/
class sumofdigits
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		findrev(n);
		//System.out.println(sum);
	}
	public static void findrev(int n)
	{
		int rev=0;
		if(n==0)
		   return;
		else
		{
			rev=rev*10+n%10;
			findrev(n/10);
		}
		System.out.println(rev);
	}
}
