import java.util.Scanner;

public class JPA01
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		int N1,N2,N3;
		System.out.println("Please input:");
		N1=sc.nextInt();
		N2=sc.nextInt();
		N3=sc.nextInt();
		
		System.out.printf("Average: %.2f",(N1+N2+N3)/3.0);
	}
}