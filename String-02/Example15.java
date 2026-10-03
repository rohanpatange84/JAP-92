//  Write a Java  program to replace all occurrences of a character with another in a string.

public class Example15{

	public static String replaceAllOccurrence(String str, char present,char replace){

		String newStr="";
		
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==present){
				newStr=newStr+replace;
			}else{
			newStr=newStr+str.charAt(i);
		}
		}

		return newStr;

		

	}

	public static void main(String[] args) {

		String str="Banana";
		char present='a';
		char replace='o';

		System.out.println(replaceAllOccurrence(str,present,replace));
		
	}
}