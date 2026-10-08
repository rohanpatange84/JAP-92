/*

✅ Q19. Replace Vowels in Each Word with Increasing Count

Problem: In each word, replace vowels with increasing count (starting from 1 per word).

Input: hello i am java developer

Output: h1ll2 1 1m j1v2 d1v2l3p4r
*/

public class Example19{

	public static String replaceVovelsWithCount(String str){

		String newStr[]=str.split(" ");

		for(int i=0;i<newStr.length;i++){
			StringBuilder str1 = new StringBuilder(newStr[i]);


			int cnt=0;
			for(int j=0;j<newStr[i].length();j++){
				if(newStr[i].charAt(j)=='A'||newStr[i].charAt(j)=='E'||newStr[i].charAt(j)=='I'||newStr[i].charAt(j)=='O'||newStr[i].charAt(j)=='U'||
				newStr[i].charAt(j)=='a'||newStr[i].charAt(j)=='e'||newStr[i].charAt(j)=='i'||newStr[i].charAt(j)=='o'||newStr[i].charAt(j)=='u'){
					cnt++;
					str1.deleteCharAt(j);
					str1.insert(j,cnt);

			}


			}
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

		System.out.println("Replace Vovels With Count: "+replaceVovelsWithCount(str));


	}
}