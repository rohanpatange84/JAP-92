//Write a program to find the second-largest element in an ArrayList of Integers.


package p1;
import java.util.ArrayList;
public class Example06 {
	
	public static int getSecondMax(ArrayList<Integer> list) {
		
		int max = 0;
		
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
			
		}
		
		int secondmax=0;
		for(int i=0;i<list.size();i++) {
			if(secondmax<list.get(i)&&list.get(i)<max) {
				secondmax=list.get(i);
			}
			
		}
		
		return secondmax;
		
		
		  
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(14);
		list.add(54);
		list.add(84);
		list.add(44);
		list.add(34);
		list.add(24);
		list.add(14);
		
		
		
		System.out.println(getSecondMax(list));
		
		
		
		
		
		
	}
}
