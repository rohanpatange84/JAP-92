/*
✅ Q20. Remove Vowels but Keep Spaces and Append All Vowels at End

Problem: Remove vowels from sentence and append them at end, preserving spaces.

Input: hello i am java developer

Output: hll mjv dvlpr oiaaaeeoe
*/

public class Example20{

	public static String appendAllVowelAtEnd(String str){

		String newStr[]=str.split(" ");

		String newWord="";

		for(int i=0;i<newStr.length;i++){
			StringBuilder str1 = new StringBuilder(newStr[i]);


			
			for(int j=0;j<str1.length();j++){
				if(newStr[i].charAt(j)=='A'||newStr[i].charAt(j)=='E'||newStr[i].charAt(j)=='I'||newStr[i].charAt(j)=='O'||newStr[i].charAt(j)=='U'||
				newStr[i].charAt(j)=='a'||newStr[i].charAt(j)=='e'||newStr[i].charAt(j)=='i'||newStr[i].charAt(j)=='o'||newStr[i].charAt(j)=='u'){
				
					newWord+=str1.charAt(j);
					str1.deleteCharAt(j);
					
					

			}


			}
			newStr[i]=str1.toString();

		}
		
			String strS="";

	for(int i=0;i<newStr.length;i++){
		
			strS+=newStr[i]+" ";
	
		
	}

	strS+=newWord;

	return strS;


	}

	public static void main(String[] args) {
		

		String str="hello i am java developer";

		System.out.println("Append All Vowel At End: "+appendAllVowelAtEnd(str));


	}
}