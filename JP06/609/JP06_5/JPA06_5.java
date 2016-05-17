import java.util.LinkedList;

public class JPA06_5
{
    public static void main(String args[])
    {
        try
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
        catch(NewException n)
        {
        	System.out.println(n);
        }
    }
}
class NewException extends Exception
{
	String exc;

	NewException(String a)
	{
		exc=a;
	}
	public String toString()
	{
		return exc;
	}
}

abstract class Stack<T>
{
	T top()throws NewException
	{
		T temp=this.pop();
		this.push(temp);
		return temp;
	}
	abstract void push(T a);
	abstract T pop()throws NewException;
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
	T pop()throws NewException
	{
		if(stack.isEmpty())
		{
			throw new NewException("stack is empty!");
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