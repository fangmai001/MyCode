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
			System.out.print("不是2、3、6");
		if(N%2==0)
		{
			if(a)
				System.out.print("、");
			System.out.print("是2");
			a=true;
		}
		if(N%3==0)
		{
			if(a)
				System.out.print("、");
			System.out.print("是3");
			a=true;
		}
		if(N%6==0)
		{
			if(a)
				System.out.print("、");
			System.out.print("是6");
			a=true;
		}
		System.out.print("的倍數\n");
	}
}