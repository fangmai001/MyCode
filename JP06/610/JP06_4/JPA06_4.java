import java.util.HashMap;

public class JPA06_4
{
    public static void main(String argv[])
    {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        Manager ma1 = new Manager("97001", 240000, 5000);
        Management m = new Management();
        m.put("96001", sw1);
        m.put("96002", hw1);
        m.put("97001", ma1);
        System.out.println("97001 的稅後薪資： " + m.afterTax("97001"));
    }
}
class Management
{
	HashMap<String,Employee> hm=new HashMap<String,Employee>();

	void put(String a,Employee b)
	{
		hm.put(a,b);
	}
	double afterTax(String a)
	{
		Employee temp=hm.get(a);
		return temp.monthPay()-temp.monthTaxes();
	}
}

abstract class Employee
{
	String id;
	static int countWorkers=0;
	static double countMonthTaxes=0;

	Employee(String a)
	{
		id=a;
		countWorkers++;
	}
	double monthTaxes()
	{
		countMonthTaxes+=this.monthPay()*0.15;
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
	static double getAverageTax()
	{
		return countMonthTaxes/countWorkers;
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
