import java.util.Vector;

class JPA06_3
{
    public static void main(String args[])
    {
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        economy.setPriceRatio(1.2);
        System.out.println("Total calories of an economy lunch box are " + economy.getCalorie());
        System.out.println("The price of an economy lunch box is " + economy.getPrice());
        
        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        valuedChoice.setPriceRatio(1.3);
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie());
        System.out.println("The price of a valued-choice lunch box is " + valuedChoice.getPrice());        
    }
}
class LunchBox
{
	int calorie;
	Vector<Food> content=new Vector<Food>();
	double priceRatio;
	
	void add(Food a)
	{
		content.add(a);
	}
	int getCalorie()
	{
		calorie=0;
		for(Food i:content)
		{
			calorie+=i.getCalorie();
		}
		return calorie;
	}
	void setPriceRatio(double a)
	{
		priceRatio=a;
	}
	double getPrice()
	{
		int sum=0;
		for(Food i:content)
		{
			sum+=i.getCost();
		}
		return (double)sum*(double)priceRatio;
	}
}

abstract class Food
{
	int amount;
	int calorie;
	int unitCost;
	
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
	void setUnitCost(int a)
	{
		unitCost=a;
	}
	int getCost()
	{
		return unitCost*amount;
	}
}
class Rice extends Food
{
	Rice(int a)
	{
		super(a);
		setCaloriePerGram(1);
		setUnitCost(1);
	}
}
class Egg extends Food
{
	Egg(int a)
	{
		super(a);
		setCaloriePerGram(2);
		setUnitCost(2);
	}
}
class Cabbage extends Food
{
	Cabbage(int a)
	{
		super(a);
		setCaloriePerGram(1);
		setUnitCost(3);
	}
}
class PorkRib extends Food
{
	PorkRib(int a)
	{
		super(a);
		setCaloriePerGram(10);
		setUnitCost(8);
	}
}
class Carrot extends Food
{
	Carrot(int a)
	{
		super(a);
		setCaloriePerGram(1);
		setUnitCost(3);
	}
}
