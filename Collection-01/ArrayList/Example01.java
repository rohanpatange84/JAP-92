import java.util.ArrayList;

public class Example01{
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		System.out.println(list.size());
		list.add("Suraj");
		list.add(45);
		list.add(12.01);
		System.out.println(list.size());
		list.add(true);
		list.add('A');


		System.out.println(list);
		System.out.println("Size "+list.size());
		System.out.println(list.contains("Suraj"));

		list.remove("Suraj");
		
		System.out.println(list);

		System.out.println("Size "+list.size());

		System.out.println(list.isEmpty());

		list.clear();

		System.out.println(list.isEmpty());



	}
}