import java.util.Scanner;

public class JPA01
{
	public static void main(String args[])
	{
		double totalarea;
		System.out.printf("��έ��n���G%f \n",calCircle(5));
		System.out.printf("�T���έ��n���G%f \n",calTriangle(10,5));
		System.out.printf("��έ��n���G%f \n",calRectangle(5,10));
		totalarea = calCircle(5)+calTriangle(10,5)+calRectangle(5,10);
		System.out.printf("���ϧέ��n���G%f \n",totalarea);
	}
	public static double calCircle(int a)
	{
		return a*a*3.1415926;
	}
	public static double calTriangle(int a,int b)
	{
		return (a*b)/2;
	}
	public static double calRectangle(int a,int b)
	{
		return a*b;
	}
}
