public class JPA06_4
{
	public static void main(String[] arge)
	{
		String[] map = { "北部" , "中部" , "南部" };
		int[][] salary = {{ 120 , 420 , 315 , 250 , 418,818,900 } , { 312 , 183 , 215 , 89 , 83,600,700 } , { 215 , 500 , 430 , 210 , 300,918,880 }};
		int cost[] = {1500,1515,1858};
		int sum[] = {0,0,0,0,0,0,0};
		int data[] = {180,200,360};
		int[][]  a_box = salary ;
		
		int i , j , i_max , j_max, min;
		double ratio;
		
		i_max=salary.length;
		j_max=salary[0].length;
		
		for( i = 0 ; i <  i_max ; i++ )
		{
			
			for(j=0;j<j_max;j++)
			{
				sum[i]+=salary[i][j];
			}
			cost[i]+=data[i];
			ratio=(((double)sum[i]-(double)cost[i])/(double)cost[i])*100.0;
			
			System.out.print("\n");			
			System.out.print("第"+(i+1)+"間直營店銷售總成本="+cost[i]);
			System.out.println();
			System.out.print("銷售總營業額="+sum[i]);
			System.out.println();
			System.out.printf("銷售銷售毛利=%.2f",ratio);
			System.out.print("%");
			System.out.println();
			System.out.println();
		}
	}
}