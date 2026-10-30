// 1   Reverse a String    Given a string, reverse it using Stack. Example: JAVA -> AVAJ.


package p1;

import java.util.Stack;
import java.util.Elementor;
public class Example01 {
	
	public static String reverseString(String str, Stack<Character> st) {
		
		String newstr="";
		
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		
		while(!st.empty()) {
			newstr+=st.pop();
		}
		
		
		
		return newstr;
		
		
	}
	
	public static void main(String[] args) {
		
		Stack<Character> st = new Stack<>();
		String ss="JAVA";
		
		String reverse = reverseString(ss,st);
		
		
	
		System.out.println(reverse);
		
		
	}

}
