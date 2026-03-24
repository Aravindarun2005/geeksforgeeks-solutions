import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=in.nextLine();
		int i=0,j=str.length()-1;
		char[] str1=str.toCharArray();
		while(i<j)
		{
			if(str1[i]==' ')
			{
				i++;
				continue;
			}
			else if(str1[j]==' ')
			{
				j--;
				continue;
			}
			else
			{
				char temp=str1[i];
				str1[i]=str1[j];
				str1[j]=temp;
				i++;
				j--;
			}
	       }
	       System.out.println(String.valueOf(str1));
	}
}