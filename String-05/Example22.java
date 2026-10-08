
/*

✅ Q22. Capitalize Only Vowels

Problem: Convert only the vowels to uppercase in the sentence.

Input: hello i am java developer

Output: hEllO I Am jAvA dEvElOpEr

*/


public class Example22{

	public static String capitalizeOnlyVowels(String str){
		String word[]=str.split(" ");

		StringBuilder newString=new StringBuilder();

		for(int i=0;i<word.length;i++){
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<word[i].length();j++){

				if(word[i].charAt(j)=='A'||word[i].charAt(j)=='E'||word[i].charAt(j)=='I'||word[i].charAt(j)=='O'||word[i].charAt(j)=='U'||
					word[i].charAt(j)=='a'||word[i].charAt(j)=='e'||word[i].charAt(j)=='i'||word[i].charAt(j)=='o'||word[i].charAt(j)=='u'){
						sb.append((word[i].substring(j,j+1).toUpperCase()));
				}else{
					sb.append((word[i].substring(j,j+1)));

				}


			}
			newString.append(sb).append(" ");
			
		}



		return newString.toString().trim();
	}
	public static void main(String[] args) {

		String str="hello i am java developer";
		String result=capitalizeOnlyVowels(str);
		System.out.println("---> "+result);

	}
	
}