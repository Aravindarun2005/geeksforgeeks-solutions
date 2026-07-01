import java.util.*;
class MaxAndMin
{
	public static void main(String args[])
	{
		int[] arr={1,4,3,-5,-4,8,6};
		System.out.println(Arrays.toString(findmaxmin(arr,0)));
	}
	static int[] findmaxmin(int[] arr,int i)
	{
		int[] temp=new int[2];
		if(i==arr.length-1)
		{
			temp[0]=arr[i];
			temp[1]=arr[i];
			return temp;
		}
		else
		{
			int[] maxinrest=findmaxmin(arr,i+1);
			if(arr[i]<maxinrest[0])
				maxinrest[0]=arr[i];
			if(arr[i]>maxinrest[1])
				maxinrest[1]=arr[i];
			return maxinrest;
		}
	}
}