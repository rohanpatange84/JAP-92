// Write a Java  program to remove the last occurrence of a character from a string.

public class Example11{


	public static int countOccurrence(String str, char ch){

		int cnt=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				cnt++;
			}
		}

		return cnt;

	}

public  static String removeLastOccurance(String str,char ch){


	
	int cnt=countOccurrence(str,ch);
	String newStr="";

	for(int i=0;i<str.length();i++){

		if(str.charAt(i)==ch){
			if(cnt>1){
				newStr=newStr+str.charAt(i);
				cnt--;
			}else
				continue;

				
		}else{
			newStr=newStr+str.charAt(i);
		}

	}
	
	return newStr;
}

	public static void main(String[] args) {
		
		String str = "component";
		char ch='o';

		System.out.println("After removinng Last Occurance: "+removeLastOccurance(str,ch));
	}
}