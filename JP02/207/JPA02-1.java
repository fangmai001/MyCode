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
		
		System.out.println("�п�J�T�Ӿ�ơG");
		a=keyboard.nextInt();
		b=keyboard.nextInt();
		c=keyboard.nextInt();
		
		if(a==0 || b==0 || c==0)
			System.out.println("���i�H�c���T����");
		else if((a+b)<=c)
			System.out.println("���i�H�c���T����");
		else if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2) || 
				(Math.pow(a,2)+Math.pow(c,2))==Math.pow(b,2) || 
				(Math.pow(c,2)+Math.pow(b,2))==Math.pow(a,2))
			System.out.println("�����T����");
		else if((Math.pow(a,2)+Math.pow(b,2))<Math.pow(c,2) || 
				(Math.pow(a,2)+Math.pow(c,2))<Math.pow(b,2) || 
				(Math.pow(c,2)+Math.pow(b,2))<Math.pow(a,2))
			System.out.println("�w���T����");
		else if((Math.pow(a,2)+Math.pow(b,2))>c)
			System.out.println("�U���T����");
	}
}