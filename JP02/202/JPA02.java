import java.util.Scanner;

public class JPA02
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		test();
		test();
	}
	public static void test()
	{
		int x;
		int y;
		System.out.println("Input:");
		x=keyboard.nextInt();
		y=keyboard.nextInt();
		if(x>y)
			System.out.println(x+" is larger than "+y);
		else if(y>x)
			System.out.println(y+" is larger than "+x);
	}
}