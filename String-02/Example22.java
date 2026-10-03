/// Write a Java  program to trim leading white space characters from a given string.


public class Example22{

	public static String tremBegin(String str){
		char arr[]=str.toCharArray();

		String newStr="";

		boolean light=true;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==' '&&light){
				continue;
			}
			else{
				light=false;
				newStr+=arr[i];
			}

		}
		return newStr;
	}

	public static void main(String[] args) {
		
		String str = "    Hello    ";

		System.out.println(tremBegin(str);



	}
}