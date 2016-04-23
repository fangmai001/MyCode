import java.util.*;

public class JPA02
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		test();
		test();
		test();
		test();
	}
	public static void test()
	{
		int a,b,c;
		System.out.print("請輸入三個整數：");
		a=keyboard.nextInt();
		b=keyboard.nextInt();
		c=keyboard.nextInt();
		
		if(a==0 || b==0 || c==0)
			System.out.println("不可以構成三角形");
		else if(a+b < c || a+c < b || c+b < a)
			System.out.println("不可以構成三角形");
		else if((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (c*c)+(b*b)==(a*a))
			System.out.println("直角三角形");
		else if((a*a)+(b*b)<(c*c) || (a*a)+(c*c)<(b*b) || (c*c)+(b*b)<(a*a))
			System.out.println("鈍角三角形");
		else if((a*a)+(b*b)>(c*c) || (a*a)+(c*c)>(b*b) || (c*c)+(b*b)>(a*a))
			System.out.println("銳角三角形");
		
	}
}
