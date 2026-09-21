package p2;

import p1.Customer;
import p1.Account;

public class App{
	public static void main(String[] args) {
		Customer c1 = new Customer(101,"Suraj Thite",'M');

		Account a1 = new Account(201,c1,10000);
		System.out.println(a1.toString());

		a1.desposite(5000);

		System.out.println(a1.toString());
	}
}