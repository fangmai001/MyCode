import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		String s, c;
		System.out.print("Input a string: ");
		s = keyboard.nextLine();
		System.out.print("Input a character: ");
		c = keyboard.nextLine();
		System.out.printf("%s\n", removeChar(s, c));
		System.out.print("Input a string: ");
		s = keyboard.nextLine();
		System.out.print("Input a character: ");
		c = keyboard.nextLine();
		System.out.printf("%s\n", removeChar(s, c));
	}
	public static String removeChar(String a,String b)
	{
		if(a.equals(""))
			return a;
		else if(a.substring(0,1).equals(b))
			return removeChar(a.substring(1),b);
		else
			return a.substring(0,1)+removeChar(a.substring(1),b);
	}
}