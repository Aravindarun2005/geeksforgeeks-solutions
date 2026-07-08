import java.util.Scanner;
class lefthalf
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int space=0;space<n-i;space++)
        {
           System.out.print(" ");
        }
        for(int j=0;j<i;j++)
        {
           System.out.print("*");
        }
        System.out.println();
      }
   }
}
