package p1;
import java.util.Iterator;
import java.util.HashSet;
public class Example01 {
	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(11);
		list.add(12);
		list.add(13);
		
		System.out.println(list);
		
		for(Integer num:list) {
			System.out.println(num);
		}
		
		System.out.println("------------------------------");
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
