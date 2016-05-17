class JPD06_2
{
    public static void main(String args[])
    {
        PC pc = new PC();
        System.out.println("PC cost:"+pc.getCost()+", price:"+pc.getPrice());
        MultiPC multipc1 = new MultiPC(2, 4);
        System.out.println("MultiPC: 2CPU, 4HD, cost:"+multipc1.getCost()+", price:"+multipc1.getPrice());
        MultiPC multipc2 = new MultiPC(4, 8);
        System.out.println("MultiPC: 4CPU, 8HD, cost:"+multipc2.getCost()+", price:"+multipc2.getPrice());
    }
}
abstract class AllPC
{
	CPU cpu;
	HD hd;
	
	abstract double getPrice();
	abstract double getCost();
}
class PC extends AllPC
{
	PC()
	{
		cpu=new CPU(2.4);
		hd=new HD("160G");
	}
	double getPrice()
	{
		return (cpu.getCost()+hd.getCost())*1.8;
	}
	double getCost()
	{
		return (cpu.getCost()+hd.getCost())+500;
	}
}
class MultiPC extends AllPC
{
	int countCPU;
	int countHD;
	
	MultiPC(int a,int b)
	{
		countCPU=a;
		countHD=b;
		cpu=new CPU(2.4);
		hd=new HD("160G");
	}
	double getPrice()
	{
		return ((cpu.getCost()*countCPU)+(hd.getCost()*countHD))*1.8;
	}
	double getCost()
	{
		return ((cpu.getCost()*countCPU)+(hd.getCost()*countHD))*1.2;
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
