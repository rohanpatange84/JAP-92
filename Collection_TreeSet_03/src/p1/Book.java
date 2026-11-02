package p1;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private int id;
	private String author;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String author, double price) {
		super();
		this.id = id;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	public int compareTo(Book o) {
		if(this.author==o.author) {
			if(this.price>o.price)
				return 1;
			else
				return -1;
		}
		
		return this.author.compareTo(o.author);
	}
	
	
}
