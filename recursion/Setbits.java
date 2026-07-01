import java.util.Scanner;
class Setbits
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		System.out.println(countbits(n));
	}
	static int countbits(int n)
	{
		if(n==0)
			return 0;
		else
		{
			if((n&1)==1)
				return 1+countbits(n>>1);
			else
				return countbits(n>>1);
		}
	}
}