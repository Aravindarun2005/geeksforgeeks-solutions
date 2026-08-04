import java.util.*;
class infixtopostfix
{
	static int prec(char ch)
	{
		if(ch=='^')
			return 3;
		if(ch=='*'||ch=='/')
			return 2;
		if(ch=='+'||ch=='-')
			return 1;
		return -1;
	}
	public static void main(String args[])
	{
		java.util.Stack<Character>stk=new java.util.Stack<>();
		String res="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=in.next();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				res+=ch;
			}
			else
			{
				if(ch=='(')
					stk.push(ch);
				else if(ch==')')
				{
					while(!stk.isEmpty() && stk.peek()!='(')
						res+=stk.pop();
					stk.pop();
				}
				else
				{
					while(!stk.isEmpty() && stk.peek()!='(' && prec(stk.peek())>=prec(ch))
					{
						res+=stk.pop();
					}
					stk.push(ch);
				}
			}
		}
		while(!stk.isEmpty())
			res+=stk.pop();
		System.out.println(res);
	}
}
				
		
			