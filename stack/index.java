import java.util.Scanner;

class Stack {

    class Node {
        char data;      // changed int → char
        Node next;

        Node(char val) {
            data = val;
            next = null;
        }
    }

    Node top;

    Stack() {
        top = null;
    }

    public void push(char val) {   // changed int → char
        Node newnode = new Node(val);
        newnode.next = top;
        top = newnode;
    }

    public char pop() {            // changed int → char
        if (top == null) {
            System.out.println("Stack is empty");
            return '\0';           // return null-character for empty
        }
        char temp = top.data;
        top = top.next;
        return temp;
    }

    public boolean isempty() {
        return top == null;
    }

    public char peek() {           // changed int → char
        if (top == null) {
            System.out.println("Stack is empty");
            return '\0';
        }
        return top.data;
    }
}
class index
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=in.next();
		System.out.println("Enter the no:");
		int n=in.nextInt();
		Stack stk=new Stack();
		for(int i=n;i<str.length();i++)
		{
			if(str.charAt(i)=='[')
			{
				stk.push(str.charAt(i));
			}
			if(str.charAt(i)==']')
			{
				stk.pop();
				if(stk.isempty())
				{
					System.out.println(i);
					break;
				}
			}
		}
	
	}
}