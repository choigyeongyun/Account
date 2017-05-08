package lab1;

import java.util.ArrayList;

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
	
	public static double sumForAccount(ArrayList<? extends Account> list){
		double sum = 0;
		for(Account account : list){
			sum += account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList<? extends Account> list, int month){
		for(Account account : list){
			account.passTime(month);
		}
	}
}