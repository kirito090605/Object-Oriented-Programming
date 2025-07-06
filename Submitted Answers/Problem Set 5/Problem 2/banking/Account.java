package banking;

public class Account
{
	private double balance;

	public Account(double init_balance)
	{
		this.balance = init_balance;
	}

	public double getBalance()
	{
		return this.balance;
	}

	public boolean deposit(double amount)
	{
		this.balance += amount;
		return true;
	}

	public boolean withdraw(double amount)
	{
		if(amount < this.balance)
		{
			this.balance -= amount;
			return true;
		}
		return false;
	}


}