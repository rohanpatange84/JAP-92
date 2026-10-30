//Write a program to sort an ArrayList of Strings alphabetically.

package p1;

import java.util.ArrayList;
public class Example01 {
	
	public static void main(String[] args) {
		
		String str ="international";
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			list.add(str.charAt(i));
		}
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					Character temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		
		System.out.println(list);
		
	}
	

}
