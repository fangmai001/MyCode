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
		
		System.out.print("輸入第1組的x和y座標：");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.print("輸入第2組的x和y座標：");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		ans=Math.sqrt((Math.pow(x2-x1,2.0))+(Math.pow(y2-y1,2.0)));
		
		System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",x1,y1,x2,y2,ans);
	}
}