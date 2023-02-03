package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Account account;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = input.nextInt();
		System.out.print("Enter account holder: ");
		input.nextLine();
		String holder = input.nextLine();
		System.out.println("Is there an initial deposit? ");
		char response = input.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit(y/n): ");
			double initialDeposit = input.nextDouble();
			account	= new Account (number, holder, initialDeposit);
	}	
		else {
			account = new Account (number, holder);
		}

		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		double depositvalue = input.nextDouble();
		account.deposit(depositvalue);
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter withdraw value: ");
		double withdrawvalue = input.nextDouble();
		account.withdraw(withdrawvalue);
		System.out.println(account);
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
