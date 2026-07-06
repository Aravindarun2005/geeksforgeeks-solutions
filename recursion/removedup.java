import java.util.Scanner;
class removedup
{
	static String oldstr="";
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=in.next();
		System.out.println(removedup(s));
	}
	/*static String removedup(String s)
	{
		Boolean hasdup=true;
		while(hasdup)
		{
			hasdup=false;
			StringBuilder sb=new StringBuilder();
			int start=0;
			while(start<s.length())
			{
				int end=start;
				while(end<s.length() && s.charAt(start)==s.charAt(end))
				{
					end++;
				}
				if(end-start>1)
				{
					hasdup=true;
				}
				else
					sb.append(s.charAt(start));
				start=end;
			}
			s=sb.toString();
		}
		return s;
	}*/
	static String removedup(String s)
	{
		if(oldstr.equals(s))
			return s;
		else
		{
			StringBuilder sb=new StringBuilder();
			int start=0;
			while(start<s.length())
			{
				int end=start;
				while(end<s.length() && s.charAt(start)==s.charAt(end))
				{
					end++;
				}
				if(end-start==1)
				{
					sb.append(s.charAt(start));	
				}
				start=end;
			}
			oldstr=s;
			return removedup(sb.toString());
		}
	}	
			
			
}
			
				
				