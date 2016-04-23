class JPD06_1
{
    public static void main(String args[])
    {
        MiniNote mininote = new MiniNote();
        System.out.println("MiniNote cost:"+mininote.getCost()+", price:"+mininote.getPrice());
        Note15 note15 = new Note15();
        System.out.println("Note15 cost:"+note15.getCost()+", price:"+note15.getPrice());        
    }
}
abstract class Note
{
	LCD lcd;
	CPU cpu;
	HD hd;
	
	double getCost()
	{
		return (lcd.getCost()+cpu.getCost()+hd.getCost())*1.4;
	}
	double getPrice()
	{
		return (lcd.getCost()+cpu.getCost()+hd.getCost())*2.0;
	}
}
class MiniNote extends Note
{
	MiniNote()
	{
		lcd=new LCD(10);
		cpu=new CPU(1.66);
		hd=new HD("120G");
	}
}
class Note15 extends Note
{
	Note15()
	{
		lcd=new LCD(15);
		cpu=new CPU(2.2);
		hd=new HD("160G");
	}
}

abstract class unit
{
	int cost;
	
	double getCost()
	{
		return cost;
	}
}
class LCD extends unit
{
	LCD(int a)
	{
		if(a==10)
			cost=2000;
		else if(a==15)
			cost=2500;
		else if(a==17)
			cost=3000;
	}
}
class CPU extends unit
{
	CPU(double a)
	{
		if(a==1.66)
			cost=6000;
		else if(a==2.2)
			cost=8000;
		else if(a==2.4)
			cost=11000;
	}
}
class HD extends unit
{
	HD(String a)
	{
		if(a.equals("120G"))
			cost=2400;
		else if(a.equals("160G"))
			cost=2800;
	}
}
