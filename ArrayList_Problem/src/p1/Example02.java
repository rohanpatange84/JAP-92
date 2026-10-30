package p1;

import java.util.ArrayList;

public class Example02 {
	
	public static int maximumEle(ArrayList<Integer> list) {
		
		int max=0;
		
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(45);
		list.add(75);
		list.add(95);
		list.add(25);
		list.add(75);
		list.add(45);
		
		System.out.println(maximumEle(list));
	}
}
