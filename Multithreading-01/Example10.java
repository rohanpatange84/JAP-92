class MyThread implements Runnable{
	private String name;

	public MyThread(){}

	public MyThread(String name){
		this.name=name;
	}

	@Override 
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(name);
		}
	}
}


public class Example10{
	public static void main(String[] args) {

		MyThread m1 = new MyThread("Rohan");
		MyThread m2 = new MyThread("Dinesh");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);

		t1.start();
		t2.start();


		
	}
}