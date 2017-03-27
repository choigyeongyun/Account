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
	public void debit(double m){
		if (getBalance()-m < -credit_limit) {
			System.out.print("credit limit amount exceeded account balance");
		} else if(getBalance()-m >= -credit_limit){
			setBalance(getBalance()-m);
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
		return getBalance() + credit_limit;
	}
	
	/*public boolean isBankrupted(){
		
	}*/
}
