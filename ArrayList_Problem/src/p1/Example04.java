//Create a LinkedList and perform various operations like add, remove, and iterate over it.

package p1;

import java.util.LinkedList;
import java.util.Iterator;


public class Example04 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=1;i<=10;i++) {
			list.add(i*10);
		}
		
		System.out.println(list);
	
		list.remove(0);
		list.remove();  //remove first element we do not pass any value
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
