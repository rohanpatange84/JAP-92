/*

✅ Q9. Count Words in a Sentence

Problem: Count the number of words in a sentence.

Input: hello i am java developer

Output: 5


*/

public  class Example09{

	public static int countNumOfWords(String str){

		// int cnt=1;

		// for(int i=0;i<str.length();i++){
		// 	if(str.charAt(i)==' ')
		// 		cnt++;
		// }
		// return cnt;

		String newStr[]=str.trim().split("\\s+");

		for(int i=0;i<newStr.length;i++){
			System.out.println(newStr[i]);
		}
		return newStr.length;
	}
	public static void main(String[] args) {
		
		String str= "hello   i am    rohna patange";

		System.out.println(countNumOfWords(str));

	}
}