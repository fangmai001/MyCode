import java.util.Vector;

class JPA06_2
{
    public static void main(String args[])
    {
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        System.out.println("Total calories of an economy lunch box are " + economy.getCalorie() +".");
        
        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie()+".");
        
    }
}
class LunchBox
{
	int calorie;
	Vector<Food> content=new Vector<Food>();
	
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
