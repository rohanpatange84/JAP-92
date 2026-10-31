package p1;
import java.util.HashSet;
import java.util.Iterator;
public class Example02 {
	public static void main(String[] args) {
		HashSet<String> student = new HashSet<>();
		
		student.add("Tony");
		student.add("Sahil");
		student.add("Tony");
		student.add("Captain");
		student.add("Tony");
		student.add("captain");
		student.add("tony");
		student.add("Captain");
		
		
		Iterator<String> itr = student.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
