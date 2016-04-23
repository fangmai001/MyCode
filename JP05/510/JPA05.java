import java.util.Scanner;

public class JPA05
{
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] argv)
    {
        search();
        search();
    }

    public static void search()
    {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; // 已排序資料

        System.out.print("請輸入要找尋的資料：");

        int target = keyboard.nextInt();

        int max=data.length-1;
        int con=0;
        int mid=(max+con)/2;
        int count=0;

        while(mid!=max && mid!=con)
        //while(mid>=0 && max<=data.length-1 && max!=mid)
        {
        	mid=(max+con)/2;
        	count++;
        	System.out.printf("尋找區間：%d(%d)..%d(%d),中間：%d(%d)\n",con,data[con],max,data[max],mid,data[mid]);

        	if(target==data[mid])
        	{
        		break;
        	}
        	else if(target>data[mid])
        	{
        		con=mid+1;
        	}
        	else if(target<data[mid])
        	{
        		max=mid-1;
        	}
        }
        System.out.printf("經過 %d 次的搜尋\n",count);
        if(target==data[mid])
        	System.out.printf("您要找的資料在陣列中的第%d個位置\n",mid);
        else
        	System.out.printf("%d不在陣列中\n",target);
    }
}