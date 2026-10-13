 class MyThread implements Runnable{

	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i*5+" "+Thread.currentThread().getName());
		}
	}
}


public class Example03{
	public static void main(String[] args) {

	    Thread t1 = new Thread(new MyThread());

		t1.start();
		

		for(int i=1;i<=10;i++){
			System.out.println(i*10+" "+Thread.currentThread().getName());
		}


	}
}