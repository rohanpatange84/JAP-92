class Balance{
	int balance=10000;

	synchronized  void withdraw(int amt){
		System.out.println("Before Withraw Balance	---> "+this.balance);

		if(this.balance<amt){
			try{
				wait();
			}catch(InterruptedException e){

			}
		}

		this.balance=this.balance-amt;
		System.out.println("After Withraw Balance ---> "+this.balance);
	}

	synchronized  void deposite(int amt){
		System.out.println("Before Deposite Balance ---> "+this.balance);
		this.balance=this.balance+amt;
		notify();
		System.out.println("After Deposite Balance ---> "+this.balance);
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


public class Example03{
	public static void main(String[] args) {

		final Balance b1 = new Balance();

		Sham s1 = new Sham(b1);
		Ram r1 = new Ram(b1);

		s1.setName("Sham");
		r1.setName("Ram");

		s1.start();
		r1.start();
	
	}
}