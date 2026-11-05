/*
4 :Merge Two Lists Without Duplicates

Input:

List1 = [1, 2, 3, 4]
List2 = [3, 4, 5, 6]

Expected output:
[1, 2, 3, 4, 5, 6]

 */


package p1;

import java.util.LinkedHashSet;
public class Example04 {
	
	public static LinkedHashSet<Integer> meargeArray(int list1[],int list2[]){
		
		LinkedHashSet<Integer> list = new LinkedHashSet<>();
		
		
		for(int i=0;i<list1.length;i++) {
			list.add(list1[i]);	
		}
		for(int i=0;i<list2.length;i++) {
			list.add(list2[i]);
		}
		
		
		return list;
		
		
		
	}
	
	public static void main(String[] args) {

		int list1[]= {1,2,3,4};
		int list2[]= {3,4,5,6};
		
		System.out.println(meargeArray(list1,list2));
	}
	
	

}
