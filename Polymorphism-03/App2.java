class Payment{
	public void pay(){
		System.out.println("Payment class");
	}
}

class Gpay extends Payment{
	public void pay(){
		System.out.println("Gpay class");
	}

}

class Phonepay extends Payment{
	public void pay(){
		System.out.println("Phonepay class");
	}

}

class Paytm extends Payment{
	public void pay(){
		System.out.println("Paytm class");
	}
}


public class App2{

	public static void payMoney(Payment p1){
		p1.pay();
	}

	public static void payMoneyAll(Payment p2[]){

		for(int i=0;i<p2.length;i++){
			p2[i].pay();
		}

	}
	public static void main(String[] args) {

		Payment p1= new Payment();

		Payment p2[] = new Payment[]{new Gpay(),new Phonepay(),new Paytm()}; 

		payMoney(new Gpay());
		payMoney(new Phonepay());
		payMoney(new Paytm());

		System.out.println("------From loop------");

		payMoneyAll(p2);

		
	}
}