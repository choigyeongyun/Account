package lab1;

public class CheckingAccount extends Account {
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	CheckingAccount(double balance, double creditLimit, double interest, double loanInterest){
		super(balance);
		this.creditLimit = creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
	}
	
	@Override
	public void debit(double money) throws Exception{
		double a = getBalance();
		if(money < 0) throw new Exception("음수입력!");
		if(a - money < -creditLimit) throw new Exception("Debit amount exceeded account balance.");
		else{
			a = a - money;
			setBalance(a);
		}
	}
	
	public void nextMonth(){
		double a = getBalance();
		
		if(a >= 0){
			a += a*interest;
			setBalance(a);
		} else{
			a += a*loanInterest;
			setBalance(a);
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		double a = getBalance();
		if(a + creditLimit < 0){
			return 0;
		} else{
			return a + creditLimit;
		}
	}
	
	@Override
	public double passTime(int m){
		month += m;
		double a = getBalance();
		if(a > 0){
			a += a * interest * m;
			setBalance(a);
		} else{
			a += a * loanInterest * m;
			setBalance(a);
		}
		return a;
	}
	
	@Override
	public double passTime(){
		month += 1;
		double a = getBalance();
		if(a > 0){
			a += a * interest;
			setBalance(a);
		} else{
			a += a * loanInterest;
			setBalance(a);
		}
		return a;
	}
	
	public boolean isBankrupted(){
		if(getWithdrawableAccount() <= 0){
			return true;
		} else{
			return false;
		}
	}
	
	@Override
	public double estimateValue(int m){
		double a = getBalance();
		if(a > 0){
			a += a * interest * m;
		} else{
			a += a * loanInterest * m;
		}
		return a;
	}
	
	@Override
	public double estimateValue(){
		double a = getBalance();
		if(a > 0){
			a += a * interest;
		} else{
			a += a * loanInterest;
		}
		return a;
	}
	
	public String toString(){
		return String.format("CheckingAccount Balance : %.2f", getBalance());
	}
}
