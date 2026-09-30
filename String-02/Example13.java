//  Write a Java  program to remove all repeated characters from a given string.

public class Example13{


	public static String removeAllRepeatedChar(String str){

		String newStr="";

		for(int i=0;i<str.length();i++){
			boolean alreadyPresent=false;
			for(int j=0;j<i;j++){
				if(str.charAt(i)==str.charAt(j)){
					alreadyPresent=true;
					break;
				}
			}

			if(!alreadyPresent){
				newStr+=str.charAt(i);
			}

		}
	

		return newStr;

	}

	public static void main(String[] args) {
		

		String str = "Banana";
		System.out.println(removeAllRepeatedChar(str));
	}
}