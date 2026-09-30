// Write a Java  program to count occurrences of a character in a given string.

public class Example06{

	public static int countOccurrence(String str, char ch){

		int cnt=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				cnt++;
			}
		}

		return cnt;

	}

	public static void main(String[] args) {
		

		String str = "Heloo i am Rohan";
		char ch='o';

		if(countOccurrence(str,ch)==0)
			System.out.println("Character not match");
		else
			System.out.println("Count of Occurance is: "+countOccurrence(str,ch));
	}
}