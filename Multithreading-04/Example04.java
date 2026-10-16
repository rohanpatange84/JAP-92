// invalid code


class Harry extends Thread{

	@Override
	synchronized public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i*11+" "+Thread.currentThread().getName());
		}

	}
}

class Potter extends Thread{

	@Override
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i*7+" "+Thread.currentThread().getName());
		}

	}
}


public class Example04{
	public static void main(String[] args) {

		Harry h1 = new Harry(); 
		Potter p1 = new Potter();

		h1.setName("Harry");
		p1.setName("Potter");

		h1.start();
		p1.start();




		
	}
}