public class JPA06_2
{
   public static void main(String argv[])
   	{
        MIS s3 = new ITM("Mary", 79, 88, 94, 92, 83, 69);
        System.out.printf("Mary's elect score: %.2f all score %.2f\n", s3.averageElect(), s3.averageAll());
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
class ITM extends IT
{
	int acct;
	
	ITM(String a,int b,int c,int d,int e,int f,int g)
	{
		super(a,b,c,d,e,f);
		acct=g;
	}
	double averageElect()
	{
		return (super.averageElect()+acct)/2.0;
	}
	double averageAll()
	{
		return (this.averageNeed()*0.4)+(super.averageElect()*0.4)+(acct*0.2);
	}
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