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
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; // �w�ƧǸ��

        System.out.print("�п�J�n��M����ơG");

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
        	System.out.printf("�M��϶��G%d(%d)..%d(%d),�����G%d(%d)\n",con,data[con],max,data[max],mid,data[mid]);

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
        System.out.printf("�g�L %d �����j�M\n",count);
        if(target==data[mid])
        	System.out.printf("�z�n�䪺��Ʀb�}�C������%d�Ӧ�m\n",mid);
        else
        	System.out.printf("%d���b�}�C��\n",target);
    }
}