import java.util.Scanner;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.next();
		System.out.println(rev(s));
	}
	static String rev(String s)
	{
		//int maxinrest;
		if(s.isEmpty())
			return s;
		else
		{
			return rev(s.substring(1))+s.charAt(0);
		}
	}
}