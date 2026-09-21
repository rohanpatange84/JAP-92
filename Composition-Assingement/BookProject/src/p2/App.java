package p2;

import p1.Book;
import p1.Author;

public class App{
	public static void main(String[] args) {
		Author a1 = new Author("Shreenath","shreenath@gmail.com",'M');

		Book b1 = new Book("Sham chi aai",a1,1000.10,2);

		System.out.println(b1.toString());


	}
}