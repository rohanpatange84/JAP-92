/*
✅ Q4. Count Vowels in a String

Problem: Count the number of vowels in the string.

Input: Education

Output: 5
*/

public class Example04{

	public static  int coutVowels(String str){
		int cnt=0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
				str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		

		String str="Education";

		System.out.println("Vovels in "+str+" is: "+coutVowels(str));

	}
}