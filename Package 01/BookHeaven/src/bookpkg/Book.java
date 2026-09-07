package bookpkg;

public class Book{
	private int bookId;
	private String tital;
	private String author;
	private int price;
	private static int discount=10;


	public Book(int bookId,String tital,String author,int price){
		this.bookId=bookId;
		this.tital=tital;
		this.author=author;
		this.price=price;
		bookId++;
	}

	public int getPrice(){
		return this.price;
	}


	public String getBook(){
		return this.tital;
	}
}