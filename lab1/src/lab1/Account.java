package lab1;

public abstract class Account {
	private double balance;
	public double getBalance(){
		return balance;
	}
	
	public void debit(double m){
		balance -= m;
	}
	
	public void credit(double m){
		balance += m;
	}
	
	public Account(double m){
		balance = m;
	}
	
	protected double setBalance(double b){
		return balance = b;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract double passTime(int t);
}