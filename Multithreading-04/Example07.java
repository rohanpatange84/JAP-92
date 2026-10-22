
class Harry extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i*11+" "+Thread.currentThread().getName());
		}

	}
}
public class Example07{
	public static void main(String[] args) {
		Harry h1 = new Harry(); 
		h1.setName("Harry");
		h1.start();
		try{h1.join();}catch(InterruptedException e){ }
		// h1.start();    //Exception in thread "main" java.lang.IllegalThreadStateException
		                  // we do not start thread twice
		System.out.println(Thread.currentThread().getPriority());
		
	}
}