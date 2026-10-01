/*
✅ Q6. Replace Vowels in Reverse with Vowel Count

Problem: Replace vowels (right to left) with the order they appear.

Input: International

Output: 6nt5rn4t32n1l
*/

public class Example06{

	public static  int coutVowels(String str){
		int cnt=0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
				str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			cnt++;
		}
		return cnt;
	}

	public static  String replaceVowelWithNum(String str){
		String newStr="";
		int cnt=coutVowels(str);

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
				str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			
			newStr+=cnt;
			cnt--;
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