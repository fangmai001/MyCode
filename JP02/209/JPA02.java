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
		double x;
		double y;
		
		System.out.print("�п�Jx�y�СG");
		x=keyboard.nextDouble();
		System.out.print("�п�Jy�y�СG");
		y=keyboard.nextDouble();
		
		if(x==0 && y==0)
			System.out.printf("(%.2f,%.2f)�b���I�W\n",x,y);
		else if(y==0)
			System.out.printf("(%.2f,%.2f)�bx�b�W\n",x,y);
		else if(x==0)
			System.out.printf("(%.2f,%.2f)�by�b�W\n",x,y);
		else if(x>0 && y>0)
			System.out.printf("(%.2f,%.2f)�b�Ĥ@�H��\n",x,y);
		else if(x<0 && y>0)
			System.out.printf("(%.2f,%.2f)�b�ĤG�H��\n",x,y);
		else if(x<0 && y<0)
			System.out.printf("(%.2f,%.2f)�b�ĤT�H��\n",x,y);
		else if(x>0 && y<0)
			System.out.printf("(%.2f,%.2f)�b�ĥ|�H��\n",x,y);
	}
}
