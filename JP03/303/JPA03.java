import java.util.Scanner;

public class JPA03
{
	public static void main(String[] args)
	{
		int i, num, sum = 0;
		
		System.out.printf("1~1000中的完美數有: ");
		for (num=1;num<=1000;num++)
		{
			sum=0;
			for (i=1;i<num;i++)
			{
			    if(num%i==0)
			    	sum+=i;
			}
			if (sum==i) 
			{
			    System.out.printf("%d ",num);
			}
		}
		System.out.printf("\n");
	}
}