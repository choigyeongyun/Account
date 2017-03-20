package lab1;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] argc){
		Scanner input = new Scanner(System.in);
		System.out.print("Account1 : $");	
		Account account1 = new Account(input.nextDouble());
		System.out.print("Account2 : $");
		Account account2 = new Account(input.nextDouble());
		
		while(true){
			int check = 0;
			double money = 0;
			System.out.println("1 : 예금");
			System.out.println("2 : 출금");
			check = input.nextInt();
			
			if(check == 1) {
				System.out.println("1 : Account1");
				System.out.println("2 : Account2");
				System.out.println("어떤 계좌에 입급할지 입력해주세요 : ");
				check = input.nextInt();
				System.out.println("금액을 입력하세요 : ");
				money = input.nextDouble();
				if(check == 1) {
					account1.credit(money);
				}
				else {
					account2.credit(money);
				}
			} 
			if(check == 2){
				System.out.println("1 : Account1");
				System.out.println("2 : Account2");
				System.out.println("어떤 계좌에서 출금할지 입력해주세요 : ");
				check = input.nextInt();
				System.out.println("금액을 입력하세요 : ");
				money = input.nextDouble();
				if(check == 1){
					if(money>account1.getBalance()){
						System.out.print("debit amount exceeded account balance");
						continue;
					} else {
						account1.debit(money);
					} 
				} else {
					if(money>account2.getBalance()){
						System.out.print("debit amount exceeded account balance");
						continue;
					} else {
						account2.debit(money);
					}
				}
			}
			System.out.printf("Account 1 : %.2f\n", account1.getBalance());
			System.out.printf("Account 2 : %.2f\n", account2.getBalance());
		}
	}
}