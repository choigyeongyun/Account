package lab1;

public class SavingAccount extends Account {
	private double interest;
	private int month;
	
	SavingAccount(double balance, double interest){
		super(balance);
		this.interest = interest;
	}
	
	@Override
	public void debit (double amount) throws Exception{
		double a = getBalance();
		if (month <= 12){
			throw new Exception("아직 출금할 수 없습니다.");
		}else if(amount < 0){
			throw new Exception("음수 입력!");
		}else{
			a = a - amount;
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
	
	public double EstimateValue(int month){
		double a = getBalance();
		this.month += month;
		if(month > 0){
			a = a * Math.pow(1+interest, month);
		}
		setBalance(a);
		return a;
	}
	
	public String toString(){
		return String.format("SavingAccount_Balance : %.2f", getBalance()); 
	}
}
