import java.util.Scanner;

public class JPA01
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		int N;
		
		System.out.print("Please input:");
		N=sc.nextInt();
		System.out.printf("%.6f kg = %.6f ponds",(double)N,(double)N*2.20462);
	}
}
