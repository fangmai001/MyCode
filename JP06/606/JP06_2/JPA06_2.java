public class JPA06_2
{
    public static void main(String argv[])
    	{
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        
        System.out.println("John-afterTaxIns¡G" + p1.afterTaxIns());
        System.out.println("Mary-afterTaxIns¡G" + p2.afterTaxIns());
        System.out.println("Peter-afterTaxIns¡G" + f1.afterTaxIns());
        System.out.println("Paul-afterTaxIns¡G" + f2.afterTaxIns());
        System.out.println("Eric-afterTaxIns¡G" + f3.afterTaxIns());

        Manager am1 = new Manager("Fang", 500, 12, 3);
        System.out.println("Fang-Manager¡G" + am1.getTotalSalary());
        System.out.println("Fang-afterTaxIns¡G" + am1.afterTaxIns());


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
