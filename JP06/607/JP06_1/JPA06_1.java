public class JPA06_1
{
	public static void main(String args[])
	{
		NB e1 = new NB(1); 
		
		NB e2 = new NB(2);
		
		
	}
}
class NB
{
	String name;
	int cost;
	
	NB(int a)
	{
		if(a==1)
		{
			name="17\"";
			cost=10000;
		}
		else if(a==2)
		{
			name="14\"";
			cost=8500;
		}
		
		this.showData();
	}
	int getCost()
	{
		return cost;
	}
	void showData()
	{
		System.out.printf("一台%s 筆記型電腦的成本:%d\n",name,cost);
	}
}