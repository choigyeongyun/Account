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
			double cost = 0;
			System.out.println("1 : ����");
			System.out.println("2 : ���");
			check = input.nextInt();
			
			if(check == 1) {
				System.out.println("1 : Account1");
				System.out.println("2 : Account2");
				System.out.println("� ���¿� �Ա����� �Է����ּ��� : ");
				check = input.nextInt();
				System.out.println("�ݾ��� �Է��ϼ��� : ");
				cost = input.nextDouble();
				if(check == 1) {
					account1.credit(cost);
				}
				else {
					account2.credit(cost);
				}
			} 
			if(check == 2){
				System.out.println("1 : Account1");
				System.out.println("2 : Account2");
				System.out.println("� ���¿��� ������� �Է����ּ��� : ");
				check = input.nextInt();
				System.out.println("�ݾ��� �Է��ϼ��� : ");
				cost = input.nextDouble();
				if(check == 1){
					if(cost>account1.showMoney()){
						System.out.print("dedit amount exceeded account balance");
						continue;
					} else {
						account1.debit(cost);
					} 
				} else {
					if(cost>account2.showMoney()){
						System.out.print("dedit amount exceeded account balance");
						continue;
					} else {
						account2.debit(cost);
					}
				}
			}
			System.out.printf("Account 1 : %.2f\n", account1.showMoney());
			System.out.printf("Account 2 : %.2f\n", account2.showMoney());
		}
	}
}