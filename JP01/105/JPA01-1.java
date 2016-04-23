import java.util.Scanner;

public class JPA01
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int coin1Count;
		int coin5Count;
		int coin10Count;
		int coin50Count;
		int sum=0;
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.println("請輸入您的名字：");
		name=sc.next();
		System.out.printf("Hi, %s,請輸入您的銅板的個數：\n",name);
		
		System.out.print("請輸入1元的數量：");
		coin1Count=sc.nextInt();
		System.out.print("請輸入5元的數量：");
		coin5Count=sc.nextInt();
		System.out.print("請輸入10元的數量：");
		coin10Count=sc.nextInt();
		System.out.print("請輸入50元的數量：");
		coin50Count=sc.nextInt();
		
		sum+=coin1Count*1;
		sum+=coin5Count*5;
		sum+=coin10Count*10;
		sum+=coin50Count*50;
		
		num4=sum/1000;
		sum=sum%1000;
		num3=sum/100;
		sum=sum%100;
		num2=sum/10;
		sum=sum%10;
		num1=sum;

		System.out.printf("您的錢總共有：%d 千 %d 百 %d 十 %d 元",num4,num3,num2,num1);
	}
}