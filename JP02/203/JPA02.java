import java.util.Scanner;

public class JPA02
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		test();
		test();
	}
	public static void test()
	{
		int N;
		System.out.println("Input an integer:");
		N=input.nextInt();
		if(N%2==0)
			System.out.println("The number is even.");
		else
			System.out.println("The number is odd.");
	}
}
