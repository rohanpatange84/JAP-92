package p2;

import p1.Book;
import p1.BookNameComparator;
import java.util.Comparator;

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
			
			
			BookNameComparator byName = new BookNameComparator();
			
			TreeSet<Book> list2 = new TreeSet<>(byName);
			
			list2.add(b1);
			list2.add(b2);
			list2.add(b3);
			list2.add(b4);
			list2.add(b5);
			
			
			System.out.println("------------------------------------------");
			for(Book book:list2) {
				System.out.println(book);
			}
			
			
			Comparator<Book> byAuthor = new Comparator<Book>() {
				
				@Override
				public int compare(Book b1,Book b2) {
					return b1.getAuthor().compareTo(b2.getAuthor());
				}
				
			};
			
			TreeSet<Book> list3 = new TreeSet<>(byAuthor);
			list3.add(b1);
			list3.add(b2);
			list3.add(b3);
			list3.add(b4);
			list3.add(b5);
			
			System.out.println("-------------------------------------------------------");
			
			for(Book book:list3) {
				System.out.println(book);
			}
			
			
		}
}	
