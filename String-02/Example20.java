// Write a Java  program to remove the last occurrence of a word in a given string.

public class Example20{

	public static int cntOccurance(String str,String word){
		int cnt=0;

		String arr[]=str.split(" ");

		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(word))
				cnt++;
		}
		
		return cnt;

	}

	public static String remoWordLastCons(String str, String word){

		int cnt=cntOccurance(str,word);

		String newStr[]=str.split(" ");

		String newStr1="";
		
		boolean ind=true;
		for(int i=0;i<newStr.length;i++){
			if(newStr[i].equals(word)){
				if(cnt>1){
					newStr1+=newStr[i];
					newStr1+=" ";
					cnt--;
					}else{
						continue;
					}
					
			}else{
				newStr1+=newStr[i];
				newStr1+=" ";
			}

		}

			
		// String strn=new String(newStr1);
		return newStr1;
	}

	public static void main(String[] args) {
		

		String str="Hello i am java developer java";
		String word="java";

		System.out.println(remoWordLastCons(str,word));
		System.out.println(str.length()+" "+remoWordLastCons(str,word).length());


	}
}