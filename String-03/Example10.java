/*
✅ Q10. Find the Longest Word

Problem: Print the longest word in a sentence.

Input: welcome to international airport

Output: international
*/

public class Example10{

	public static String longestString(String str){
		String newStr[]=str.split(" ");

		String ans="";
		int res=0;
		for(int i=0;i<newStr.length;i++){
			
			if(res<newStr[i].length()){
				res=newStr[i].length();
			}

		}

		for(int i=0;i<newStr.length;i++){
			
			if(res==newStr[i].length()){
				ans+=newStr[i];
			}

		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		String str="welcome to international airport";

		longestString(str);

	}
}