package lab1;

public class Account {
	protected double balance;
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
	protected void setBalance(double b){
		b = balance;
	}
}