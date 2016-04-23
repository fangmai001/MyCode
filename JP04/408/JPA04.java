import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		String s, c; 
		System.out.print("Input a string: ");
		s = keyboard.nextLine();
		System.out.printf("%s\n", reverse(s));
		System.out.print("Input a string: ");
		s = keyboard.nextLine();
		System.out.printf("%s\n", reverse(s));
	}
	public static String reverse(String a)
	{
		if(a.equals(""))
			return a;
		return reverse(a.substring(1))+a.substring(0,1);
	}
}