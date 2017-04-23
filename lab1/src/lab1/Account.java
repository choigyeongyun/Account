package lab1;

public abstract class Account implements Valuable{
	private double balance;
	
	public Account(double balance){
		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double b){
		balance = b;
	}

	public double credit(double money){
		return balance += money;
	}
	
	public void debit(double money) throws Exception{
		balance -= money;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract double passTime(int m);
	
	public abstract double passTime();
}