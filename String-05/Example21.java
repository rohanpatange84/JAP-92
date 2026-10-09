/*

✅ Q21. Capitalize First Letter of Each Word

Problem: Capitalize the first letter of every word.

Input: hello i am java developer

Output: Hello I Am Java Developer

*/

public class Example21{

	public static String capitalizeFirstLetter(String str){
		String word[]=str.split(" ");

		StringBuilder newString=new StringBuilder();

		for(int i=0;i<word.length;i++){
			newString.append((word[i].substring(0,1).toUpperCase()).concat(word[i].substring(1)).concat(" "));
		}

		return newString.toString().trim();
	}
	public static void main(String[] args) {

		String str="hello i am java developer";
		String result=capitalizeFirstLetter(str);
		System.out.println("---> "+result);

	}
	
}