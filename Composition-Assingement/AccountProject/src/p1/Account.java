package p1;

public class Account{
	private int id;
	private Customer customer;
	private double balance=0.0;

	public Account(int id, Customer customer, double balance){
		this.id=id;
		this.customer=customer;
		this.balance=balance;
	}

	public Account(int id, Customer customer){
		this(id,customer,0.0);
	}

	//getter

	public int getID(){ return id; }
	public Customer getCustomer(){ return  customer; }
	public double getBalance(){ return balance; }

	public  String getCustomerName(){ return customer.getName(); }


	public void setBalance(double balance){
		this.balance=balance;
	}





	public void desposite(double amount){
		balance=balance+amount;

	}

	public void withdraw(double amount){
		 balance=balance-amount;
	}

	@Override
	public String toString(){
		return "ID:"+id+"  Customer "+customer+"  Balance:"+balance;
	}
}