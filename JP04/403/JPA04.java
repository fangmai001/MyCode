import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int m,n;
		
		while(true)
		{
			System.out.print("Input m:");
			m=keyboard.nextInt();
			if(m==999)
				break;
			System.out.print("Input n:");
			n=keyboard.nextInt();
			
			System.out.println("Ans (§Àºİ»¼°j) : "+fac(m,n,1));
			System.out.println("Ans (°j°é) : "+loop(m,n,1));
		}
	}
	public static int fac(int a,int b,int c)
	{
		if(b==0)
			return c;
		return fac(a,b-1,c*a);
	}
	public static int loop(int a,int b,int c)
	{
		while(b>0)
		{
			c=c*a;
			b--;
		}
		return c;
	}
}