public class Example04{
	public static void main(String[] args) {

		System.out.println("main start");

	try{

		try{
			int num=11/0;
			System.out.println(num);

		}finally{
			System.out.println("Inner finally");

			}
			
		
	}catch(ArithmeticException 	e){
		System.out.println("Exception outer cause");

	}finally{
		System.out.println("Outter finally");

		}

	System.out.println("main end");

	}
}
