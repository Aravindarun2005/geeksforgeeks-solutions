import java.util.*;
class SubsequencesOfAnString
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=in.next();
		StringBuilder sb=new StringBuilder("");
		findsub(s,0,sb);
		
	}
	static void findsub(String s,int i,StringBuilder curr)
	{
		if(i==s.length())
		{
			System.out.println("\""+curr+"\"");
			return;
		}
		curr.append(s.charAt(i));
		findsub(s,i+1,curr);
		curr.deleteCharAt(curr.length()-1);
		findsub(s,i+1,curr);
	}
	
}