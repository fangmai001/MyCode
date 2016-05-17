import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		String s; 
		System.out.print("Input a string of numbers: ");
		s = keyboard.nextLine();
		System.out.printf("§ÀºÝ»¼°j¡G%d\n", sumTail(s, 0));
		System.out.printf("°j°é¡G%d\n", sumLoop(s, 0));
		System.out.print("Input a string of numbers: ");
		s = keyboard.nextLine();
		System.out.printf("§ÀºÝ»¼°j¡G%d\n", sumTail(s, 0));
		System.out.printf("°j°é¡G%d\n", sumLoop(s, 0));
	}
	public static int sumTail(String a,int b)
	{
		if(a.equals(""))
			return b;
		return sumTail(a.substring(1),b+Integer.parseInt(a.substring(0,1)));
	}
	public static int sumLoop(String a,int b)
	{
		while(!a.equals(""))
		{
			b=b+Integer.parseInt(a.substring(0,1));
			a=a.substring(1);
		}
		return b;
	}
}