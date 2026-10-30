package p1;
import java.util.Stack;

public class Example02{
	
	public static boolean validPara(String str,Stack<Character> ch) {
		
		if(str.length()%2!=0) {
			return false;
		}
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='['||str.charAt(i)=='{') {
				ch.push(str.charAt(i));
			}else {
				Character chh = str.charAt(i);
				if(ch.peek()=='('&&chh==')'||ch.peek()=='['&&chh==']'||ch.peek()=='{'&&chh=='}') {
					if(!ch.empty()) {
						ch.pop();
					}
				}
			}
		}
		
		if(ch.empty()) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String str = "{{((){})}}";
		
		Stack<Character> ch =new Stack<>();
		
		System.out.println(validPara(str,ch));
		
		
		


		
		
	}

}
