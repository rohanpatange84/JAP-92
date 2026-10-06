/*✅ Q14. Append Word Position to Each Word

Problem: Append word number (starting from 1) to each word.

Input: hello i am java developer

Output: hello1 i2 am3 java4 developer5
*/

public class Example14{

	public static String appendWordPosition(String str){

	String newStr[]=str.split(" ");

	for(int i=0;i<newStr.length;i++){
		StringBuilder str1 = new StringBuilder(newStr[i]);
		str1.append((i+1));
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

		System.out.println("Append Word Position: "+appendWordPosition(str));
	}
}