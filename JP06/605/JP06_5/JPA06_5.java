import java.util.HashMap;

public class JPA06_5
{
    public static void main(String argv[])
    {
        MISClass c1 = new MISClass();
        c1.put("Peter", new IM("Peter", 89, 980, 77, 69));
        
        try
        {
        	c1.list();
        }
        catch(NewException n)
        {
        	
        }
        
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

class MISClass
{
	HashMap<String,MIS> hm=new HashMap<String,MIS>();
	
	void put(String a,MIS b)
	{
		hm.put(a,b);
	}
	void list()throws NewException
	{
		for(MIS i:hm.values())
		{
			
			try
			{
				if(i.averageAll()>100)
					throw new NewException("**"+i.name+": "+i.averageAll());
				else
					System.out.printf("%s: %.2f\n",i.name,i.averageAll());
			}
			catch(NewException n)
			{
				System.out.println(n);
			}
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
