import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		String s;
		
		System.out.print("Input a string: ");
		s=keyboard.next();
		System.out.printf("%s has %d As\n",s,countA(s));
		
		System.out.print("Input a string: ");
		s=keyboard.next();
		System.out.printf("%s has %d As\n",s,countA(s));
	}
	public static int countA(String str)
	{
		if(str.equals(""))
			return 0;
		else if(str.substring(0,1).equals("A"))
			return 1+countA(str.substring(1));
		else
			return countA(str.substring(1));
	}
}