import java.util.Scanner;
class convertStringToInteger
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter s:");
		String s=in.next();
		System.out.println(convert(s));
		
	}
        public static int convert(String s)
	{
		if(s.length()==1)
			return s.charAt(0)-'0';
		int digit=s.charAt(0)-'0';
		return digit*(int)Math.pow(10,s.length()-1)+convert(s.substring(1));
	}
}

