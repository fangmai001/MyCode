import java.util.*;

public class JPA02
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		test();
		test();
		test();
		test();
	}
	public static void test()
	{
		int N;
		boolean a=false;
		
		System.out.println("Enter an integer:");
		N=input.nextInt();
		
		System.out.print(N);
		if(N%2!=0 && N%3!=0 && N%6!=0)
			System.out.print("���O2�B3�B6");
		if(N%2==0)
		{
			if(a)
				System.out.print("�B");
			System.out.print("�O2");
			a=true;
		}
		if(N%3==0)
		{
			if(a)
				System.out.print("�B");
			System.out.print("�O3");
			a=true;
		}
		if(N%6==0)
		{
			if(a)
				System.out.print("�B");
			System.out.print("�O6");
			a=true;
		}
		System.out.print("������\n");
	}
}