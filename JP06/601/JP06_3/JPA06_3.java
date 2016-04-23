public class JPA06_3
{
    public static void main(String args[])
    {
        SLuxCar llc = new SLuxCar(2000,"Auto");
        System.out.println("SLux cost: "  + llc.cost());
        System.out.println("SLux price: " + llc.price());
        LuxCar lc = new LuxCar(2000,"Auto");
        System.out.println("Is llc more expensive than lc? " + llc.expensive(lc));
   }
}
class SLuxCar extends LuxCar
{
	Sound so;
	
	SLuxCar(int a,String b)
	{
		super(a,b);
		so=new Sound();
	}
	double cost()
	{
		return super.cost()+so.getCost();
	}
}

abstract class Car
{
	Engine en;
	Aircond ai;
	
	double price()
	{
		return this.cost()*1.2;
	}
	String expensive(Car a)
	{
		double x=this.cost();
		double y=a.cost();
		
		if(x>y)
			return "Yes!!";
		else
			return "No!!";
	}
	abstract double cost();
}
class BasicCar extends Car
{
	BasicCar(int a,String b)
	{
		en=new Engine(a);
		ai=new Aircond(b);
	}
	double cost()
	{
		return en.getCost()+ai.getCost()+5000;
	}
}
class LuxCar extends Car
{
	LuxCar(int a,String b)
	{
		en=new Engine(a);
		ai=new Aircond(b);
	}
	double cost()
	{
		return en.getCost()+ai.getCost()+10000;
	}
}

abstract class unit
{
	int cost;
	
	int getCost()
	{
		return cost;
	}
}
class Engine extends unit
{
	Engine(int a)
	{
		if(a==1600)
			cost=20000;
		else if(a==2000)
			cost=25000;
	}
}
class Aircond extends unit
{
	Aircond(String a)
	{
		if(a.equals("Auto"))
			cost=12000;
		else if(a.equals("Manual"))
			cost=10000;
	}
}
class Sound extends unit
{
	Sound()
	{
		cost=2000;
	}
}