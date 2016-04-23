import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n;
		
		System.out.print("Input the number n: ");
		n=keyboard.nextInt();
		System.out.println("Ans: "+sum2(n));
	}
	public static int sum2(int a)
	{
		if(a==1)
			return 2;
		return sum2(a-1)+(2*a);
	}
}