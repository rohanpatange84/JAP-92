import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;


public class Example02  {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for(int i=1;i<=10;i++){
			list.add(i);
		}

		System.out.println(list);
		
		ListIterator<Integer> itr = list.listIterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("-------------------------------------");

		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
	
}