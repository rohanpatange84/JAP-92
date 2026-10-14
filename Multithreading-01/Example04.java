 class MyThread implements Runnable{

	public void run(){
		for(int i=1;i<=100;i++){
			if(i%5==0){
				try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Exception occurs");
			}
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}


public class Example04{
	public static void main(String[] args) {

	    Thread t1 = new Thread(new MyThread());

		t1.start();
		

		for(int i=1;i<=1000;i++){
			System.out.println(i+" "+Thread.currentThread().getName());
		}


	}
}