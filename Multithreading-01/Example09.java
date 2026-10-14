class MyThread implements Runnable{
	private int num;

	public MyThread(){}

	public MyThread(int num){
		this.num=num;
	}

	@Override 
	public void run(){
		for(int i=0;i<=num;i++){
			System.out.println(i*num);
		}
	}
}


public class Example09{
	public static void main(String[] args) {

		MyThread m1 = new MyThread(2);
		MyThread m2 = new MyThread(4);
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);

		t1.start();
		t2.start();


		
	}
}