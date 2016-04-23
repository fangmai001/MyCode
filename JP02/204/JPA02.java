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
		System.out.println("Input:");
		N=input.nextInt();
		
		if(N%5==0 && N%9==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}