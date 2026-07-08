import java.util.Scanner;
class ncr
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n and r:");
		int n=in.nextInt();
		int r=in.nextInt();
		System.out.println(ncr(n,r));
		
	}
        public static int ncr(int n,int r)
	{
		if(r==0||r==n)
		{
			return 1;
		}
		return ncr(n-1,r-1)+ncr(n-1,r);
	}
}

