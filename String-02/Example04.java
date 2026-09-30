//  Write a Java  program to find the last occurrence of a character in a given string


public class Example04{

		public static int lastOccurrence(String str, char ch){

		int index=-1;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				index=i;
			}
		}

		return index;

	}

	public static void main(String[] args) {
		
		String str="Hello Java";
			char ch='a';

			if(lastOccurrence(str,ch)==-1)
				System.out.println("Invalid Character");
			else
			System.out.println("Last occurrence of "+ch+" At index: "+lastOccurrence(str,ch));


	}
}