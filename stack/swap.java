import java.util.Scanner;

class Stack {

    class Node {
        char data;
        Node next;

        Node(char val) {
            data = val;
            next = null;
        }
    }

    Node top;

    public void push(char val) {
        Node newnode = new Node(val);
        newnode.next = top;
        top = newnode;
    }

    public char pop() {
        if (top == null) {
            return 'e';
        }
        char temp = top.data;
        top = top.next;
        return temp;
    }

    public boolean isempty() {
        return top == null;
    }

    public char peek() {
        if (top == null) return 'e';
        return top.data;
    }

    public void printStack() {
        Node curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

class swap {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        Stack input = new Stack();
	String str;
        System.out.println("Enter the string:");
	str=in.next();
	System.out.println("Enter the no:");
	int n=in.nextInt();
	//n-=1;
	String out="";
	int c=0;
	for(int i=0;i<str.length();i++)
	{	if(c+1!=n)
		{
		    char ch=str.charAt(i);
		    input.push(ch);
		    c+=1;
		}
		else
		{
			while(c!=0)
			{
			     char ch=input.pop();
			     if(ch=='e')
			     {
				break;
			     }
			     out+=ch;
			     c-=1;
			}
	         }
	}
	System.out.println(out);
			      
    }
}
