package com.ryanthenkind.procedural;

/**
 * Procedural Budgeting App that demonstrates how an app can function
 * without the use of other classes
 * @author ryanb
 *
 */

public class BudgetingProcedureStyle {

	public static void main(String[] args) {
		
		// variables for personA
		String personA = "Ryan";
		int monthlyIncomeA = 2000;
		int monthlyExpensesA = 1800;
		
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
		System.out.printf("%s's monthly expenses are $%d leaving him with $%.2f at the every month\n", personA, monthlyExpensesA, monthlyAssetsA);
		System.out.printf("%s nets $%.2f every year. \n", personA, annualTakeHomeA);
		
		System.out.println();
		System.out.println("<------------> \n");
		// output result for personB
		System.out.printf("%s takes home $%d every month. \n", personB, monthlyIncomeB);
		System.out.printf("%s's monthly expenses are $%d leaving him with $%.2f at the every month\n", personB, monthlyExpensesB, monthlyAssetsB);
		System.out.printf("%s nets $%.2f every year. \n", personB, annualTakeHomeB);
		

	}

}
