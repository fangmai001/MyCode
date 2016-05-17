class JPD06_1
{   
    public static void main(String args[])
    {
        Apple ab = new Apple();
        Banana bb = new Banana();
        Pudding pt = new Pudding();
        System.out.println("Apple cost:" + ab.getCost());
        System.out.println("Apple price:" + ab.getPrice());
        System.out.println("Banana cost:" + bb.getCost());
        System.out.println("Banana price:" + bb.getPrice());
        System.out.println("Pudding cost:" + pt.getCost());
        System.out.println("Pudding price:" + pt.getPrice());
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