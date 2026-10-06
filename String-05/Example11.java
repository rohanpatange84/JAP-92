/*✅ Q11. Sort Words Lexicographically

Problem: Sort all words in dictionary (alphabetical) order.

Input: hello i am java developer

Output: am developer hello i java
*/

public class Example11{
	public static String sortLexicographically(String str){

		String str1 = str.replaceAll("\\s+", " ").trim();

		String newStr[]=str1.split(" ");

		for(int i=0;i<newStr.length;i++){
			for(int j=0;j<newStr.length-1;j++){
				if(newStr[j].charAt(0)>newStr[j+1].charAt(0)){
					String temp=newStr[j];
					newStr[j]=newStr[j+1];
					newStr[j+1]=temp;
				}
			}
		}

		String newS="";

		int cnt=newStr.length-1;

		for(int i=0;i<newStr.length;i++){
			if(i<newStr.length-1){
				newS+=newStr[i]+" ";

			}else{
				newS+=newStr[i];
			}
		}

		return newS;


	}
	public static void main(String[] args) {
		

		String str="hello i am java developer";

		System.out.println("After Sort Lexicographically: "+sortLexicographically(str));
		System.out.println(str.length()+" "+sortLexicographically(str).length());

	}
}