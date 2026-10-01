/*

✅ Q5. Replace Vowels with Vowel Count

Problem: Replace vowels with the order they appear.

Input: International

Output: 1nt2rn3t45n6l

*/

public class Example05{

	public static  String replaceVowelWithNum(String str){
		String newStr="";
		int cnt=0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
				str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			cnt++;
			newStr+=cnt;
		}else{
			newStr+=str.charAt(i);
		}


		}
		return newStr;
	}
	public static void main(String[] args) {
		

		String str="International";

		System.out.println("Vovels in "+str+" is: "+replaceVowelWithNum(str));

	}
}