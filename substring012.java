import java.util.Scanner;
class substring012
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=in.next();
        int minlen=Integer.MAX_VALUE;
        int left=0,right=0;
	int[] freq=new int[3];
	for(right=0;right<s.length();right++)
	{
		
		freq[s.charAt(right)-'0']++;
		while(freq[0]>0 && freq[1]>0 && freq[2]>0)
		{
			minlen=Math.min(minlen,right-left+1);
			freq[s.charAt(left)-'0']--;
			left++;
		}
	}
	if(minlen==Integer.MAX_VALUE)
		minlen=-1;
	System.out.println(minlen);
				
    }
}