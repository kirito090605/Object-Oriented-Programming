package banking.domain;

import java.util.*;

public class Customer 
{
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;

    public Customer(String f, String l) 
    {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account acct) 
    {
        accounts.add(acct);
    }

    public Account getAccount(int index) 
    {
        return accounts.get(index);
    }

    public int getNumOfAccounts() 
    {
        return accounts.size();
    }

    public String getFirstName() 
    { 
    	return firstName; 
    }
    public String getLastName() 
    { 
    	return lastName; 
    }
}
