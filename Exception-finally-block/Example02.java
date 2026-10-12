public class Example02{
	public static void main(String[] args) {

		System.out.println("main start");

	try{
		
		int num=11/0;
		System.out.println(num);

	}catch(ArithmeticException e){
		System.out.println("Exception occurs...");
	}
	
	finally{
			System.out.println("in the finally");

	}
	System.out.println("main end");

	}
}