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
		System.out.print("�п�J�T�Ӿ�ơG");
		a=keyboard.nextInt();
		b=keyboard.nextInt();
		c=keyboard.nextInt();
		
		if(a==0 || b==0 || c==0)
			System.out.println("���i�H�c���T����");
		else if(a+b < c || a+c < b || c+b < a)
			System.out.println("���i�H�c���T����");
		else if((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (c*c)+(b*b)==(a*a))
			System.out.println("�����T����");
		else if((a*a)+(b*b)<(c*c) || (a*a)+(c*c)<(b*b) || (c*c)+(b*b)<(a*a))
			System.out.println("�w���T����");
		else if((a*a)+(b*b)>(c*c) || (a*a)+(c*c)>(b*b) || (c*c)+(b*b)>(a*a))
			System.out.println("�U���T����");
		
	}
}
