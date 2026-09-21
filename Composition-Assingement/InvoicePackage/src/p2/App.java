package p2;

import p1.Customer;
import p1.Invoice;

public class App{
	public static void main(String[] args) {
		Customer c1 = new Customer(101,"Suraj Thite",1000);

		Invoice i1 = new Invoice(201,c1,10000);

		System.out.println(i1.getAmountAfterDiscount());


		System.out.println(i1.toString());
	}
}