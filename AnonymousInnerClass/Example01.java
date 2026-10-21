interface Implement{

	void play();
}

public class Example01{
	public static void main(String[] args) {
		

		new Implement(){

			@Override
			public void play(){
				System.out.println("Implement interface");

			}
		}.play();

		


	}
}