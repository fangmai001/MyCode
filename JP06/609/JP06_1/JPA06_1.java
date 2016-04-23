public class JPA06_1
{
    public static void main(String args[])
    {
        BoundedStack s = new BoundedStack(3);
        s.push("abc");
        s.push("def");
        s.push("ghi");
        s.push("jkl");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
class BoundedStack
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