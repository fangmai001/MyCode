import java.util.Scanner;

public class JPA05
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int N;
		float NF;
		float sum=0f;
		
		System.out.print("�п�J�ǥͤH�ơG");
		N=keyboard.nextInt();
		for(int i=0;i<N;i++)
		{
			System.out.printf("��%d�Ӿǥͪ����Z�G",i+1);
			NF=keyboard.nextFloat();
			sum+=NF;
		}
		System.out.println("�H�ơG"+N);
		System.out.println("�`���G"+sum);
		System.out.println("�����G"+sum/N);
	}
}