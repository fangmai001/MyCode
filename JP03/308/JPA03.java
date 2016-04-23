import java.util.Scanner;

public class JPA03
{
	static Scanner keyboard = new Scanner(System.in);
	static int i = -1;
	
	public static void main(String[] args)
	{
		int total = 0, s = 0;
		
		
		do
		{
			System.out.print("請輸入消費金額，或輸入-1結束：");
			s=keyboard.nextInt();
			if(s==i)
				break;
			total+=s;
		}while(true);
		System.out.print("電腦週邊總消費："+total);
	}
}