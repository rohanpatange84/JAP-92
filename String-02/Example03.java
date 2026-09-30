//  Write a Java  program to find the first occurrence of a character in a given string.

public	class	Example03{

	public	static	int firstConcurrence(String	str, char ch){

		int res=-1;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				return	i;
			}
		}

		return	res;
	}

	public static void main(String[] args) {
			
			String str="Hello Java";
			char ch='a';

			if(firstConcurrence(str,ch)==-1)
				System.out.println("Invalid Character");
			else
			System.out.println("First Concurrence of "+ch+" At index: "+firstConcurrence(str,ch));
	}
}	