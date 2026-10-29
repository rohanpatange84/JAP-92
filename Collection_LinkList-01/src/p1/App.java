package p1;
import java.util.LinkedList;
import java.util.ArrayList;
public class App {
	public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
		
		list.add(11);
		list.add(22);
		list.add(33);
	
		System.out.println(list);
		
		list.addFirst(99);
		System.out.println(list);
		list.addLast(88);
	
		System.out.println(list);
		
		list.add(3,77);
	
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove(2);             
		System.out.println(list);
		
		System.out.println("---------------------------");
		
		
		//need 21 java version or above to suport addFirst methosd in arrayalsit
		
		
		
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(11);
//		list1.add(22);
//		list1.add(33);
//		
//		System.out.println(list1);
//		
//		list1.addFirst(99);
//		System.out.println(list1);
//		list1.addLast(88);
//	
//		System.out.println(list1);
//		
//		list1.add(3,77);
//		
//		System.out.println(list1);
	}

}
