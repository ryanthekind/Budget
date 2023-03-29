package com.ryanthekind;

import java.util.Scanner;

/**
 * App will be the driver of this app. 
 * @author ryanb
 *
 */

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("how much do take home each month? ");
		
		int monthlyIncome = scanner.nextInt();
		
		System.out.println("Thank you, you said $" + monthlyIncome );
		
		scanner.close();
		
		Budget budget = new Budget(2000, 500);

	}

}
