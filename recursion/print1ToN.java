import java.util.Scanner;
class print1ToN
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		print(n);
	}
	static void print(int n)
	{
		if(n==0)
			return;
		else
		{
			print(n-1);
			System.out.print(n+" ");
		}
	}
}