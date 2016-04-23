import java.util.*;

public class JPA03
{
    public static void main(String argv[])
    {
        Scanner sc=new Scanner(System.in);
        int N;
        int sum=0;
        System.out.println("Input:");
        N=sc.nextInt();
        
        for (int i=0; i<=N; i++) 
        {
            sum = sum+i;                       
        }
        System.out.println("1 + ... + "+N+" = "+sum);
    }
}