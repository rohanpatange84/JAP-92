/*

✅ Q17. Swap First and Last Letter of Each Word

Problem: Swap the first and last character of each word.

Input: hello i am java developer

Output: oellh i ma aavj revelopd

(Note: Your example was a little off. The output should reflect actual swap.)

*/

public class Example17{

	public static String swapFirstLastOfWord(String str){

		String newStr[]=str.split(" ");

		for(int i=0;i<newStr.length;i++){
			StringBuilder str1 = new StringBuilder(newStr[i]);
			 if (str1.length() > 1) {
			char ch1 = str1.charAt(0);
			char ch2 = str1.charAt(str1.length()-1);
			str1.deleteCharAt(str1.length()-1);
			str1.deleteCharAt(0);
			
            str1.insert(0,ch2);
			str1.insert(newStr[i].length()-1,ch1);
		}
			newStr[i]=str1.toString();
		}

		String strS="";

	for(int i=0;i<newStr.length;i++){
		if(i<newStr.length-1){
			strS+=newStr[i]+" ";
		}
		else{
			strS+=newStr[i];
		}	
	}

	return strS;
	} 



	public static void main(String[] args) {
		
		String str="hello i am java developer";

		System.out.println("Swap first and last leter of each word:  "+swapFirstLastOfWord(str));
	}
}
