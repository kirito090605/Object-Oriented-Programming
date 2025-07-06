package banking;

public class CheckingAccount extends Account
{
	private double overdraftprotection;

	public CheckingAccount(double balance)
	{
		super(balance);
	}

	public CheckingAccount(double balance, double protect)
	{
		super(balance);
		this.overdraftprotection = protect;
	}

	@Override
	public boolean withdraw(double amt)
	{
		if(amt <= balance)
		{
			balance -= amt;
			return true;
		}

		else 
		{
			double overdraftNeeded = amt - balance;
			if(overdraftprotection >= overdraftNeeded)
			{
				balance = 0;
				overdraftprotection -= overdraftNeeded;
				return true;
			}
		}
		return false;
	}
}