package com.ryanthekind;

/**
 * The Person Class will house the guts of this program.
 * I plan to demonstrate how many people can be created without having to 
 * create a lot of extra variables.
 * @author ryanb
 *
 */

public class Person {
	
	// instance variables
	private String person;;
	private int monthlyIncome;
	private int monthlyExpenses;
	
//	double monthlyAssets= monthlyIncome- monthlyExpenses;
//	
	double annualTakeHome = monthlyIncome * 12;
	
	
	// Create a constructor
	public Person(String person) {
		super();
		this.person = person;
	}
	
	
	// Generate Getters and Setters
	public String getPerson() {
		return person;
	}

	public int getMonthlyIncome() {
		return monthlyIncome;
	}


	public int getMonthlyExpenses() {
		return monthlyExpenses;
	}


	//Setters
	public void setMonthlyIncome(int monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public void setMonthlyExpenses(int monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}
	
	
	// create a method
	public double monthlyAssets() {
		double result = monthlyIncome - monthlyExpenses;
		return result;
	}
	
	
	
	// printDetails method prints the person details to the console
	public void printDetails() {
		System.out.printf("%s has printed. \nMonthly income is $%d. \nMonthly expenses are $%d \nTest: $%.2f \n", person, monthlyIncome, monthlyExpenses, monthlyAssets());
	}


}
