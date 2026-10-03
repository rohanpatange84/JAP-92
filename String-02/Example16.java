//   Write a Java  program to find the first occurrence of a word in a given string.


public class Example16{

	public static int  firstConcurrenceWorld(String str, String s1){

		int ans;

			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==s1.charAt(i)){
					for(int j=0;j<s1.length();j++){
						boolean a=true;
						if(str.charAt(i+(j*1))!=s1.charAt(i)){
							a=false;

						}else{
							ans=i;
							return ans;


						}

					}
				}
			}
			return ans;

		
	
	}
	public static void main(String[] args) {
		
		String str ="I am Java Devoloper";
		String s1="Java";

		System.out.println(firstConcurrenceWorld(str,s1));

	


	}
}