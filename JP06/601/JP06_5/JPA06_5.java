import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;

public class JPA06_5
{
    public static void main(String args[])
    {
        Scanner sc = null;
        try
        {
            sc = new Scanner(new File("wrongdata.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("File not found!");
            // Stop program if no file found
            System.exit (0);
        }
        
        Wharehouse wh = new Wharehouse();

		try
		{
			while(sc.hasNext())
			{
				String a=sc.next();
				int b=sc.nextInt();
				String c=sc.next();
				
				if(a.equals("B"))
					wh.add(new BasicCar(b,c));
				else if(a.equals("L"))
					wh.add(new LuxCar(b,c));
				else if(a.equals("S"))
					wh.add(new SLuxCar(b,c));
				else
					throw new NewException("Incorrect input data: "+a+" "+b+" "+c);
			}
		}
		catch(NewException n)
		{
			System.out.println(n);
		}
        
        System.out.println("Total cost: " + wh.TotalCost());   
        System.out.println("Total price: " + wh.TotalPirce()); 
    }	
}
class NewException extends Exception
{
	String exc;
	
	NewException(String a)
	{
		exc=a;
	}
	public String toString()
	{
		return exc;
	}
}

class Wharehouse
{
	ArrayList<Car> al=new ArrayList<Car>();
	
	void add(Car a)
	{
		al.add(a);
	}
	double TotalCost()
	{
		double sum=0;
		for(Car i:al)
		{
			sum+=i.cost();
		}
		return sum;
	}
	double TotalPirce()
	{
		double sum=0;
		for(Car i:al)
		{
			sum+=i.price();
		}
		return sum;
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
		if(a.equals("auto"))
			cost=12000;
		else if(a.equals("manual"))
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