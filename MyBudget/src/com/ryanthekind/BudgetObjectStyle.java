package com.ryanthekind;


/**
 * This program builds off the procedural program by implementing OOP
 * @author ryanb
 *
 */

public class BudgetObjectStyle {

	public static void main(String[] args) {
		
		
	Person personA = new Person("Ryan");
	personA.setMonthlyIncome(3000);
	personA.setMonthlyExpenses(1800);
	
	personA.printDetails();
	
	personA.monthlyAssets();

	System.out.println();
	System.out.println(personA.monthlyAssets());
	}

}
