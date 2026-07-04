import java.util.Scanner;
class prodof2num
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println(prod(a,b));
	}
	static int prod(int a,int b)
	{
		if(b>a)
		   return prod(b,a);
		else if(b!=0)
		   return a+prod(a,b-1);
		else
		   return 0;
	}
}