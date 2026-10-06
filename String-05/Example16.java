/*

✅ Q16. Shift First Letter of Each Word to the End

Problem: Move first character of every word to the end.

Input: hello i am java developer

Output: elloh i ma avaj eveloperd
*/

public class Example16{

	public static String firstToLastLetter(String str){

		String newStr[]=str.split(" ");

		for(int i=0;i<newStr.length;i++){
			StringBuilder str1 = new StringBuilder(newStr[i]);
			char ch = str1.charAt(0);
			str1.deleteCharAt(0);
			str1.insert(newStr[i].length()-1,ch);
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

		System.out.println("First To Last Letter: "+firstToLastLetter(str));
	}
}