public class JPA06_3
{
    public static void main(String argv[])
    {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        
        Manager am1 = new Manager("Fang", 500, 12, 3);
       
        
        am1.compare(f3);
        p1.compare(f3);
    }
}
class Manager extends FullTimeTeacher
{
	int rank;
	
	Manager(String a,int b,int c,int d)
	{
		super(a,b,c);
		
		rank=d;
	}
	double getTotalSalary()
	{
		 return this.salary();
	}
	double salary()
	{
		return super.salary()+(rank*500);
	}
}

abstract class Teacher
{
	String name;
	int rate;
	int totalHours;
	double pay;
	
	Teacher(String a,int b,int c)
	{
		name=a;
		rate=b;
		totalHours=c;
	}
	double afterTaxIns()
	{
		return this.salary()*0.9-100;
	}
	void compare(Teacher a)
	{
		double x=this.salary();
		double y=a.salary();
		
		if(x>y)
			System.out.println(this.name+" is higher than "+a.name);
		else if(x<y)
			System.out.println(a.name+" is higher than "+this.name);
	}
	abstract double salary();
}
class PartTimeTeacher extends Teacher
{
	PartTimeTeacher(String a,int b,int c)
	{
		super(a,b,c);
	}
	double salary()
	{
		return totalHours*rate;
	}
}
class FullTimeTeacher extends Teacher
{
	FullTimeTeacher(String a,int b,int c)
	{
		super(a,b,c);
	}
	double salary()
	{
		return 9.0*rate+((totalHours-9.0)*rate*0.8);
	}
}
