package src;
import java.util.LinkedList;
public class Demo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer>list = new LinkedList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		System.out.println(list);
		
		int i=0;
		int j=list.size()-1;
		
		while(j>i) {
			list.set(i,list.get(i)+list.get(j));
			list.set(j,list.get(i)-list.get(j));
			list.set(i, list.get(i)-list.get(j));
			
			i++;
			j--;
			
		}
		
		System.out.println(list);
		
	}

}
