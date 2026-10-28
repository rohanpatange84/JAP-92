package src;
import java.util.ArrayList;
import java.util.Iterator;
public class App {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		System.out.println(list);
		
//		Iterator<Integer> ite = list.iterator();
//		while(ite.hasNext()) {
//			Integer val = ite.next();
//			if(val==13) {
//				list.remove(val);    //java.util.ConcurrentModificationException
//			}
//		}
		
		Iterator<Integer> ite1 = list.iterator();
		while(ite1.hasNext()) {
			Integer val = ite1.next();
			if(val==13) {
				ite1.remove();    //calls iterators interfece remove method 
			}
		}
		
		
		System.out.println(list);
		
	}

}
