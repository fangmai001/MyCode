public class JPA06_3
{
	public static void main(String[] arge)
	{
		
		String[] map = { "�_��" , "����" , "�n��" };
		int[][] salary = {{ 120 , 420 , 315 , 250 , 418,818,900 } , 
							{ 312 , 183 , 215 , 89 , 83,600,700 } , 
							{ 215 , 500 , 430 , 210 , 300,918,880 }};

		
		System.out.println("\n\t  �Ĥ@�q����ޤ��q�g���� ( �� �� : �U �� ) ");
		System.out.println( "���穱 \t �@ \t �G \t �T \t �| \t �� \t�� \t �� \t  ");
		System.out.println( "=====\t====\t====\t====\t====\t====\t====\t====");
		
		for(int i=0;i<salary.length;i++)
		{
			System.out.print(map[i]);
			for(int j=0;j<salary[i].length;j++)
			{
				System.out.print("\t"+salary[i][j]);
			}
			System.out.print("\n");
		}
	}
}