class Banti extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i*5+" "+Thread.currentThread().getName());
		}
	}
}

class Babali extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i*7+" "+Thread.currentThread().getName());
		}
	}
}

public class Example02{
	public static void main(String[] args){

		Banti t1 = new Banti();
		Babali t2 = new Babali();

		t1.setName("Banti");
		t2.setName("Babali");

		t1.start();
		t2.start();


		for(int i=1;i<=10;i++){
			System.out.println(i*11+" "+Thread.currentThread().getName());
		}


		System.out.println(Thread.activeCount());



			


	}
}