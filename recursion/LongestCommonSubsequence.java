import java.util.*;
class LongestCommonSubsequence
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter s1:");
		String s1=in.next();
		System.out.println("Enter s2:");
		String s2=in.next();
		System.out.println(lcs(s1,s2,0,0));
	}
	static int lcs(String s1,String s2,int i,int j)
	{
		if(i==s1.length()||j==s2.length())
			return 0;
		if(s1.charAt(i)==s2.charAt(j))
			return 1+lcs(s1,s2,i+1,j+1);
		else
		{
			return Math.max(lcs(s1,s2,i+1,j),lcs(s1,s2,i,j+1));
		}
	}
}