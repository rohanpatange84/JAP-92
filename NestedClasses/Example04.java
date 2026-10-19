interface PContent{

	void printContent();
}

class Parcel{
	String lable = "ABC";

	
	private class Content implements PContent{
		String item = "YELLOW";

		public void printContent(){
			System.out.println(item);
		}
	} 

	public void printParcle(){
		System.out.println(lable);
	}

	public PContent getContent(){
		return new Content();
	}
}


public class Example04{
	public static void main(String[] args) {

		Parcel p1 = new Parcel();

		PContent c1 = p1.getContent();

		c1.printContent();
		


	}
}