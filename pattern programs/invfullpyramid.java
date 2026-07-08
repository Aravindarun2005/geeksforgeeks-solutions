import java.util.Scanner;
class invfullpyramid
{
        public static void main(String args[])
        {
                Scanner in=new Scanner(System.in);
                int n=in.nextInt();
		int star=2*n-1,sp=0;
                for(int i=1;i<=n;i++)
                {
                        for(int k=0;k<sp;k++)
				System.out.print(" ");
			for(int j=0;j<star;j++)
				System.out.print("*");
			System.out.println();
			sp++;
			star-=2;
                }
        }
}
