package p1;


import java.util.Date;
public class Loan{
	private double annualIntrestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan(){
		this.loanDate = new Date();

	}

	public Loan(double annualIntrestRate,int numberOfYears,double loanAmount){
		this.annualIntrestRate=annualIntrestRate;
		this.numberOfYears=numberOfYears;
		this.loanAmount=loanAmount;
		this.loanDate = new Date();

	}


	//gette

	public double getAnnualIntrestRate(){
		return annualIntrestRate;
	}

	public int getNumberOfYears(){
		return numberOfYears;
	}

	public double getLoanAmount(){
		return loanAmount;
	}

	public Date getLoanDate(){
		return loanDate;
	}

	//setter 

	public void setAnnualIntrestRate(double annualIntrestRate){
		this.annualIntrestRate=annualIntrestRate;
	}

	public void setNumberOfYears(int numberOfYears){
		this.numberOfYears=numberOfYears;
	}

	public void setLoanAmount(double loanAmount){
		this.loanAmount=loanAmount;
	}

	public double getMonthlyPayment(){
		double amount=getTotalPayment();

		double res = amount/(numberOfYears*12);

		return res;

	}


	public double getTotalPayment(){
		double rate = (annualIntrestRate/100)*loanAmount;
		double res = loanAmount+rate*numberOfYears;

		return res;

	}





}