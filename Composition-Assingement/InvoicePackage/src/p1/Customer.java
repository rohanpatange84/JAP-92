package p1;

public class Customer{
	private int id;
	private String name;
	private int discount;

	public Customer(int id,String name,int discount){
		this.id=id;
		this.name=name;
		this.discount=discount;
	}

	//getterr

	public int getId(){ return id; }
	public String getName(){ return name; }
	public int getDiscount(){ return discount; }

	//setter

	public void setDiscount(int discount){
		this.discount=discount;

	}

	public String toString(){
		return "Id:"+id+"  Name:"+name+"  Discount:"+discount;
	}
}