class JPD06_3
{
    public static void main(String args[])
    {
        C t1 = new C (new Apple(), new Banana());
		D t2 = new D (new Banana(), new Pudding(), new Strawberry());
		D t3 = new D (new Apple(), new Banana(), new Mango());

        System.out.println("t1 cost:" + t1.getCost());
    	System.out.println("t1 price:" + t1.getPrice());
        System.out.println("t1 profit:" + t1.getProfit());
        System.out.println("t2 cost:" + t2.getCost());
    	System.out.println("t2 price:" + t2.getPrice());
        System.out.println("t2 profit:" + t2.getProfit());
        System.out.println("t3 cost:" + t3.getCost());
    	System.out.println("t3 price:" + t3.getPrice());
        System.out.println("t3 profit:" + t3.getProfit());
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