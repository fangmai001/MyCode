import java.util.Scanner;

public class JPA01
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		double x1,y1;
		double x2,y2;
		double ans;
		
		System.out.print("請輸入第1組的x和y座標：");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.print("請輸入第2組的x和y座標：");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		
		ans=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f。",x1,y1,x2,y2,ans);
	}
}