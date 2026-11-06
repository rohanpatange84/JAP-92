/*
4 :Merge Two Lists Without Duplicates

Input:

List1 = [1, 2, 3, 4]
List2 = [3, 4, 5, 6]

Expected output:
[1, 2, 3, 4, 5, 6]

 */


package p2;


import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
public class Example04 {
	
	public static HashMap<Integer,Integer> meargeArray(int list1[],int list2[]){
		
		HashMap<Integer,Integer> list = new HashMap<>();
		
		
		for(int i=0;i<list1.length;i++) {
			list.put(list1[i],i);	
		}
		for(int i=0;i<list2.length;i++) {
			list.put(list2[i],i);
		}
		
		
		return list;
		
		
		
	}
	
	public static void main(String[] args) {

		int list1[]= {1,2,3,4};
		int list2[]= {3,4,5,6};
		
		HashMap<Integer,Integer> hs=meargeArray(list1,list2);
		
		Set entries = hs.entrySet();
		
		Iterator itr = entries.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
	

}
