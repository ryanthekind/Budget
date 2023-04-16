package com.ryanthenkind.procedural;

/**
 * Procedural Budgeting App that demonstrates how an app can function
 * without the use of other classes
 * @author ryanb
 *
 */

public class BudgetingProcedureStyle {

	public static void main(String[] args) {
		
		String personA = "Ryan";
		int monthlyIncomeA = 2000;
		
		double annualTakeHomeA = monthlyIncomeA * 12;
		
		System.out.printf("%s takes home $%d every month. \n", personA, monthlyIncomeA );
		System.out.printf("%s nets $%.2f every year. \n", personA, annualTakeHomeA);

	}

}
