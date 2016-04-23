import java.util.Scanner;

public class JPA05
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int N;
		float NF;
		float sum=0f;
		
		System.out.print("請輸入學生人數：");
		N=keyboard.nextInt();
		for(int i=0;i<N;i++)
		{
			System.out.printf("第%d個學生的成績：",i+1);
			NF=keyboard.nextFloat();
			sum+=NF;
		}
		System.out.println("人數："+N);
		System.out.println("總分："+sum);
		System.out.println("平均："+sum/N);
	}
}