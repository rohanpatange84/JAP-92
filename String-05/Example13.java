/*


✅ Q13. Reverse Each Word in Sentence

Problem: Reverse each individual word in the sentence.

Input: hello i am java developer

Output: olleh i ma avaj repoleved


*/

public class Example13{

	public static String reverseEachWord(String str){



		String newStr[]=str.split(" ");

		for(int i=0;i<newStr.length;i++){
			StringBuilder str1=new StringBuilder(newStr[i]);
			str1.reverse();
			newStr[i]=str1.toString();
		}

		String newS="";
		for(int i=0;i<newStr.length;i++){
			if(i<newStr.length-1){
				newS+=newStr[i]+" ";

			}
			else{
				newS+=newStr[i];
			}
		}

		return newS;

	}

	public static void main(String[] args) {
		

		String str = "hello i am java developer";
		System.out.println("Reverse Each Word: "+reverseEachWord(str));
	}
}