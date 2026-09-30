//   Write a Java  program to find the first occurrence of a word in a given string.


public class Example16{

	public static int  firstConcurrenceWorld(String str, String s1){

			 int index = str.indexOf(s1);

			 return index;

		
	
	}
	public static void main(String[] args) {
		
		String str ="I am Java Devoloper";
		String s1="Java";

		System.out.println(firstConcurrenceWorld(str,s1));

	


	}
}