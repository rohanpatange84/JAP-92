//Write a program to remove all duplicate elements from an ArrayList.

package p1;

import java.util.ArrayList;

public class Example03 {
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(45);
		list.add(75);
		list.add(45);
		list.add(25);
		list.add(75);
		list.add(25);
		
		System.out.println(list);
		
		removeDuplicate(list);
		
		System.out.println(list);
		
		
		
		
		
	}
}
