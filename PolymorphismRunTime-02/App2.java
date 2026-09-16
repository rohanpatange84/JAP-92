public class App2{
	public static void getSum(char i){
		System.out.println(i);
	}

	public static void getSum(float i){
		System.out.println(i);
	}
	public static void main(String[] args) {

		getSum('1');
		getSum(1.5f);
		
	}
}