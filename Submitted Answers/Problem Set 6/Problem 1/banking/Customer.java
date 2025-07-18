package banking;

public class Customer
{
	private String firstName;
	private String lastName;
	private Account account;

	public Customer(String f, String l)
	{
		this.firstName = f;
		this.lastName = l;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void setAccount(Account acct)
	{
		this.account = acct;
	}

	public Account getAccount()
	{
		return this.account;
	}
}
