/*
 1 :Find Duplicate Elements

Input:
[10, 20, 30, 20, 40, 10, 50, 30]

Expected output:
10, 20, 30

 */


package p1;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Example01 {
	
	public static HashSet<Integer> getDuplicate(int nums[]){
		
		LinkedHashSet<Integer> h1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			if(!h1.add(nums[i])){
				duplicate.add(nums[i]);
				
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
