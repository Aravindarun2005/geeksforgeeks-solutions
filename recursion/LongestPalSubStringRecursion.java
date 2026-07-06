import java.util.Scanner;
class LongestPalSubStringRecursion
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.next();
		System.out.println(find(s,0,s.length()-1,0));
	}
	static int find(String s,int i,int j,int count)
	{
		if(i>j)
		    return count;
		if(i==j)
		    return count+1;
		if(s.charAt(i)==s.charAt(j))
		{
			int curr=find(s,i+1,j-1,count+2);
			int left=find(s,i+1,j,0);
			int right=find(s,i,j-1,0);
			return Math.max(curr,Math.max(left,right));
		}
		int left=find(s,i+1,j,0);
		int right=find(s,i,j-1,0);
		return Math.max(left,right);
	}
}