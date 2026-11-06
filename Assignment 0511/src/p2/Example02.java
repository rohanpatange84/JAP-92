/*
2 :Separate Even and Odd Numbers

Input:
[11, 22, 33, 44, 55, 66, 77]
Expected output:

Even: [22, 44, 66]
Odd: [11, 33, 55, 77]

 */


package p2;

import java.util.LinkedHashMap;

public class Example02 {
	
	public static LinkedHashMap<Integer,Integer> getEven(int num[]){
		
		LinkedHashMap<Integer,Integer> even = new LinkedHashMap<>();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0)
				even.put(i+1,num[i]);

		}
		
		return even;
	}
	
public static LinkedHashMap<Integer,Integer> getOdd(int num[]){
		
		LinkedHashMap<Integer,Integer> odd = new LinkedHashMap<>();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0)
				odd.put(i+1,num[i]);

		}
		
		return odd;
	}
	
		public static void main(String[] args) {
			
		   int num[]= {11,22,33,44,55,66,77};
		   
		   System.out.println("Even: "+getEven(num));
		   
		   System.out.println("Odd: "+getOdd(num));
		   
			
		}
}
