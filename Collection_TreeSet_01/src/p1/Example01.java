package p1;

import java.util.TreeSet;
public class Example01 {
	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<>();
		
		list.add(14);
	//	list.add(14.25); //java.lang.Error: Unresolved compilation problem:
		list.add(15);
		list.add(12);
		list.add(23);
	//	list.add(null);  //Exception in thread "main" java.lang.NullPointerException
		
		System.out.println(list);
		
		for(Integer val:list) {
			System.out.println(val);
		}
	}
}
