interface PInner{
	void inner();
}

class Outer{

	int x=10;

	private class Inner implements PInner{
		int y=20;
		@Override
		public void inner(){
			System.out.println("Inner function");
		}
	}




	void outter(){
		
		System.out.println("Outte function");
	}

	public Inner getInner(){
		return new Inner();
	}
}


public class Demo{
	public static void main(String[] args) {

		Outer out = new Outer();
		PInner in = out.getInner();
	}
}