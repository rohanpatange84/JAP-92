//Write a Java  program to find the last occurrence of a word in a given string.

public class Example17{


	public static int lastOccurrenceOfWorld(String str, String s1){

		int index = str.lastIndexOf(s1);
		return index;
	}


	public static void main(String[] args) {
		String str = "I am java developer java";
		String s1= "java";

		System.out.println(lastOccurrenceOfWorld(str,s1));
	}
}