package lab1;

public class SavingAccount extends Account {
	private double interest;
	private int month;
	
	SavingAccount(double balance, double interest){
		super(balance);
		this.interest = interest;
		month = 0;
	}
	
	@Override
	public void debit(double money) throws Exception{
		double a = getBalance();
		if(money < 0) throw new Exception("음수입력!");
		if(month < 12) throw new Exception("아직 출금할 수 없습니다.");
		else{
			a = a - money;
			setBalance(a);
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		double a = getBalance();
		if(month < 12){
			return 0;
		} else{
			return a;
		}
		
	}

	@Override
	public double passTime(int m) {
		double a = getBalance();
		month += m;
		if(month < 12){
			return a;
		} else if(month == 12){
			a = a * Math.pow(1 + interest, 12);
			setBalance(a);
			return a;
		} else{
			return a;
		}
	}
	
	@Override
	public double passTime() {
		double a = getBalance();
		month += 1;
		if(month < 12){
			return a;
		} else if(month == 12){
			a = a * Math.pow(1 + interest, 12);
			setBalance(a);
			return a;
		} else{
			return a;
		}
	}
	
	@Override
	public double estimateValue(int m){
		double a = getBalance();
		a = a * Math.pow(1 + interest, m);
		return a;
	}
	
	@Override
	public double estimateValue(){
		double a = getBalance();
		a = a * Math.pow(1 + interest, 1);
		return a;
	}
	
	public String toString(){
		return String.format("SavingAccount Balance : %.2f", getBalance());
	}
}
