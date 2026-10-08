//  Write a Java  program to trim trailing white space characters from a given string.

public class Example23{

	public static String tremTraling(String str){
		char arr[]=str.toCharArray();

		String newStr="";

		boolean light=true;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]!=' '){
				light=false;
			}
			if(light){
				continue;
			}
			else{
				newStr+=arr[i];
			}

		}
		return newStr;
	}

	public static void main(String[] args) {
		
		String str = " Hello    ";

		System.out.println(tremTraling(str).length());



	}
}