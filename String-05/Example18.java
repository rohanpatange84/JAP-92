/*

✅ Q18. Move First Character of Each Word to End of Sentence

Problem: Remove the first letter of each word and append them at the end.

Input: hello i am java developer

Output: ello m ava eveloperhiajd
*/

public class Example18{

	public static String moveFirstCharacterOfEachToLastWord(String str){

		String newStr[]=str.split(" ");

		String newWord="";

		for(int i=0;i<newStr.length;i++){
			StringBuilder str1 = new StringBuilder(newStr[i]);
			newWord+=str1.charAt(0);
			str1.deleteCharAt(0);
			newStr[i]=str1.toString();
		}

		String newS="";

		for(int i=0;i<newStr.length;i++){
			if(i<newStr.length-1){
				newS+=newStr[i]+" ";
			}else{
				newS+=newStr[i]+newWord;
			}
		}

		return newS;

	}
	public static void main(String[] args) {
		

		String str="hello i am java developer";

		System.out.println("Move First Character Of Each Word To LastWord: "+moveFirstCharacterOfEachToLastWord(str));
	}
}