import java.util.Scanner;

public class JPA01
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int sum=0;
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.print("�M��J�z���W�r�G");
		name=sc.next();
		
		System.out.printf("hi, %s,�п�J�z���ɪO�ӼơG\n",name);
		System.out.print("�п�J1�����ƶq�G");
		sum+=sc.nextInt()*1;
		System.out.print("�п�J5�����ƶq�G");
		sum+=sc.nextInt()*5;
		System.out.print("�п�J10�����ƶq�G");
		sum+=sc.nextInt()*10;
		System.out.print("�п�J50�����ƶq�G");
		sum+=sc.nextInt()*50;
		
		num4=sum/1000;
		sum=sum%1000;
		num3=sum/100;
		sum=sum%100;
		num2=sum/10;
		sum=sum%10;
		num1=sum;
		
		System.out.printf("�z�����`�@���G%d �d %d �� %d �Q %d ��",num4,num3,num2,num1);
	}
}