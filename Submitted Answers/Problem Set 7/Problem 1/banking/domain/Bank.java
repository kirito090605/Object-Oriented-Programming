package banking.domain;

import java.util.ArrayList;

public class Bank
{
	private static Bank bankInstance = new Bank(); 
	private ArrayList<Customer> customers;
	
	private Bank()
	{
		this.customers = new ArrayList<Customer>();
	}

	public void addCustomer(String f, String l)
	{
		this.customers.add(new Customer(f, l));
	}

	public int getNumOfCustomers()
	{
		return this.customers.size();
	}

	public Customer getCustomer(int index)
	{
		return this.customers.get(index);
	}

	public static Bank getBank()
    {
        return bankInstance;
    }

}