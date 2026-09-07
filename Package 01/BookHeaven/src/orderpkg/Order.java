package orderpkg;

import bookpkg.Book;

public class Order{
	private static int orderId=0;
	private static int custId=0;
	private String custName;
	private int quantity;
	private Book book;
	


	public Order(String custName,int quantity,Book book){
		this.custName=custName;
		this.quantity=quantity;
		this.book=book;
		orderId++;
		custId++;
		
	}



	public int calculateTotal(){
		int price=book.getPrice();
		return price*this.quantity;
	}


	public  void orderDetail(){
		System.out.println("Tital: "+book.getBook());
		System.out.println("Order ID: "+this.orderId);
		System.out.println("custId: "+this.custId);
		System.out.println("custName: "+this.custName);
		System.out.println("quantity: "+this.quantity);
		System.out.println("Total: "+calculateTotal());
	}



}