/*✅ Q15. Append Length of Each Word

Problem: Add length of each word at the end of the word.

Input: hello i am java developer

Output: hello5 i1 am2 java4 developer9
*/

public class Example15{

	public static String appendWordLength(String str){

	String newStr[]=str.split(" ");

	for(int i=0;i<newStr.length;i++){
		StringBuilder str1 = new StringBuilder(newStr[i]);
		str1.append(newStr[i].length());
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

		System.out.println("Append Word Length: "+appendWordLength(str));
	}
}