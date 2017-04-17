package lab1;

public class SavingAccount extends Account {
	private double interest;
	private int month;
	//private double value;
	
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
			setBalance(a);
			a = setBalance(a);
		}
		return a;
		
	}
	
	public double passTime() {
		month += 1;
		double a = getBalance();
		a = a * Math.pow(1+interest, 1);
		if(month == 12){
			a = a * Math.pow(1+interest, 12);
			setBalance(a);
		}
		return a;
	}
	
	public double estimateValue(int month){
		double a = getBalance();
		this.month += month;
		if(month > 0){
			a = a * Math.pow(1+interest, month);
		}
		//setBalance(value);
		return a;
	}
	
	public double estimateValue(){
		double a = getBalance();

		a = a * Math.pow(1+interest, 1);
		
		//setBalance(value);
		return a;
	}
	
	public String toString(){
		return String.format("SavingAccount_Balance : %.2f", getBalance()); 
	}
}
