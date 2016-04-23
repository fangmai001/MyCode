import java.util.Scanner;

public class JPA05
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String argv[])
	{
		int a[]=new int[10];
		a[0]=0;
		a[1]=1;

		for(int i=2;i<a.length;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}