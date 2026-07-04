import java.util.Scanner;
class halfpyramid
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		pattern(n,1);
	}
	static void pattern(int n,int i)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		if(i==n)
		    return;
		else
	            pattern(n,i+1);
	}
}