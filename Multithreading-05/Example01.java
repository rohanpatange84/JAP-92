class Tringle1 extends Thread{

	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


class Tringle2 extends Thread{

	@Override
	public void run(){
		for(int i=1;i<=5;i++){

			for(int sp=i;sp<5;sp++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



public class Example01{
	public static void main(String[] args) {

		Tringle1 t1 = new Tringle1();
		t1.start();

		Tringle2 t2 =new Tringle2();
		t2.start();
		



	}
}