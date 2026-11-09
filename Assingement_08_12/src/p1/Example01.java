package p1;


import java.util.HashMap;

public class App {
	
	public static boolean isPangram(String str) {
		
		HashMap<Character,Integer> alpha = new HashMap<>();
		
		
		
		
		for(int i=0;i<str.length();i++) {
			alpha.put(str.charAt(i),i);
		}
		
		
	
		
		if(alpha.size()==26) {

			return true;
		}
		return false;
		
	}
	
		public static void main(String[] args) {
			String str = "thequickbrownfoxjumpsoverthelazydog";
			String str2 = "thequickbrownfovgduhfnhfieuddgddnd";
 			
			
			System.out.println("str: "+isPangram(str));
			System.out.println("str2: "+isPangram(str2));
			
		}
}
