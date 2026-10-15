class Harry extends Thread{

	@Override
	public void run(){
		for(int i =1;i<=10;i++){
			System.out.println(i*5+" "+Thread.currentThread().getName());
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


public class Example02{
	public static void main(String[] args) {

		Harry t1 = new Harry();
		Potter t2 = new Potter();

		t1.setName("Harry");
		t2.setName("Potter");

		t1.start();

		t2.start();

		try{
			t2.join();
		}catch(InterruptedException e){

		}


		for(int i=0;i<=10;i++){
			System.out.println(i*11+" "+Thread.currentThread().getName());
			
		}
		
	}
}