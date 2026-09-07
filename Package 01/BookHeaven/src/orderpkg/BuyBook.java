import bookpkg.Book;
import orderpkg.Order;
public class BuyBook{
	public static void main(String[] args) {
		Book b1=new Book(1,"Marvel Story","Tony Stark",2000);
		Order o1=new Order("Rohan",5,b1);

		o1.orderDetail();
	}
}