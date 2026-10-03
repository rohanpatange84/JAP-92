//  Write a Java  program to remove the first occurrence of a word from a string.

public class Example19{

	public static String remoWordLastCons(String str, String word){

		String newStr[]=str.split(" ");

		String newStr1="";
		int k=0;
		int cnt=1;
		boolean ind=true;
		for(int i=0;i<newStr.length;i++){
			
			if(newStr[i].equals(word)&&ind){
				ind=false;
				continue;
			}else{
				if(i==newStr.length-1)
					newStr1+=newStr[i];
				else
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