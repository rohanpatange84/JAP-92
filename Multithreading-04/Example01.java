class Balance{
	int balance=10000;

	public void withdraw(int amt){
		System.out.println("Before Withraw --->"+balance);
		this.balance=this.balance-amt;
		System.out.println("After Withraw --->"+balance);
	}

	public void deposite(int amt){
		System.out.println("Before Deposite --->"+balance);
		this.balance=this.balance+amt;
		System.out.println("After Deposite --->"+balance);
	}
}

class Sham extends Thread{
	Balance b1;

	public Sham(Balance b1){
		this.b1=b1;
	}

	@Override
	public void run(){
		b1.withdraw(15000);
	}

}

class Ram extends Thread{
	Balance b1;

	public Ram(Balance b1){
		this.b1=b1;
	}

	@Override
	public void run(){
		b1.deposite(5000);
	}
}


public class Example01{
	public static void main(String[] args) {

		Balance b1 = new Balance();

		Sham s1 = new Sham(b1);
		Ram r1 = new Ram(b1);

		s1.setName("Sham");
		r1.setName("Ram");

		s1.start();
		r1.start();
	
	}
}