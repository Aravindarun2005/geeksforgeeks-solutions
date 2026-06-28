import java.util.Scanner;
class max
{
	public static void main(String args[])
	{
		int[] arr={2,1,8,3};
		System.out.println(findmax(arr,0));
	}
	static int findmax(int[] arr,int i)
	{
		//int maxinrest;
		if(i==arr.length-1)
			return arr[i];
		else
		{
			int maxinrest=findmax(arr,i+1);
			if(arr[i]>maxinrest)
				return arr[i];
			else
				return maxinrest;
		}
	}
}