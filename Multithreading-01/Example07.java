class Mythread1 extends Thread{
	

	@Override
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}

	}
}

class Mythread2 extends Thread{
	

	@Override
	public void run(){
		for(int i=10;i>=0;i--){
			System.out.println(i);
		}

	}
}



public class Example07{
	public static void main(String[] args) {

		Mythread1 m1 = new Mythread1();
		Mythread2 m2 = new Mythread2();

		m1.start();
		m2.start();
		
	}
}