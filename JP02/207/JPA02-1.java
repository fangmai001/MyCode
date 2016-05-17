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
		
		System.out.println("請輸入三個整數：");
		a=keyboard.nextInt();
		b=keyboard.nextInt();
		c=keyboard.nextInt();
		
		if(a==0 || b==0 || c==0)
			System.out.println("不可以構成三角形");
		else if((a+b)<=c)
			System.out.println("不可以構成三角形");
		else if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2) || 
				(Math.pow(a,2)+Math.pow(c,2))==Math.pow(b,2) || 
				(Math.pow(c,2)+Math.pow(b,2))==Math.pow(a,2))
			System.out.println("直角三角形");
		else if((Math.pow(a,2)+Math.pow(b,2))<Math.pow(c,2) || 
				(Math.pow(a,2)+Math.pow(c,2))<Math.pow(b,2) || 
				(Math.pow(c,2)+Math.pow(b,2))<Math.pow(a,2))
			System.out.println("鈍角三角形");
		else if((Math.pow(a,2)+Math.pow(b,2))>c)
			System.out.println("銳角三角形");
	}
}