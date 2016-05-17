public class JPA01
{
	public static void main(String arvg[])
	{
		System.out.printf("f(-3.2) = %.4f\n",f(-3.2));
		System.out.printf("f(-2.1) = %.4f\n",f(-2.1));
		System.out.printf("f(0) = %.4f\n",f(0));
		System.out.printf("f(2.1) = %.4f\n",f(2.1));
	}
	public static double f(double x)
	{
		return (3.0*(Math.pow(x,3.0)))+(2.0*x)-1.0;
	}
}