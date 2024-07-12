package day_4;

import java.util.Scanner;

public class atm implements Balance {

	double money = 2000;
	@Override
	public void withdraw(int m) {
	 money-=m;	
	}

	@Override
	public void ShowBalance() {
		System.out.println("Balance = "+money+" rs ");
	}

	@Override
	public void deposit(int m) {
		
		money+=m;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		atm a = new atm();
		boolean status = true;
		while(status)
		{
			System.out.println("ENTER 1 TO DEPOIST");
			System.out.println("ENTER 2 TO WithDraw");
			System.out.println("ENTER 3 TO See BALANCE");
			System.out.println("ENTER 4 TO exit");
			int c = sc.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("Enter Money");
				a.deposit(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter money");
				a.withdraw(sc.nextInt());
				break;
			case 3:
				a.ShowBalance();
				break;
			case 4:
				System.out.println("Thank You \nHave a GOOD DAY");
				status = false;
				break;
				
			}
		}
	}

}
