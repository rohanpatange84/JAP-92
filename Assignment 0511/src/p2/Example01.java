/*
 1 :Find Duplicate Elements

Input:
[10, 20, 30, 20, 40, 10, 50, 30]

Expected output:
10, 20, 30

 */


package p2;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class Example01 {
	
	public static HashMap<Integer,Integer> getDuplicate(int nums[]){
		
		HashMap<Integer,String > h1 = new HashMap<>();
		HashMap<Integer,Integer> duplicate = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			if(h1.put(nums[i],"a")!=null) {
				duplicate.put(i,nums[i]);
			}
				
		}
		
	
		
		System.out.println(duplicate);
		
		
		return duplicate;  
	}
	
		public static void main(String[] args) {
			
			int num[]= {10,20,30,20,40,10,50,30};
			
			
			getDuplicate(num);
			
			
			
				
		}
}
