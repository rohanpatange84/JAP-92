import java.util.Deque;
import java.util.LinkedList;

public class Example01{
	public static void main(String[] args) {

		Deque<Integer> list = new LinkedList<>();

		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);

		System.out.println(list);

		list.addFirst(99);
		list.addLast(88);
		list.offerLast(102);

		System.out.println(list);

		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		list.pollFirst();
		list.pollLast();

		System.out.println(list);



		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());

		

	}
}