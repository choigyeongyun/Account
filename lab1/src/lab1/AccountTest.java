package lab1;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] argc){
		Scanner input = new Scanner(System.in);
		System.out.print("Account1 : $");	
		Account account1 = new Account(input.nextDouble());
		System.out.print("Account2 : $");
		Account account2 = new Account(input.nextDouble());
		CheckingAccount caccount1 = new CheckingAccount(account1.getBalance());
		CheckingAccount caccount2 = new CheckingAccount(account2.getBalance());
		
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
				//double credit_limit = 500;
				if(check2 == 1){
					/*if(money > credit_limit){
						System.out.print("debit amount exceeded account balance\n");
						continue;
					} else {
						account1.debit(money);
						caccount1.debit(money);
					}*/
					caccount1.debit(money);
				} else {
					/*if(money>account2.getBalance()){
						System.out.print("debit amount exceeded account balance\n");
						continue;
					} else {
						account2.debit(money);
						caccount2.debit(money);
					}*/
					caccount2.debit(money);
				}
			}
			System.out.printf("Account 1 : %.2f\n", account1.getBalance());
			System.out.printf("Account 2 : %.2f\n\n", account2.getBalance());
			
			System.out.println("next month!");
			System.out.printf("Account 1 : %.2f\n", caccount1.getBalance());
			System.out.printf("Account 2 : %.2f\n\n", caccount2.getBalance());
		}
	}
}