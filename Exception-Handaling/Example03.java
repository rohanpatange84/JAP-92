public class Example03{

	public static void f1(){
			System.out.println("f1 start");
			f2();

			System.out.println("f1 end");
		}



	public static void f2(){
			System.out.println("f2 start");
			f3();

			System.out.println("f2 end");
		}



	public static void f3(){

			System.out.println("f3 start");

			try{

				int num=11/0;
				System.out.println(num);

			}catch(ArithmeticException e){

				System.out.println("arithmatic exception ::");
			}

			System.out.println("f3 end");
		}



	public static void main(String[] args) {

		System.out.println("Main Start :: ");

		f1();

		System.out.println("Main end ::");

	}
}