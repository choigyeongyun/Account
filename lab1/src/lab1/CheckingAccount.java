package lab1;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	
	CheckingAccount(double balance, double creditLimit, double interest, double loanInterest){
		super(balance);
		credit_limit = creditLimit;
		this.interest = interest;
		loan_interest = loanInterest;
	}
		
	@Override
	public void debit(double amount) throws Exception{
		double a = getBalance();
		if (a - amount < -credit_limit) {
			throw new Exception("Debit amount exceeded account balance");
		}if(amount < 0){
			throw new Exception("음수 입력!");
		}else if(a - amount >= -credit_limit){
			setBalance(a - amount);
		}
	}

	
	public void nextMonth(){
		if (getBalance()>= 0){
			setBalance(getBalance() * (1+interest));
		} else {
			setBalance(getBalance() * (1-loan_interest));
		}
	}
	
	@Override
	public double passTime(int t){
		double a = getBalance();
		if (a >= 0){
			a += a * interest * t;
		} else {
			a += a * loan_interest * t;
		}
		setBalance(a);
		return a;
	}
	
	@Override
	public double getWithdrawableAccount(){
		double b = getBalance() + credit_limit;
		if(b > 0){
			return b;
		} else {
			b = 0;
			return b; 
		}
	}
	
	protected boolean isBankrupted(){
		double c = getWithdrawableAccount();
		if(c == 0){
			return false;
		} else {
			return true;
		}
	}
	
	public double EstimateValue(int month){
		double a = getBalance();
		if (a >= 0){
			a += a * interest * month;
		}
		setBalance(a);
		return a;
	}
	
	public String toString(){
		return String.format("CheckingAccount_Balance : %.2f", getBalance());
	}
}
