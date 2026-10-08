public class Example01{
	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder();
		s1.append("Rohan");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.capacity());

		System.out.println("---------------------");
		StringBuilder s2 = new StringBuilder("Hello");
	
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		System.out.println("---------------------");

		s2.append("asssaaaaaaaaaaaaa");


	
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.capacity());


	}
}