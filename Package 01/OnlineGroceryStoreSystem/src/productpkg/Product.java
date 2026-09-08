package productpkg;

public class Product{
	private static int productID;
	private String name;
	private String category;
	private int price;
	private int discount;	

	{
		name="Suger";
		category="Sweet";
		price=100;
		discount=20;
	}


	public Product(String name,String category,int price,int discount){
		productID++;
		this.name=name;
		this.category=category;
		this.price=price;
		this.discount=discount;
	}

	public int getPrice(){
		return price;
	}

	public int getDiscount(){
		return discount;
	}


}