//    Write a Java  program to replace the last occurrence of a character with another in a string.


public class Example14{

	public static int lastOccurrence(String str, char ch){

		int index=-1;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				index=i;
			}
		}

		return index;

	}

	public static String replaceLastOccurance(String str,char present, char replace){

		int index =lastOccurrence(str,present);

		String newStr="";

		for(int i=0;i<str.length();i++){
			if(index==i)
				newStr=newStr+replace;
			else
				newStr=newStr+str.charAt(i);

		}
		return newStr;
	}

	public static void main(String[] args) {

		String str ="Banana";
		char present ='a';
		char replace = 'o';


		System.out.println(replaceLastOccurance(str,present,replace));
		

	}

}