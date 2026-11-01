package p1;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class Example03 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		
		LinkedHashSet<Integer> num1 = new LinkedHashSet<>();
		
		num1.add(14);
		num1.add(15);
		num1.add(16);
		num1.add(17);
		num1.add(18);
		
		System.out.println(num);
		System.out.println(num1);
		
		num.addAll(num1);
		System.out.println("-------------------");
		System.out.println(num);
		System.out.println(num1);
		
		num.removeAll(num1);
	
		System.out.println("-------------------");
		System.out.println(num);
		System.out.println(num1);
		
		
	
		
		
	} 
}
