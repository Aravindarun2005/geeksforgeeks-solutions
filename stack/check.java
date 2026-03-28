import java.util.Scanner;
class Stack {

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node top;

    Stack() {
        top = null;
    }

    public void push(int val) {
        Node newnode = new Node(val);
        newnode.next = top;  // important: stack push must link to old top
        top = newnode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; // must return int
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public boolean isempty() {
        return top == null;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
}

class check {
    public static void main(String args[]) {
        Stack stk = new Stack();
	Stack stk2 = new Stack();
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the no of elements:");
	int n=in.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter element "+i+":");
		int v=in.nextInt();
		stk.push(v);
	}
	while(!stk.isempty())
	{
		int temp=stk.pop();
		if(stk2.isempty())
		{
			stk2.push(temp);
		}
		else
		{
			if(temp>stk2.peek())
			{
				stk2.push(temp);
			}
			else
			{
				while(true)
				{
					int ele=stk2.pop();
					stk.push(ele);
					if(temp>stk2.peek()||stk2.isempty())
					{
						stk2.push(temp);
						break;
					}	
				}
			}
		}
	}
	System.out.println("After sorting using two stacks:");
	for(int i=0;i<n;i++)
	{
		System.out.println(stk2.pop());
	}
    }
}
