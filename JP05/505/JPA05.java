public class JPA05
{
	public static void main(String[] argv)
	{
		String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		System.out.print("����}�C��Ƥ��e�G ");
		
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.print("\n");
		
		reverse(data);
		
		System.out.print("����}�C��Ƥ���G ");
		
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.print("\n");
		
	}
	public static void reverse(String a[])
	{
		String temp[]=new String[a.length];
		int num=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			temp[num]=a[i];
			num++;
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=temp[i];
		}
	}
}