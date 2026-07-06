import java.util.Scanner;
class LongestPalSubStringNormal
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.next();
		System.out.println(find(s));
	}
	static int find(String s)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			int left=i;
			int right=i+1;
			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
			{
				max=Math.max(max,right-left+1);
				left--;
				right++;
			}
			left=i;
			right=i;
			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
			{
				max=Math.max(max,right-left+1);
				left--;
				right++;
			}
		}
		return max;
	}
}