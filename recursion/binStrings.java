import java.util.*;
class binStrings
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		print("",n);
	}
	static void print(String str,int n)
	{
		if(str.length()==n)
		{
			System.out.println(str);
			return;
		}
		print(str+"0",n);
		print(str+"1",n);
	}
}