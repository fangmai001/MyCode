import java.util.Scanner;

public class JPA03
{
	
	public static void main (String argv[])
	{
		int num1, num2;
		
		System.out.println("Input:"); 
		
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			num1=sc.nextInt();
			if(num1==999)
				break;
			num2=sc.nextInt();
			System.out.println(gcd(num1,num2));
			System.out.println("Input:"); 
		}
	}
	public static int gcd (int m, int n)
	{
		int result=1;
		int i=1;
		while (i<=m && i<=n)
		{
			if(m%i==0 && n%i==0)
				result=i;
			i++;
		}
		return result;
	}
}