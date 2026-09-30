// Write a Java  program to remove all occurrences of a character from a string.

public class Example12{

public  static String removeAllOccurance(String str,char ch){

	
	String newStr="";

	for(int i=0;i<str.length();i++){

		if(str.charAt(i)==ch){
			continue;
		}else{
			newStr=newStr+str.charAt(i);
		}

	}
	return newStr;
}

	public static void main(String[] args) {
		
		String str = "Hello";
		char ch='l';

		System.out.println("Atter removing All Occurance: "+removeAllOccurance(str,ch));
	}
}