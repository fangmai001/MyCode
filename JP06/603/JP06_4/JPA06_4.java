import java.util.*;

class JPD06_4
{
    public static void main(String args[])
    {
        Deliver d1 = new Deliver();
        d1.addProduct(new A(new Apple(), new Banana()));
        d1.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
        System.out.println("a Price: " + d1.getTotalPrice());
        System.out.println("a Cost: " + d1.getTotalCost());
        System.out.println("a Profit: " + d1.getTotalProfit());
        Deliver d2 = new Deliver();
        d2.addProduct(new B(new Apple(), new Banana(), new Mango()));
        d2.addProduct(new A(new Apple(), new Banana()));
        d2.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
        d2.addProduct(new B(new Apple(), new Banana(), new Mango()));
        System.out.println("b Price: " + d2.getTotalPrice());
        System.out.println("b Cost: " + d2.getTotalCost());
        System.out.println("b Profit: " + d2.getTotalProfit());
    }
}
class Deliver
{
	LinkedList<AAndB> ll=new LinkedList<AAndB>();
	
	void addProduct(AAndB a)
	{
		ll.add(a);
	}
	double getTotalPrice()
	{
		double sum=0;
		for(AAndB i:ll)
		{
			sum+=i.getPrice();
		}
		return sum;
	}
	double getTotalCost()
	{
		double sum=0;
		for(AAndB i:ll)
		{
			sum+=i.getCost();
		}
		return sum;
	}
	double getTotalProfit()
	{
		double sum=0;
		for(AAndB i:ll)
		{
			sum+=i.getProfit();
		}
		return sum;
	}
}

abstract class CAndD extends AAndB
{
	double getProfit()
	{
		return this.getPrice()-this.getCost();
	}
	abstract double getPrice();
	abstract double getCost();
}
class C extends A
{
	C(unit a,unit b)
	{
		super(a,b);
	}
	double getPrice()
	{
		return (unit1.getPrice()+unit2.getPrice())*1.5;
	}
	double getCost()
	{
		return (unit1.getCost()+unit2.getCost())+2;
	}
}
class D extends B
{
	D(unit a,unit b,unit c)
	{
		super(a,b,c);
	}

	double getPrice()
	{
		return (unit1.getPrice()+unit2.getPrice()+unit3.getPrice())*1.5;
	}
	double getCost()
	{
		return (unit1.getCost()+unit2.getCost()+unit3.getCost())+2;
	}
}


abstract class AAndB
{
	double getProfit()
	{
		return this.getPrice()-this.getCost();
	}
	abstract double getPrice();
	abstract double getCost();
}
class A extends AAndB
{
	unit unit1;
	unit unit2;
	
	A(unit a,unit b)
	{
		unit1=a;
		unit2=b;
	}
	double getPrice()
	{
		return unit1.getPrice()+unit2.getPrice();
	}
	double getCost()
	{
		return unit1.getCost()+unit2.getCost();
	}
}
class B extends AAndB
{
	unit unit1;
	unit unit2;
	unit unit3;
	
	B(unit a,unit b,unit c)
	{
		unit1=a;
		unit2=b;
		unit3=c;
	}
	double getPrice()
	{
		return unit1.getPrice()+unit2.getPrice()+unit3.getPrice();
	}
	double getCost()
	{
		return unit1.getCost()+unit2.getCost()+unit3.getCost();
	}
}

class unit
{
	double cost;
	double price;
	
	unit(double a,double b)
	{
		cost=a;
		price=b;
	}
	double getCost()
	{
		return cost;
	}
	double getPrice()
	{
		return price;
	}
}
class Apple extends unit
{
	Apple()
	{
		super(6.0,10.0);
	}
}
class Banana extends unit
{
	Banana()
	{
		super(2.0,5.0);
	}
}
class Pudding extends unit
{
	Pudding()
	{
		super(3.0,5.0);
	}
}
class Strawberry extends unit
{
	Strawberry()
	{
		super(1.0,5.0);
	}
}
class Mango extends unit
{
	Mango()
	{
		super(2.0,5.0);
	}
}