public class JPA06_1
{
    public static void main(String args[])
    {
        Engine e1 = new Engine(1600);
        System.out.println("1600 cost: " + e1.getCost());
        Engine e2 = new Engine(2000);
        System.out.println("2000 cost: " + e2.getCost());
     
        Aircond a1 = new Aircond("Auto");
        System.out.println("Auto: " + a1.getCost());
        Aircond a2 = new Aircond("Manual");
        System.out.println("Manual: " + a2.getCost());
    
        Sound s1 = new Sound();
        System.out.println("Stereo: " + s1.getCost());
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
		if(a.equals("Auto"))
			cost=12000;
		else if(a.equals("Manual"))
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