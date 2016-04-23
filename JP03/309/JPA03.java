import java.util.Scanner;;

public class JPA03
{
	public static void main(String argv[])
	{
		Scanner sc=new Scanner(System.in);
		int N;
		int sum=0;
		
		N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			if(i%7==0)
				continue;
			if(i%3!=0 && i%5!=0)
				continue;
			sum+=i;
		}
		
		System.out.println("Answer: " + sum);
	}
}