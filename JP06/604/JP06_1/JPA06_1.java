class JPD06_1
{
	public static void main(String args[])
	{
		DepositAccount deposit = new DepositAccount("peter", 2);
		deposit.deposit(5000);
		FreeAccount free = new FreeAccount("peter");
		free.deposit(20000);
		SpecialAccount special = new SpecialAccount("peter");
		special.deposit(10000);
		deposit.addInterest();
		free.addInterest();
		special.addInterest();
        System.out.println("定期存款：" + deposit.balance());
		System.out.println("活期存款：" + free.balance());
		System.out.println("優惠存款：" + special.balance());		
		FundAccount fund = new FundAccount("peter", "A", free, special);
		fund.buy(15000, 500);
		System.out.println("基金現額：" + fund.balance(300));
		System.out.println("活期餘額：" + fund.freeAccount.balance());
	}
}
abstract class Account
{
	String name;
	double rate;
	double money;
	
	void deposit(double a)
	{
		money+=a;
	}
	void withdraw(double a)
	{
		money-=a;
	}
	int balance()
	{
		return (int)money;
	}
	void addInterest()
	{
		money+=money*rate;
	}
}
class DepositAccount extends Account
{
	DepositAccount(String a,int b)
	{
		name=a;
		
		if(b==1)
			rate=0.03;
		else if(b==2)
			rate=0.04;
		else if(b==3)
			rate=0.05;
	}
}
class FreeAccount extends Account
{
	FreeAccount(String a)
	{
		name=a;
		rate=0.02;
	}
}
class SpecialAccount extends Account
{
	SpecialAccount(String a)
	{
		name=a;
		rate=0.02;
	}
	boolean isOver()
	{
		if(money>10000)
			return true;
		else
			return false;
	}
}
class FundAccount extends Account
{
	String fundName;
	double unit;
	FreeAccount freeAccount;
	SpecialAccount specialAccount;
	
	FundAccount(String a,String b,FreeAccount c,SpecialAccount d)
	{
		name=a;
		fundName=b;
		freeAccount=c;
		specialAccount=d;
	}
	void buy(double a,double b)
	{
		unit+=a/b;
		if(specialAccount.isOver())
			freeAccount.withdraw(a);
		else
			freeAccount.withdraw(a*1.02);
	}
	void sell(double a)
	{
	}
	int balance(double a)
	{
		return (int)(unit*a);
	}
}
