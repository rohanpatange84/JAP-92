//    Write a Java  program to count occurrences of a word in a given string.

public class Example18{

	public static int countOccuranceWord(String str,String word){
		String newStr[]=str.split(" ");

		int cnt=0;
		for(int i=0;i<newStr.length;i++){
			if(newStr[i].equals(word))
				cnt++;

		}
		return cnt;

	}

	public static void main(String[] args) {
		String str="Hello i am java developer java";
		String word="java";

		System.out.println(countOccuranceWord(str,word));


	}
}