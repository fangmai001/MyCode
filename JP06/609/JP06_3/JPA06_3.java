import java.util.LinkedList;

public class JPA06_3
{
    public static void main(String args[])
    {
        TraceUnboundedStack s2 = new TraceUnboundedStack();
        s2.push("abc");
        s2.push("def");
        s2.push("ghi");
        s2.push("jkl");
        System.out.println(s2.getSize());
        System.out.println(s2.top());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.getSize());
    }
}
class TraceUnboundedStack extends UnboundedStack
{
	TraceUnboundedStack()
	{
		stack=new LinkedList<String>();
	}
	void push(String a)
	{
		System.out.println("Pushing:"+a);
		super.push(a);
	}
	String pop()
	{
		String temp=super.pop();
		System.out.println("Poping:"+temp);
		return temp;
	}
	boolean empty()
	{
		return super.empty();
	}
	int getSize()
	{
		return stack.size();
	}
}
abstract class Stack
{
	String top()
	{
		String temp=this.pop();
		this.push(temp);
		return temp;
	}
	abstract void push(String a);
	abstract String pop();
	abstract boolean empty();
}
class UnboundedStack extends Stack
{
	LinkedList<String> stack;

	UnboundedStack()
	{
		stack=new LinkedList<String>();
	}
	void push(String a)
	{
		stack.addFirst(a);
	}
	String pop()
	{
		if(stack.isEmpty())
		{
			return "stack is empty";
		}
		else
		{
			String temp=stack.getFirst();
			stack.removeFirst();

			return temp;
		}
	}
	boolean empty()
	{
		return stack.isEmpty();
	}
}
class BoundedStack extends Stack
{
	String stack[];
	int top=-1;
	int size=0;

	BoundedStack(int a)
	{
		size=a;
		stack=new String[size];
	}
	void push(String a)
	{
		if(top>=size-1)
		{
			System.out.println("stack-overflow");
		}
		else
		{
			top++;
			stack[top]=a;
		}
	}
	String pop()
	{
		if(top<0)
		{
			return "stack-is-empty";
		}
		else
		{
			String temp=stack[top];
			top--;
			return temp;
		}
	}
	boolean empty()
	{
		if(size<=0)
		{
			return true;
		}
		else
		{
			return  false;
		}
	}
}