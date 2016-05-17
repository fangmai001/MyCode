public class JPA06_2
{
    public static void main(String args[])
    {
        BasicCar bc = new BasicCar(1600,"Manual");
        System.out.println("Basic cost: " + bc.cost());
        System.out.println("Basic price: " + bc.price());
    
        LuxCar lc = new LuxCar(2000,"Auto");
        System.out.println("Lux cost: " + lc.cost());
        System.out.println("Lux price: " + lc.price());
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