import java.util.Scanner;
class graytobin
{
	static StringBuilder gray=new StringBuilder();
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Binary String:");
		String s=in.next();
		gray.append(s.charAt(0));
		convert(s,1);
		System.out.println(gray);
	}
	static void convert(String s,int i)
	{
		if(i==s.length())
			return;
		else
		{
			if(s.charAt(i-1)==s.charAt(i))
				gray.append("0");
			else
				gray.append("1");
			convert(s,i+1);
		}
	}
}