abstract public class BankAccount
{
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}
	abstract public String deposit(double amount);
	abstract public String  withdraw(double amount);
	public double getBalance()
	{
		return balance;
	}
	public void updateBalance(double amount)
	{
		this.balance=amount;
	}
}