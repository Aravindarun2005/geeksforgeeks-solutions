import java.util.Scanner;
import java.util.Arrays;
class permute
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		String txt=in.next();
		System.out.println("Enter the pattern:");
		String pat=in.next();
		int[] freq=new int[26];
		for(int i=0;i<pat.length();i++)
		{
			freq[txt.charAt(i)-'a']+=1;
			freq[pat.charAt(i)-'a']-=1;
		}
		if(check(freq))
		{
			System.out.println("True");
			return;
		}
		for(int i=pat.length();i<txt.length();i++)
		{
			freq[txt.charAt(i)-'a']+=1;
			freq[txt.charAt(i-pat.length())-'a']-=1;
			if(check(freq))
			{
				System.out.println("True");
				return;
			}
		}
		System.out.println("True");
	 }
	 static boolean check(int[] freq)
	 {
		for(int i=0;i<26;i++)
		{
			if(freq[i]!=0)
				return false;
		}
		return true;
	}
}