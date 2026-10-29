package src;
import java.util.LinkedList;
public class Demo3 {
	public static void main(String[] args) {
		
		LinkedList<Integer> list1= new LinkedList<>();
		LinkedList<Integer> list2= new LinkedList<>();
		
		list1.add(1);
		list1.add(5);
		list1.add(10);
		
		list2.add(2);
		list2.add(3);
		list2.add(11);
		
		LinkedList<Integer> newlist= new LinkedList<>();
		
		for(int i=0;i<list1.size();i++) {
			newlist.add(list1.get(i));
			
			
		}
		
		for(int i=0;i<list2.size();i++) {
			
			newlist.add(list2.get(i));
			
		}
		
		
		System.out.println(newlist);
		
		for(int i=0;i<newlist.size();i++) {
			for(int j=i;j<newlist.size();j++) {
				if(newlist.get(i)>newlist.get(j)) {
					int temp = newlist.get(i);
					newlist.set(i,newlist.get(j));
					newlist.set(j, temp);
					
					
				}
			}
		}
		
		System.out.println(newlist);
		
		
	}
}
