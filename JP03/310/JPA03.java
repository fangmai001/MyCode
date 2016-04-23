import java.util.Scanner;

public class JPA03
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int N;
		int sum=0;
		
		do
		{
			System.out.print("請輸入 n 的值(n > 0，且為偶數):");
			N=keyboard.nextInt();
			if(N%2==0 && N>0)
			{
				int i=2;
				do
				{
					sum+=i;
					i+=2;
				}while(i<=N);
				System.out.printf("2+4+...+%d=%d",N,sum);
				break;
			}
		}while(true);
	}
}