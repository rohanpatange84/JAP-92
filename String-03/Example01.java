/*
✅ Q1. Shift First Character to Last

Problem: Move the first character of the string to the end.

Input: India

Output: ndiaI
*/

public class Example01{

	public static String moveFirstToLastChar(String str){

		String newStr="";

		for(int i=0;i<str.length();i++){
			if(i==0){
				continue;
			}
			else{
				newStr+=str.charAt(i);
			}
		}
		newStr+=str.charAt(0);
		return newStr;

	}

	public static void main(String[] args) {
		String str="India";
		System.out.println(str);
		System.out.println(moveFirstToLastChar(str));

	}
}