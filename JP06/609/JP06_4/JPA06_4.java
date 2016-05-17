import java.util.LinkedList;

public class JPA06_4
{
    public static void main(String args[])
    {
        UnboundedStack s = new UnboundedStack();
        s.push("abc");
		s.push(2);
		s.push("ghi");
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
abstract class Stack<T>
{
	T top()
	{
		T temp=this.pop();
		this.push(temp);
		return temp;
	}
	abstract void push(T a);
	abstract T pop();
	abstract boolean empty();
}
class UnboundedStack<T> extends Stack<T>
{
	LinkedList<T> stack;

	UnboundedStack()
	{
		stack=new LinkedList<T>();
	}
	void push(T a)
	{
		stack.addFirst(a);
	}
	T pop()
	{
		if(stack.isEmpty())
		{
			return null;
		}
		else
		{
			T temp=stack.getFirst();
			stack.removeFirst();

			return temp;
		}
	}
	boolean empty()
	{
		return stack.isEmpty();
	}
}