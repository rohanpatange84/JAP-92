import java.util.List;
import java.util.ArrayList;


public class Example05{
	public static void main(String[] args) {

		List<Integer> n1 = new ArrayList<>();
		n1.add(1);
		n1.add(2);
		n1.add(3);

		List<Integer> n2 = new ArrayList<>();

		n2.add(4);
		n2.add(5);




		System.out.println(n1);
		System.out.println(n2);
		
		n1.addAll(n2);
		System.out.println(n1);

		System.out.println(n1.containsAll(n2));

		n1.removeAll(n2);

		System.out.println(n1);





	}
}