package lab1;

public class Account {
	private double balance;
	public double showMoney(){
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
}