public class JPA06_2
{
    public static void main(String argv[])
    {

        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        System.out.println("SalaryWorker：" + sw1.monthPay());
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        System.out.println("HourlyWorker：" + hw1.monthPay());
        Manager ma1 = new Manager("97001", 240000, 5000);
        System.out.println("Manager：" + ma1.monthPay());

        System.out.println(Employee.isHight(sw1,hw1));
        System.out.println(Employee.isHight(hw1,ma1));

        System.out.println("SalaryWorker稅額：" + sw1.monthTaxes());
        System.out.println("HourlyWorker稅額：" + hw1.monthTaxes());
        System.out.println("Manager稅額：" + ma1.monthTaxes());
    }
}
abstract class Employee
{
	String id;

	Employee(String a)
	{
		id=a;
	}
	double monthTaxes()
	{
		return this.monthPay()*0.15;
	}
	static String isHight(Employee a,Employee b)
	{
		double x=a.monthPay();
		double y=b.monthPay();

		if(x>y)
			return a.id+"較高";
		else
			return b.id+"較高";
	}
	abstract double monthPay();
}
class SalaryWorker extends Employee
{
	int salary;

	SalaryWorker(String a,int b)
	{
		super(a);
		salary=b;
	}
	double monthPay()
	{
		return salary/12;
	}
}
class HourlyWorker extends Employee
{
	int hourly;
	int pay;

	HourlyWorker(String a,int b,int c)
	{
		super(a);
		pay=b;
		hourly=c;
	}
	double monthPay()
	{
		return hourly*pay;
	}
}
class Manager extends SalaryWorker
{
	int bound;

	Manager(String a,int b,int c)
	{
		super(a,b);
		bound=c;
	}
	double monthPay()
	{
		return super.monthPay()+bound;
	}
}
