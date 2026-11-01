package p1;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class Example02 {
		public static void main(String[] args) {
			LinkedHashSet<String> student = new LinkedHashSet<String>();
			
			student.add("Rohan");
			student.add("Suraj");
			student.add("Dinesh");
			student.add("Suraj");
			student.add("Dinesh");
			student.add("Rohan");
			student.add("Vivek");
			
			Iterator<String> itr = student.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
		}
}
