import java.util.Vector;
import java.util.ArrayList;

class JPA06_5
{
    public static void main(String args[])
    {
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        economy.setPriceRatio(1.2);
        
        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        valuedChoice.setPriceRatio(1.3);
        
        SaleReport sr = new SaleReport();
        sr.add(economy);
        sr.add(valuedChoice);
        System.out.println( sr.getNumberOfLunchBox() + " lunch boxes have been sold.");
        System.out.println("Profit is " + sr.getProfit() + ".");
        
    }
}
class SaleReport
{
	ArrayList<LunchBox> al=new ArrayList<LunchBox>();
	
	void add(LunchBox a)
	{
		al.add(a);
	}
	int getNumberOfLunchBox()
	{
		return al.size();
	}
	int getProfit()
	{
		double sum=0;
		for(LunchBox i:al)
		{
			sum+=i.getPrice()-i.getCost();
		}
		return (int)sum;
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
	double getCost()
	{
		int sum=0;
		for(Food i:content)
		{
			sum+=i.getCost();
		}
		return (double)sum;
	}
	String isCheaperThan(LunchBox a)
	{
		double x=this.getPrice();
		double y=a.getPrice();
		
		if(x<y)
			return "YES!";
		else
			return "NO!";
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
