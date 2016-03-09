package base;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//default account
	public Account() { 
		
	}
	//create account with id and balance
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	// get id
	public int getId() {
		return id;
	}
	// set id
	public void setId(int id) {
		this.id = id;
	}
	// get balance
	public double getBalance() {
		return balance;
	}
	// set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// get Annual Interest Rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	// set Annual Interest Rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	// get date created
	public Date getDateCreated() {
		return dateCreated; 
	}
	// Calculate monthly interest rate
	public double getMonthlyInterestRate(){
		double MonthlyInterestRate =  annualInterestRate / 12;
		return MonthlyInterestRate;
	}
	// Withdraw money from account
	public void withdraw(double amount)throws InsufficientFundsException{
		if (amount <= balance){
			balance = balance - amount;
		}
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
		}
	// Deposit money into account
	public void deposit(double amount){
		balance+= amount;
}

}
