public class Example01{
	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder();

		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.capacity());


		StringBuilder s2 = new StringBuilder("Hello");
	
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.capacity());

		s2.append("Javaaaaaaaaaaaaaa");


	
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.capacity());


	}
}