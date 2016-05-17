import java.util.Scanner;

public class JPA04
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int N;
		
		while(true)
		{
			System.out.print("Input n (0 <= n <= 16):");
			N=keyboard.nextInt();
			if(N==999)
				break;			
			if(N<=0 || N>=16)
				continue;
			System.out.printf("%d ªº¶¥­¼ = %d\n",N,fac(N));
		}
	}
	public static int fac(int a)
	{
		if(a==0)
			return 1;
		return a*fac(a-1);
	}
}
