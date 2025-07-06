package banking;

public class Bank
{
	private Customer[] customers;
	private int numberOfCustomers;

	public Bank()
	{
		this.customers = new Customer[6];
	}

	public void addCustomer(String f, String l)
	{
		this.customers[this.numberOfCustomers++] = new Customer(f, l);
	}

	public int getNumOfCustomers()
	{
		return this.numberOfCustomers;
	}

	public Customer getCustomer(int index)
	{
		return this.customers[index];
	}

}