public class App{
	public static void main(String[] args) {
		InvoiceItem i1=new InvoiceItem("1A","XYZ",10,50.21);

		i1.getID();
		i1.getDesc();
		System.out.println("Qualtity : "+i1.getQty());

		i1.setQty(20);

		System.out.println("Unit Price : "+i1.getUnitPrice());

		i1.setUnitPrice(40);
		System.out.println("Unit Price : "+i1.getUnitPrice());

		System.out.println("Total : "+i1.getTotal());
	}
}