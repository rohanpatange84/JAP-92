package orderpkg;

import productpkg.Product;

public class Order{
	private static int orderID;
	private int customerID;
	private String customerName;
	private int quantity;
	 Product p1;



	private Order(String customerName,int quantity,Product p1){
		this.customerName=customerName;
		this.quantity=quantity;
		orderID++;
		customerID++;
		this.p1=p1;
	}

	public int  finalPayment(){
		int total=quantity*p1.getPrice()-p1.getDiscount();
		return total;


	}

}