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
		if (month <= 12){
			System.out.println("아직 출금할 수 없습니다.");
		} else {
			setBalance(getBalance()-m);
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		if (month > 12){
			setBalance(passTime(month));
		}
		return setBalance(passTime(month));
	}

	@Override
	public double passTime(int t) {
		month =+ t;
		double a = getBalance();
		if(month <= 12){
			if (a >= 0){
				a += a * interest * t;
			}
		}
		setBalance(a);
		return a;
	}
}
