/*
✅ Q7. Move Vowels to End (Sorted), Keep Consonants First

Problem: Separate consonants and vowels. Keep consonants in order and append sorted vowels.

Input: International

Output: ntrntnlAaeio
*/

public class Example07{

	public static  String getVowels(String str){
		String newStr="";


		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
				str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			newStr+=str.charAt(i);
		}
		return newStr;
	}


	public static  String getConsonant(String str){
		String newStr="";
		

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
				str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			continue;
			else
				newStr+=str.charAt(i);
		}
		return newStr;
	}

	public static String sperateConsonant(String str){

		String vowel=getVowels(str);
		String consonant=getConsonant(str);

		String sortedVovel=sortCharacter(vowel);

		consonant+=sortedVovel;

		return consonant;

	}


	public static char[] swap(char arr[],int i,int j){

		int temp=arr[i];

		arr[i]=arr[j];
		arr[j]=(char)temp;

		return arr;
	}


	public static String sortCharacter(String str){
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){

				if(arr[j]<arr[i]){
					swap(arr,i,j);
					
				}
			}
		}

		String newStr=new String(arr);

		return newStr;
	}

	public static void main(String[] args) {
		

		String str="International";

		System.out.println(sperateConsonant(str));
	}
}