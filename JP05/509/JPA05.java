public class JPA05
{
	public static void main(String[] argv)
	{
		int[] data = {1, 3, 2, 5, 4, 6};
		
		sort(data);
	}
	public static void sort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					break;
				}
				
			}
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[j]);
			}
			System.out.print("\n");
		}
	}
}