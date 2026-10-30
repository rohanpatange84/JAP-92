package p1;
import java.util.Stack;
public class App2 {
	public static void main(String[] args) {
		
		String str = "{{()}}";
		
		Stack<Character> ch =new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			ch.push(str.charAt(i));
			
		}
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=ch.peek()){
			ch.pop();
		}
		
		
		}
		
		
System.out.println(ch);

		
		
	}

}
