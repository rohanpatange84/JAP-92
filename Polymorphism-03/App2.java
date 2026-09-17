class Payment{
	public void f1(){
		System.out.println("Payment class");
	}
}

class Gpay extends Payment{
	public void f1(){
		System.out.println("Gpay class");
	}

}

class Phonepay extends Payment{
	public void f1(){
		System.out.println("Phonepay class");
	}

}

class Paytm extends Payment{
	public void f1(){
		System.out.println("Paytm class");
	}
}


public class App2{

	public static void payMoney(Payment p1){
		p1.f1();
	}

	public static void payMoneyAll(Payment p2[]){

		for(int i=0;i<p2.length;i++){
			p2[i].f1();
		}

	}
	public static void main(String[] args) {

		Payment p1= new Payment();

		Payment p2[] = new Payment[]{new Gpay(),new Phonepay(),new Paytm()}; 

		// payMoney(new Gpay());
		// payMoney(new Phonepay());
		// payMoney(new Paytm());

		payMoneyAll(p2);

		
	}
}