import java.util.Scanner;
class DecToBin
{
	/*public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		int bin=0,place=1;
		while(n>0)
		{
			int rem=n%2;
			bin+=rem*place;
			place*=10;
			n=n/2;
		}
		System.out.println(bin);
	}*/
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		if(n==0)
			System.out.println("0");
		else
			binary(n);
	}
	static void binary(int n)
	{
		if(n==0)
			return;
		else
		{
			binary(n/2);
			System.out.print(n%2);
		}
	}
}