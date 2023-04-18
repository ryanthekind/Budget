package com.ryanthenkind.procedural;

/**
 * Procedural Budgeting App that demonstrates how an app can function
 * without the use of other classes. You will see in the code below that
 * though procedural programming makes sense in simple programs OOP 
 * is preferable when making a program more dynamic
 * @author ryanb
 *
 */

public class BudgetingProcedureStyle {

	public static void main(String[] args) {
		
		// variables for personA
		String personA = "Ryan";
		int monthlyIncomeA = 2000;
		int monthlyExpensesA = 1500;
		
		double monthlyAssetsA = monthlyIncomeA - monthlyExpensesA;
		
		double annualTakeHomeA = monthlyIncomeA * 12;
		
		
		// variables for personB
		String personB = "Jeff";
		int monthlyIncomeB = 2400;
		int monthlyExpensesB = 2000;
		
		double monthlyAssetsB = monthlyIncomeB - monthlyExpensesB;
		
		double annualTakeHomeB = monthlyIncomeB * 12;
		
		
		// output the result for personA
		System.out.printf("%s takes home $%d every month. \n", personA, monthlyIncomeA);
		System.out.printf("%s's monthly expenses are $%d leaving him with $%.2f at the end of every month\n", personA, monthlyExpensesA, monthlyAssetsA);
		System.out.printf("%s nets $%.2f every year. \n", personA, annualTakeHomeA);
		
		System.out.println();
		System.out.println("<------------> \n");
		// output result for personB
		System.out.printf("%s takes home $%d every month. \n", personB, monthlyIncomeB);
		System.out.printf("%s's monthly expenses are $%d leaving him with $%.2f at the end of every month\n", personB, monthlyExpensesB, monthlyAssetsB);
		System.out.printf("%s nets $%.2f every year. \n", personB, annualTakeHomeB);
		
		
		// If else construct 
		if (monthlyAssetsA == monthlyAssetsB) {
			System.out.printf("%s and %s have the same money left over at the end of the month", personA, personB);
		} else if ( monthlyAssetsA > monthlyAssetsB) {
			double remainder = monthlyAssetsA - monthlyAssetsB;
			System.out.printf("%s has moe money than %s by $%.2f at the end of the month", personA, personB, remainder);
		} else {
			double remainder = monthlyAssetsB - monthlyAssetsA;
			System.out.printf("%s has more money than %s by $%.2f at the end of the month", personB, personA, remainder);
		}
		
	}

}
