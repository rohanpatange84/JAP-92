// invalid code


class Harry extends Thread{

	@Override
	public void run(){
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


public class Example06{
	public static void main(String[] args) {

		Harry h1 = new Harry(); 
		Potter p1 = new Potter();

		h1.setName("Harry");
		p1.setName("Potter");

		// h1.setPriority(14);   //Exception in thread "main" java.lang.IllegalArgumentException betwen 1 to 10
		System.out.println(h1.getPriority());
		h1.setPriority(7);
		System.out.println(h1.getPriority());

		h1.start();
		p1.start();

		System.out.println(Thread.currentThread().getPriority());


		




		
	}
}