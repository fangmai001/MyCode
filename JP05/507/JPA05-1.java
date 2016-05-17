public class JPA05
{
	public static void main(String[] argv)
	{
		int hours = 0;   //停車時數
		
		hours = 2;
		park(hours);
		System.out.println("--------------------");
		
		hours = 3;
		park(hours);
		System.out.println("--------------------");
		
		hours = 5;
		park(hours);
		System.out.println("--------------------");
		
		hours = 8;
		park(hours);
	}
	public static void park(int hours)
	{
		int[] hourTable = {0, 2, 4, 6};   // 時段
		int[] feeTable = {30, 50, 80, 100};   // 時段費率
		int fee = 0;   //停車費用
		
		System.out.println("停車時數：" + hours + "小時");
		if(hours>6)
		{
			fee+=(hours-6)*100;
			hours-=(hours-6);
		}
		int aa[]={0,30,60,110,160,240,320};
		fee+=aa[hours];
		
		System.out.println("應繳費用：" + fee + "元整");
	}
}