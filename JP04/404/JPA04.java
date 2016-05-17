import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int m,n;
		
		while(true)
		{
			System.out.print("Input m: ");
			m=keyboard.nextInt();
			if(m==999)
				break;
			System.out.print("Input n: ");
			n=keyboard.nextInt();
			
			System.out.println("最大公因數："+fac(m,n));
		}
	}
	public static int fac(int a,int b)
	{
		if(b==0)
			return a;
		return fac(b,a%b);
	}
}
