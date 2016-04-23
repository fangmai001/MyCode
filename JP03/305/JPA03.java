import java.util.Scanner;

public class JPA03
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		test();
		test();
		test();
	}
	public static void test()
	{
		int N;
		int sum=1;
		System.out.print("Please enter one value: ");
		N=keyboard.nextInt();
		if(N>=1 && N<=10)
		{
			for(int i=1;i<=N;i++)
				sum*=i;
			System.out.printf("%d!: %d\n",N,sum);
		}
		else
		{
			System.out.println("Error, the value is out of range.");
		}
	}
}