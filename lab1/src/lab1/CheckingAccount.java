package lab1;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	CheckingAccount(double balance){
		super(balance);
	}
	
	public void setInterest(double i){
		interest = i;
	}
	
	public void setLoanInterest(double loan){
		loan_interest = loan;
	}
	
	public void setCreditLimit(double limit){
		credit_limit = limit;
	}
	
	@Override
	public void debit(double m){
		if (getBalance()-m<-credit_limit) {
			System.out.print("credit_limit amount exceeded account balance");
		} else if(getBalance()-m>=-credit_limit){
			setBalance(getBalance()-m);
		}
	}
	
	public void nextMonth(){
		if (getBalance()>= 0){
			setBalance(getBalance() * (1+interest/100));
		} else {
			setBalance(getBalance() * (1-loan_interest/100));
		}
	}

}
