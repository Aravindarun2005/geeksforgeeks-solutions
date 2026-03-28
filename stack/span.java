import java.util.Scanner;
import java.util.Arrays;
class demo
{
	static int temptop=-1;
	public static void inc()
	{
		temptop++;
	}
	public static void dec()
	{
		temptop--;
	}
}
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
    public void push(int val) {
        Node newnode = new Node(val);
        newnode.next = top;
        top = newnode;
	demo.inc();
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int temp = top.data;
        top = top.next;
	demo.dec();
        return temp;
    }

    public boolean isempty() {
        return top == null;
    }

    public int peek() {
        if (top == null) return -1;
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

class span {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        Stack stk = new Stack();

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
	int pge;
	
	int []arr=new int[n];
	int []span=new int[n];
        // pushing elements to input stack
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
	{
		int temp=arr[i];
		if(stk.isempty())
		{
			pge=-1;
			span[i]=i-pge;
			stk.push(arr[i]);
		}
		else
		{
			while(!stk.isempty())
			{
				if(stk.peek()>temp)
				{
					stk.push(temp);
					System.out.println("when"+temp+"pushed value of top is "+demo.temptop);
					pge=demo.temptop;
					span[i]=i-pge;
				}
				else
				{
					while(!stk.isempty())
					{
						stk.pop();
						System.out.println("when"+temp+"popped value of top is "+demo.temptop);
						if(stk.isempty())
						{
							pge=-1;
							span[i]=i-pge;
							break;
						}
						if(stk.peek()>temp)
						{
							stk.push(temp);
							System.out.println("when"+temp+"pushed value of top is "+demo.temptop);
							pge=demo.temptop;
							span[i]=i-pge;
						}
					}
				}
		        }
		}
	}
       System.out.println(Arrays.toString(span));
       System.out.println(demo.temptop);
    }
}
