package src;

import java.util.LinkedList;
public class Demo2 {
	
	public static boolean isPanlidrome(LinkedList<Character> list) {
		
		int i=0;;
		int j=list.size()-1;
		
		boolean res=true;
		while(j>i) {
			if(list.get(i)!=list.get(j)) {
				return false;
			}
			i++;
			j--;
		}
		return res;
	}
	
	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<>();
		list.add('m');
		list.add('a');
		list.add('a');
		list.add('m');
		
		System.out.println(isPanlidrome(list));
		
		
	}
}
