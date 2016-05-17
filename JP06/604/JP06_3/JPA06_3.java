class JPD06_3
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
        FundAccount fund = new FundAccount("peter", "A", free, special);
		fund.buy(15000, 500);
       	special.withdraw(5000);
		fund.buy(2000, 300);
		fund.sell(fund.getUnit(), 400);					
		
		InternetAccount internet = new InternetAccount();
		internet.setDeposit(deposit);
		internet.setFree(free);
		internet.setSpecial(special);
		internet.setFund(fund);
		System.out.println("¦s´ÚÁ`ÃB¡G" + internet.getTotalBalance());
	}
}
class InternetAccount
{
	DepositAccount depositAccount;
	FreeAccount freeAccount;
	SpecialAccount specialAccount;
	FundAccount fundAccount;
	
	void setDeposit(DepositAccount a)
	{
		depositAccount=a;
	}
	void setFree(FreeAccount a)
	{
		freeAccount=a;
	}
	void setSpecial(SpecialAccount a)
	{
		specialAccount=a;
	}
	void setFund(FundAccount a)
	{
		fundAccount=a;
	}
	int getTotalBalance()
	{
		return depositAccount.balance()+freeAccount.balance()+specialAccount.balance();
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
	void sell(double a,double b)
	{
		unit-=a;
		if(specialAccount.isOver())
			freeAccount.deposit(a*b);
		else
			freeAccount.deposit(a*b*0.98);
	}
	int balance(double a)
	{
		return (int)(unit*a);
	}
	double getUnit()
	{
		return unit;
	}
}
