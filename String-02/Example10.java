// Write a Java  program to remove the first occurrence of a character from a string.

public class Example10{

public  static String removeFirstOccurance(String str,char ch){

	int cnt=1;
	String newStr="";

	for(int i=0;i<str.length();i++){

		if(str.charAt(i)==ch){
			if(cnt>0)
				cnt--;
			else
				newStr=newStr+str.charAt(i);
		}else{
			newStr=newStr+str.charAt(i);
		}

	}
	return newStr;
}

	public static void main(String[] args) {
		
		String str = "Hello";
		char ch='l';

		System.out.println("Atter removing First Occurance: "+removeFirstOccurance(str,ch));
	}
}