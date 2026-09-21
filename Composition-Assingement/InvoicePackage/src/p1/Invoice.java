package p1;

public class Invoice{
	private int id;
	private Customer customer;
	private double amount;

	public Invoice(int id,Customer customer,double amount){
		this.id=id;
		this.customer=customer;
		this.amount=amount;

	}

	//getter

	public int getId(){ return  id; }
	public Customer getCustome(){ return  customer; }
	public  double getAmount(){ return amount; }

	public String getCustomeName(){
		return customer.getName();
	}

	public double getAmountAfterDiscount(){
		return amount-customer.getDiscount();
	}


	//setter

	public void setCustomer(Customer customer){
		this.customer=customer;
	}	
	public void setAmount(double amount){
		this.amount=amount;
	}

	public String toString(){
		return "Id: "+id+" Customer"+customer+"  Amount:"+amount;
	}
	


}

