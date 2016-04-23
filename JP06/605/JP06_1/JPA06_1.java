public class JPA06_1
{
    public static void main(String argv[])
    {
        MIS s1 = new IT("John", 88, 90, 76, 68, 84);
        MIS s2 = new IM("Paul", 92, 80, 76, 68);
        System.out.printf("John's elect score: %.2f all score %.2f\n", s1.averageElect(), s1.averageAll());
        System.out.printf("Paul's elect score: %.2f all score %.2f\n", s2.averageElect(), s2.averageAll());
 
    }
}
abstract class MIS
{
	String name;
	int chi;
	int eng;
	
	MIS(String a,int b,int c)
	{
		name=a;
		chi=b;
		eng=c;
	}
	double averageNeed()
	{
		return (chi+eng)/2.0;
	}
	double averageAll()
	{
		return (this.averageNeed()*0.4)+(this.averageElect()*0.6);
	}
	abstract double averageElect();
}
class IT extends MIS
{
	int pl;
	int db;
	int ds;
	
	IT(String a,int b,int c,int d,int e,int f)
	{
		super(a,b,c);
		pl=d;
		db=e;
		ds=f;
	}
	double averageElect()
	{
		return (pl+db+ds)/3.0;
	}
}
class IM extends MIS
{
	int econ;
	int acct;
	
	IM(String a,int b,int c,int d,int e)
	{
		super(a,b,c);
		econ=d;
		acct=e;
	}
	double averageElect()
	{
		return (econ+acct)/2.0;
	}
}