 class MyThread implements Runnable{

 	int val;

 	public MyThread(){}

 	public MyThread(int val){
 		this.val=val;
 	}

	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i*val+" "+Thread.currentThread().getName());
		}
	}
}


public class Example05{
	public static void main(String[] args) {

	    Thread t1 = new Thread(new MyThread(1));
	    Thread t2 = new Thread(new MyThread(2));
	    Thread t3 = new Thread(new MyThread(3));
	    Thread t4 = new Thread(new MyThread(4));
	    Thread t5 = new Thread(new MyThread(5));


		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

		for(int i=1;i<=10;i++){
			System.out.println(i*10+" "+Thread.currentThread().getName());
		}


	}
}