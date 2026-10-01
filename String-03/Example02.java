/*
✅ Q2. Shift Last Character to First

Problem: Move the last character of the string to the front.

Input: India

Output: aIndi
*/

public class Example02{

	public static String moveLastToFirstChar(String str){

		String newStr="";
		newStr+=str.charAt(str.length()-1);
		for(int i=0;i<str.length();i++){

			if(i==0){
				continue;

			}else{
			newStr+=str.charAt(i-1);
			}
		}
		
		return newStr;

	}

	public static void main(String[] args) {
		String str="India";
		System.out.println(str);
		System.out.println(moveLastToFirstChar(str));

	}
}
