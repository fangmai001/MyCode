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
		
		System.out.print("請輸入x座標：");
		x=keyboard.nextDouble();
		System.out.print("請輸入y座標：");
		y=keyboard.nextDouble();
		
		if(x==0 && y==0)
			System.out.printf("(%.2f,%.2f)在原點上\n",x,y);
		else if(y==0)
			System.out.printf("(%.2f,%.2f)在x軸上\n",x,y);
		else if(x==0)
			System.out.printf("(%.2f,%.2f)在y軸上\n",x,y);
		else if(x>0 && y>0)
			System.out.printf("(%.2f,%.2f)在第一象限\n",x,y);
		else if(x<0 && y>0)
			System.out.printf("(%.2f,%.2f)在第二象限\n",x,y);
		else if(x<0 && y<0)
			System.out.printf("(%.2f,%.2f)在第三象限\n",x,y);
		else if(x>0 && y<0)
			System.out.printf("(%.2f,%.2f)在第四象限\n",x,y);
	}
}
