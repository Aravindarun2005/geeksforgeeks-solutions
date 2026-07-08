import java.util.Scanner;
class invlefthalf
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=n;i>0;i--)
      {
         if(i==n)
         {
            for(int j=0;j<i;j++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
         else
         {
            int space=n-i;
            for(int k=0;k<space;k++)
            {
               System.out.print(" ");
            }
            for(int m=0;m<i;m++)
            {
               System.out.print("*");
                 }
            System.out.println();
         }
      }
   }
}