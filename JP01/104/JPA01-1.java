import java.util.Scanner;

public class JPA01
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		double x1,y1;
		double x2,y2;
		double ans;
		
		System.out.print("�п�J��1�ժ�x�My�y�СG");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.print("�п�J��2�ժ�x�My�y�СG");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		
		ans=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		System.out.printf("����(%.2f,%.2f)�M(%.2f,%.2f)�������Z���O%.2f�C",x1,y1,x2,y2,ans);
	}
}