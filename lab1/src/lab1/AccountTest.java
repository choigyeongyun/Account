package lab1;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] argc){
		Scanner input = new Scanner(System.in);
		System.out.print("Account1 : $");	
		CheckingAccount account1 = new CheckingAccount(input.nextDouble());
		System.out.print("Account2 : $");
		CheckingAccount account2 = new CheckingAccount(input.nextDouble());
		
		while(true){
			int check1 = 0;
			double money = 0;
			System.out.println("1 : 예금");
			System.out.println("2 : 출금");
			check1 = input.nextInt();
			
			if(check1 == 1) {
				System.out.println("1 : Account1");
				System.out.println("2 : Account2");
				System.out.println("어떤 계좌에 입급할지 입력해주세요 : ");
				int check2 = 0;
				check2 = input.nextInt();
				System.out.println("금액을 입력하세요 : ");
				money = input.nextDouble();
				if(check2 == 1) {
					account1.credit(money);
				}
				else {
					account2.credit(money);
				}
			} 
			if(check1 == 2){
				System.out.println("1 : Account1");
				System.out.println("2 : Account2");
				System.out.println("어떤 계좌에서 출금할지 입력해주세요 : ");
				int check2 = 0;
				check2 = input.nextInt();
				System.out.println("금액을 입력하세요 : ");
				money = input.nextDouble();
				account1.setCreditLimit(500);
				account2.setCreditLimit(500);
				if(check2 == 1){
					account1.debit(money);
				} else {
					account2.debit(money);
				}
			}
			System.out.printf("Account 1 : %.2f\n", account1.getBalance());
			System.out.printf("Account 2 : %.2f\n\n", account2.getBalance());
			
			account1.setInterest(1);
			account2.setInterest(1);
			account1.setLoanInterest(7);
			account2.setLoanInterest(7);
			account1.nextMonth();
			account2.nextMonth();
			
			System.out.println("next month!");
			System.out.printf("Account 1 : %.2f\n", account1.getBalance());
			System.out.printf("Account 2 : %.2f\n\n", account2.getBalance());
		}
	}
}