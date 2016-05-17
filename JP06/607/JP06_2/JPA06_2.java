public class JPA06_2
{
    public static void main(String args[])
    {

        BasicNB bc = new BasicNB(1,"basic");
        System.out.println("商用電腦成本: " + bc.cost());
        System.out.println("商用電腦售價: " + bc.price());
    
        LuxNB lc = new LuxNB(2,"Lux");
        System.out.println("高階雙核心電腦成本: " + lc.cost());
        System.out.println("高階雙核心電腦售價: " + lc.price());
    }
}
abstract class NB
{
	String name;
	int cost;
	int cpuCost;
	
	NB(int a,String b)
	{
		if(a==1)
		{
			name=b;
			cost=5000;
			cpuCost=1000;
		}
		else if(a==2)
		{
			name=b;
			cost=8500;
			cpuCost=2000;
		}
		
	}
	int getCost()
	{
		return cost;
	}
	void showData()
	{
		System.out.printf("一台%s 筆記型電腦的成本:%d\n",name,cost);
	}
	double price()
	{
		return this.cost()*1.5;
	}
	abstract double cost();
}

class BasicNB extends NB
{
	BasicNB(int a,String b)
	{
		super(a,b);
	}
	double cost()
	{
		return cost+cpuCost+1000;
	}
}
class LuxNB extends NB
{
	LuxNB(int a,String b)
	{
		super(a,b);
	}
	double cost()
	{
		return cost+cpuCost+2000;
	}
}
