class Parcel{
	String lable = "ABC";

	
	private class Content{
		String item = "YELLOW";

		public void printContent(){
			System.out.println(item);
		}
	} 

	public void printParcle(){
		System.out.println(lable);
	}

	public Content getContent(){
		return new Content();
	}
}


public class Example03{
	public static void main(String[] args) {

		Parcel p1 = new Parcel();

		Parcel.Content c1 = p1.getContent();

		c1.printContent();



	}
}