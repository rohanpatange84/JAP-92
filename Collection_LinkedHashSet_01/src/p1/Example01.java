package p1;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class Example01 {
	public static void main(String[] args) {
		LinkedHashSet<Integer>list = new LinkedHashSet<Integer>();
		
		for(int i=1;i<=10;i++) {
			list.add(i*10);
		}
		
		
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
