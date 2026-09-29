//  Write a Java  program to find the length of a string.

public class Example03{
	public static void main(String[] args) {
		 String name="Rohan";

		 char n[]=name.toCharArray();

		 for(int i=0;i<n.length;i++){
		 	System.out.print(n[i]+" ");
		 }
		 System.out.println();

		 System.out.println("Length of String is: "+n.length);
	}
}