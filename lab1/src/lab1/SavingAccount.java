package lab1;

public class SavingAccount extends Account {
	private double interest;
	private int month;
	
	SavingAccount(double balance, double interest){
		super(balance);
		this.interest = interest;
	}
	
	@Override
	public void debit (double m){
		double a = getBalance();
		if (month <= 12){
			System.out.println("아직 출금할 수 없습니다.");
		} else {
			a = a - m;
			setBalance(a);
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		double a = getBalance();
		if(month<12){
			a = 0;
		} else {
			return a;
		}
		return a;
	}
	
	@Override
	public double passTime(int t) {
		month += t;
		double a = getBalance();
		if(month == 12){
			a = a * Math.pow(1+interest, 12);
		}
		setBalance(a);
		return a;
	}
}
