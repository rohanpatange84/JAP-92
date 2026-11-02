package p1;

import java.util.Iterator;
import java.util.TreeSet;
public class Example02 {
	public static void main(String[] args) {
			TreeSet<String> list = new TreeSet<>();
			list.add("Rahul");
			list.add("Vishal");
			list.add("Vishal");
			list.add("Mohan");
			list.add("Rahul");
			list.add("Ram");
			
			
			System.out.println(list);
			
			Iterator<String> itr = list.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
	}
}
