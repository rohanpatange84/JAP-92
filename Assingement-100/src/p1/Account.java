package p1;

import java.util.Objects;

public class Account{
	
	private String customerName;
	private long accountNumber=1452456254;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String customerName,  double balance) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber+1;
		this.balance = balance;
	}
	
	public Account(String customerName,  double balance ,String branch) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber+1;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [customerName=" + customerName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(customerName, other.customerName);
	}
	
	
	public void displayAccountDetails() {
		System.out.println("-----Account Detail-----");
		System.out.println("Customer Name : ");
		System.out.println("Account Name  : ");
		System.out.println("Balance       : ");
		
		
	}
	
	


	
	
	
	

}
