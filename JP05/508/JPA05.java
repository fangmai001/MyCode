public class JPA05
{
	public static void main(String[] argv)
	{
		int[] data = {2, 4, 3, 5, 7, 6, 9, 1};  // 為排序的資料
		
		
		for(int i=1;i<data.length;i++)
		{
			for(int j=1;j<data.length;j++)
			{
				if(data[j]<data[j-1])
				{
					int temp=data[j];
					data[j]=data[j-1];
					data[j-1]=temp;
				}
			}
			for(int j=0;j<data.length;j++)
			{
				System.out.print(" "+data[j]);
			}
			System.out.print("\n");
		}
	}
}