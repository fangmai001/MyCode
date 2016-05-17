import java.util.HashMap;

public class JPA06_4
{
    public static void main(String argv[])
    {
        MIS s1 = new IT("John", 88, 90, 76, 68, 84);
        MIS s2 = new IM("Paul", 92, 80, 76, 68);
        MIS s3 = new ITM("Mary", 79, 88, 94, 92, 83, 69);
        System.out.printf("John's elect score: %.2f all score %.2f\n", s1.averageElect(), s1.averageAll());
        System.out.printf("Paul's elect score: %.2f all score %.2f\n", s2.averageElect(), s2.averageAll());
        System.out.printf("Mary's elect score: %.2f all score %.2f\n", s3.averageElect(), s3.averageAll());
        MISClass c1 = new MISClass();
        c1.put("John", s1);
        c1.put("Paul", s2);
        c1.put("Mary", s3);
        c1.list();
    }
}
class MISClass
{
	HashMap<String,MIS> hm=new HashMap<String,MIS>();
	
	void put(String a,MIS b)
	{
		hm.put(a,b);
	}
	void list()
	{
		for(MIS i:hm.values())
		{
			System.out.printf("%s: %.2f\n",i.name,i.averageAll());
		}
	}
}

abstract class MIS
{
	String name;
	int chi;
	int eng;
	static int students=0;
	
	MIS(String a,int b,int c)
	{
		name=a;
		chi=b;
		eng=c;
		students++;
	}
	double averageNeed()
	{
		return (chi+eng)/2.0;
	}
	double averageAll()
	{
		return (this.averageNeed()*0.4)+(this.averageElect()*0.6);
	}
	static int countStudents()
	{
		return students;
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
