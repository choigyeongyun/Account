package lab1;

public abstract class Account implements Valuable{
	private double balance;
	public double getBalance(){
		return balance;
	}
	
	public void debit(double amount) throws Exception{
		balance -= amount;
	}
	
	public void credit(double amount){
		balance += amount;
	}
	
	public Account(double amount){
		balance = amount;
	}
	
	protected double setBalance(double b){
		return balance = b;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract double passTime(int t);

}