package p2;
import java.util.TreeSet;
import java.util.Iterator;
import p1.Book;
public class App {
	public static void main(String[] args) {
		Book b1 = new Book(1,"James",500);
		Book b2 = new Book(2,"Robert",300);
		Book b3 = new Book(3,"James",700);
		Book b4 = new Book(4,"Robert",600);
		
		TreeSet<Book> books = new TreeSet<>();
		
		books.add(b1);

		books.add(b2);

		books.add(b3);

		books.add(b4);
		
		Iterator<Book> itr= books.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
