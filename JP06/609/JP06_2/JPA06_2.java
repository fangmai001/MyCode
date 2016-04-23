import java.util.LinkedList;

public class JPA06_2
{
    public static void main(String args[])
    {
        UnboundedStack s = new UnboundedStack();
        s.push("abc");
        s.push("def");
        s.push("ghi");
        s.push("jkl");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
class UnboundedStack
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