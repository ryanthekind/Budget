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
	
	double monthlyAssets= monthlyIncome- monthlyExpenses;
	
	double annualTakeHome = monthlyIncome * 12;
	
	
	// Create a constructor
	public Person(String person) {
		super();
		this.person = person;
	}
	
	// printDetails method prints the person details to the console
	public void printDetails() {
		System.out.printf("%s has printed \n", person);
	}

}
