import java.util.Scanner;
class fullpyramid
{
        public static void main(String args[])
        {
                Scanner in=new Scanner(System.in);
                int n=in.nextInt();
		int star=1;
                for(int i=1;i<=n;i++)
                {
                        for(int j=0;j<n-i;j++)
				System.out.print(" ");
			for(int k=0;k<star;k++)
				System.out.printz("*");
			System.out.println();
			star+=2;
                }
        }
}
