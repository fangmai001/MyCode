public class JPD05 {
    public static void main(String[] argv) {
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
    
    public static void park(int hours) {
        int[] hourTable = {0, 2, 4, 6};   // 時段
        int[] feeTable = {30, 50, 80, 100};   // 時段費率
        int fee = 0;   //停車費用
        
        System.out.println("停車時數：" + hours + "小時");
        int temp=hourTable.length-1;
        while(hours < hourTable[temp])
        {
        	temp--;
        }
        while(temp >= 0)
        {
        	fee+=(hours-hourTable[temp])*feeTable[temp];
        	hours=hourTable[temp];
        	temp--;
        }

        System.out.println("應繳費用：" + fee + "元整");
    }
}