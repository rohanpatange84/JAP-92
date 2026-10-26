import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class Example01{
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for(int i=10;i<=20;i++){
			list.add(i);
			
		}

		System.out.println(list);

		Iterator<Integer> it = list.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}


		//only one time travel 
		//not give any output secind time
			
		while(it.hasNext()){
			System.out.println(it.next());
		}


		


	}
}