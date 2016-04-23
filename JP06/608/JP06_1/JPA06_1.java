class JPA06_1
{
    public static void main(String args[])
    {
        Rice rice = new Rice(100);
        System.out.println( rice.getAmount() + " grams of rice has " + rice.getCalorie() + " calories.");
        
        Egg egg = new Egg(30);
        System.out.println( egg.getAmount() + " grams of egg has " + egg.getCalorie() + " calories.");
        
        Cabbage cabbage = new Cabbage(50);
        System.out.println( cabbage.getAmount() + " grams of cabbage has " + cabbage.getCalorie() + " calories.");
        
        PorkRib porkRib = new PorkRib(300);
        System.out.println( porkRib.getAmount() + " grams of pork rib has " + porkRib.getCalorie() + " calories.");
        
        Carrot carrot = new Carrot(100);
        System.out.println( carrot.getAmount() + " grams of carrot has " + carrot.getCalorie() + " calories.");  
    }
}
abstract class Food
{
	int amount;
	int calorie;
	
	Food(int a)
	{
		amount=a;
	}
	void setCaloriePerGram(int a)
	{
		calorie=a;
	}
	int getAmount()
	{
		return amount;
	}
	int getCalorie()
	{
		return calorie*amount;
	}
}
class Rice extends Food
{
	Rice(int a)
	{
		super(a);
		setCaloriePerGram(1);
	}
}
class Egg extends Food
{
	Egg(int a)
	{
		super(a);
		setCaloriePerGram(2);
	}
}
class Cabbage extends Food
{
	Cabbage(int a)
	{
		super(a);
		setCaloriePerGram(1);
	}
}
class PorkRib extends Food
{
	PorkRib(int a)
	{
		super(a);
		setCaloriePerGram(10);
	}
}
class Carrot extends Food
{
	Carrot(int a)
	{
		super(a);
		setCaloriePerGram(1);
	}
}
