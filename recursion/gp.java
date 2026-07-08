import java.util.Scanner;
class gp
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		System.out.printf("%.5f",gp(n));
		
	}
        public static double gp(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return 1.0/Math.pow(3,n)+gp(n-1);
	}
}

