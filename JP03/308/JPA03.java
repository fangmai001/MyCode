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
			System.out.print("�п�J���O���B�A�ο�J-1�����G");
			s=keyboard.nextInt();
			if(s==i)
				break;
			total+=s;
		}while(true);
		System.out.print("�q���g���`���O�G"+total);
	}
}