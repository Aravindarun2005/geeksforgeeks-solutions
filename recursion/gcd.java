class gcd
{
	public static void main(String args[])
	{
		System.out.println(findgcd(2,3));
	}
	static int findgcd(int a ,int b)
	{
		if(b==0)
		{
			return a;
		}
		return findgcd(b,a%b);
	}
}