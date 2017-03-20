package lab1;

public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	CheckingAccount(double balance){
		super(balance);
	}
	
	@Override
	public void debit(double m){
		if (m > credit_limit) {
			System.out.print("debit amount exceeded account balance");
		} else {
			balance -= m;
		}
	}
	
	public void nextMonth()){
		interest = 1;
		loan_interest = 7;
		if (getBalance)
	}

}
