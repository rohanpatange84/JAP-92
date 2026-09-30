// Write a Java  program to search all occurrences of a character in a given string.

public class Example05{

	public static void allOccurrence(String str, char ch){

		
		System.out.print("All occurrence of "+ch+" At index: ");
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				System.out.print(i+" ");
			}
		}

		

	}

	public static void main(String[] args) {
		

		String str = "Heloo i am Rohan";
		char ch='o';

		allOccurrence(str,ch);
	}
}