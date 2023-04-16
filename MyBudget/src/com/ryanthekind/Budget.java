package com.ryanthekind;

/**
 * The Budget class will help me create instances of the Budget class
 * @author ryanb
 *
 */

public class Budget {
	
	// instance variables
	private int userIncome;
	private int expense;
	
	
	//create a constructor
	Budget(int userIncome, int expense){
		
		this.userIncome = userIncome;
		this.expense = expense;
		
		
		int asset = userIncome - expense;
		System.out.println(asset);
		//System.out.println("I'm the budget constructor");
	}


	public int getUserIncome() {
		return userIncome;
	}


	public void setUserIncome(int userIncome) {
		this.userIncome = userIncome;
	}


	public int getExpense() {
		return expense;
	}


	public void setExpense(int expense) {
		this.expense = expense;
	}
	
	
	

}
