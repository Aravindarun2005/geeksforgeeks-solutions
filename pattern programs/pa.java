import java.util.Scanner;
class pa
{
        public static void main(String args[])
        {
                Scanner in=new Scanner(System.in);
                int n=in.nextInt();
                for(int i=1;i<=n;i++)
                {
                        if(i==n)
                        {
				for(int k=1;k<=n+2;k++)
                                	System.out.print("*");
			}
			else
			{
				System.out.print("*");
				for(int j=1;j<=n;j++)
					System.out.print(" ");
				System.out.print("*");
				System.out.println();
			}
                }
        }
}
