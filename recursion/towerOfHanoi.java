import java.util.Scanner;
class towerOfHanoi
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		tower(n,'A','B','C');
	}
        public static void tower(int n,char src,char helper,char des)
	{
		if(n==1)
		{
			System.out.println("Move disk "+n+" from "+src+" to "+des);
			return;
		}
		tower(n-1,src,des,helper);
		System.out.println("Move disk "+n+" from "+src+" to "+des);
		tower(n-1,helper,src,des);
	}
}

