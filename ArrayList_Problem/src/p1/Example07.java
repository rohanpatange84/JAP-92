//Write a program to find the frequency of each element in an ArrayList.

package p1;
import java.util.ArrayList;
public class Example07 {
	
	public static void frequency(ArrayList<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			int cnt=0;
			for(int j=0;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					cnt++;
				}
				
				
			}
			System.out.println("Frequency of "+list.get(i)+" is: "+cnt);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(12);
		list.add(11);
		list.add(14);
		list.add(12);
		list.add(11);
		list.add(14);
		list.add(15);
		
		
		frequency(list);
		
		
		
		
		
	}
}
