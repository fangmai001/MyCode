public class JPA06_1
{
    public static void main(String argv[])
    {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        System.out.println("John-PartTime¡G" + p1.salary());
        System.out.println("Mary-PartTime¡G" + p2.salary());
        System.out.println("Peter-FulLTime¡G" + f1.salary());
        System.out.println("Paul-FulLTime¡G" + f2.salary());
        System.out.println("Eric-FulLTime¡G" + f3.salary());
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
