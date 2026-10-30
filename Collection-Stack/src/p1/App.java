package p1;

import java.util.Stack;
import java.util.Elementor;
public class App {
	public static void main(String[] args) {
		
		Stack<Charccter> st = new Stack<>();
		String ss="";
		
		st.push('J');
		st.push('A');
		st.push('V');
		st.push('A');
		
		System.out.println(st);
		
		while(!st.empty()) {
			ss+=st.pop();
			
		}
		
		System.out.println(ss);
		
		
	}

}
