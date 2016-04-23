import java.util.Scanner;

public class JPA04
{
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String args[])
    {
    	int N;
    	
    	while(true)
    	{
    		System.out.print("Inout n (0 <= n >=16):");
    		N=keyboard.nextInt();
    		if(N==999)
    			break;
    		if(N<=0 || N>=16)
    			continue;
    		System.out.printf("%d ªº¶¥­¼(§ÀºÝ»¼°j) = %d\n",N,fac(N,1));
    		System.out.printf("%d ªº¶¥­¼(°j°é) = %d\n",N,loop(N,1));
    	}
    }
    public static int fac(int a,int b)
    {
    	if(a==0)
    		return b;
    	return fac(a-1,b*a);
    }
    public static int loop(int a,int b)
    {
    	while(a>0)
    	{
    		b=b*a;
    		a=a-1;
    	}
    	return b;
    }
}