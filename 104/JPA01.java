import java.util.Scanner;

public class JPA01
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		double ans;
		
		System.out.print("��J��1�ժ�x�My�y�СG");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.print("��J��2�ժ�x�My�y�СG");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		ans=Math.sqrt((Math.pow(x2-x1,2.0))+(Math.pow(y2-y1,2.0)));
		
		System.out.printf("����(%.2f,%.2f)�M(%.2f,%.2f)�������Z���O%.2f",x1,y1,x2,y2,ans);
	}
}