/*
2 :Separate Even and Odd Numbers

Input:
[11, 22, 33, 44, 55, 66, 77]
Expected output:

Even: [22, 44, 66]
Odd: [11, 33, 55, 77]

 */


package p1;

import java.util.LinkedHashSet;

public class Example02 {
	
	public static LinkedHashSet<Integer> getEven(int num[]){
		
		LinkedHashSet<Integer> even = new LinkedHashSet<Integer>();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0)
				even.add(num[i]);

		}
		
		return even;
	}
	
public static LinkedHashSet<Integer> getOdd(int num[]){
		
		LinkedHashSet<Integer> odd = new LinkedHashSet<Integer>();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0)
				odd.add(num[i]);

		}
		
		return odd;
	}
	
		public static void main(String[] args) {
			
		   int num[]= {11,22,33,44,55,66,77};
		   
		   System.out.println("Even: "+getEven(num));
		   
		   System.out.println("Odd: "+getOdd(num));
		   
			
		}
}
