public class JPA06_3
{
	public static void main(String[] arge)
	{
		
		String[] map = { "北部" , "中部" , "南部" };
		int[][] salary = {{ 120 , 420 , 315 , 250 , 418,818,900 } , 
							{ 312 , 183 , 215 , 89 , 83,600,700 } , 
							{ 215 , 500 , 430 , 210 , 300,918,880 }};

		
		System.out.println("\n\t  第一電腦科技公司週報表 ( 單 位 : 萬 元 ) ");
		System.out.println( "直營店 \t 一 \t 二 \t 三 \t 四 \t 五 \t六 \t 日 \t  ");
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