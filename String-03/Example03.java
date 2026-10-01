/*
✅ Q3. Swap First and Last Characters

Problem: Swap the first and last characters of the string.

Input: India

Output: andiI

*/

public class Example03{

	public static String swapFirstLastChar(String str){

		String newStr="";

		for(int i=0;i<str.length();i++){
			if(i==0){
				newStr+=str.charAt(str.length()-1);
			}
			else if(i==str.length()-1){
				newStr+=str.charAt(0);

			}else{
				newStr+=str.charAt(i);
			}
		}
		return newStr;

	}

	public static void main(String[] args) {
		String str="India";
		System.out.println(swapFirstLastChar(str));

	}
}

