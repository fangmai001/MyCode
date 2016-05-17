import java.util.Scanner;

public class JPA03
{
	public static void main(String[] args)
	{
		int total = 0;
		int s = 0;
		int count = 0;
		double average;
		
		System.out.print("Please enter meal dollars or enter -1 to stop: ");
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			s=sc.nextInt();
			if(s==-1)
				break;
			total+=s;
			count++;
			System.out.print("Please enter meal dollars or enter -1 to stop: ");
		}
		average=(double)total/(double)count;
		
		System.out.println("餐點總費用:"+total);
		System.out.printf(" %d 道餐點平均費用為: %.2f %n",count,average);
	}
}