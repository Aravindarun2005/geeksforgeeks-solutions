import java.util.Scanner;
class fib
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter n:");
      int n = in.nextInt();
      for(int i=0;i<n;i++)
      {
         System.out.println(fib(i)+" ");
      }
   }
   static int fib(int n)
   {
      if(n==0)
         return 0;
      else if(n==1)
         return 1;
      else
         return fib(n-1)+fib(n-2);
   }
}