class Work{

	
	public void printlnTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num*i+" "+Thread.currentThread().getName());
		}
	}

}

class Harry extends Thread{

	Work w1;

	public Harry(Work w1){
		this.w1=w1;
	}

	@Override
	public void run(){

		w1.printlnTable(5);
		
	}
}

class Potter extends Thread{

	Work w1;

	public Potter (Work w1){
		this.w1=w1;
	}
	
	@Override
	public void run(){

		w1.printlnTable(7);
	}
}


public class Example03{
	public static void main(String[] args) {

		Work w1 = new Work();

		Harry t1 = new Harry(w1);
		Potter t2 = new Potter(w1);

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