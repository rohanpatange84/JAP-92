//    Write a Java  program to remove all occurrences of a word in a given string.

public class Example21{

	public static int cntOccurance(String str,String word){
		int cnt=0;

		String arr[]=str.split(" ");

		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(word))
				cnt++;
		}
		
		return cnt;

	}

	public static String remoWordAllCons(String str, String word){

		int cnt=cntOccurance(str,word);

		String newStr[]=str.split(" ");

		String newStr1="";
		
		boolean ind=true;
		for(int i=0;i<newStr.length;i++){
			if(newStr[i].equals(word)&&cnt>=1){
				cnt--;
					
			}else{
				newStr1+=newStr[i];
				newStr1+=" ";
			}

		}

			
		// String strn=new String(newStr1);
		return newStr1;
	}

	public static void main(String[] args) {
		

		String str="Hello java i am java developer java";
		String word="java";

		System.out.println(remoWordAllCons(str,word));
		System.out.println(str.length()+" "+remoWordAllCons(str,word).length());


	}
}