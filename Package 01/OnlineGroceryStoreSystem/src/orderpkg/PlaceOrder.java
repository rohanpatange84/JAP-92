package orderpkg;

import orderpkg.Order;
import productpkg.Product;

public class PlaceOrder{
	public static void main(String[] args) {

		Product p1=new Product();
		Order o1=new Order("Rohan Patange",5,p1);

		

		o1.finalPayment();

		System.out.println(o1.finalPayment());
		
	}
}