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
		int N;
		System.out.println("Please enter score:");
		N=keyboard.nextInt();
		if(N>=60)
			System.out.println("You pass");
		System.out.println("End");
	}
}