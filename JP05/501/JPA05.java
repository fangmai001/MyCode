import java.util.Scanner;

public class JPA05
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int N;
		int n=0;
		int sum=0;
		int array[]=new int[10];
		
		System.out.println("�п�J10�Ӿ�ơG");
		for(int i=0;i<10;i++)
		{
			System.out.printf("��%d�Ӿ�ơG",i+1);
			N=sc.nextInt();
			array[i]=N;
			if(N>60)
			{
				n++;
				sum+=N;
			}
		}
		
		
		System.out.println("�}�C���j��60����" + n + "��\n�`�X��" + sum + "\n�����Ȭ�" + (sum / (double)n));
	}
}