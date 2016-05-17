import java.util.*;

public class JPA02
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		test();
		test();
		test();
		test();
		test();
	}
	public static void test()
	{
		int N;
		
		System.out.println("Input:");
		N=keyboard.nextInt();
		
		if(N>=90)
			System.out.println("Your grade is A");
		else if(N>=80)
			System.out.println("Your grade is B");
		else if(N>=70)
			System.out.println("Your grade is C");
		else if(N>=60)
			System.out.println("Your grade is D");
		else
			System.out.println("Your grade is F");
	}
}