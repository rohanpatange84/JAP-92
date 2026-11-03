package p2;

import p1.Book;
import java.util.TreeSet;
public class App {
		public static void main(String[] args) {
			Book b1 = new Book(101, "Java Programming", "James Gosling", 450.50);

			Book b2 = new Book(102, "Python Programming", "Guido van Rossum", 550.00);

			Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 350.00);

			Book b4 = new Book(104, "Effective Java", "Joshua Bloch", 650.00);

			Book b5 = new Book(105, "Clean Code", "Robert C. Martin", 700.00);
			
			TreeSet<Book> list = new TreeSet<>();
			
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(b4);
			list.add(b5);
			
			for(Book book:list) {
				System.out.println(book);
			}
		}
}	
