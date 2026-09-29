//   Write a Java  program to count the total number of vowels and consonants in a string.




public class Example08{
	public static void main(String[] args) {
		String s1 = "abcdef";

		char s1ch[]=s1.toCharArray();

		 int vowels =0;
		 int consonants =0;

		for(int i=0;i<s1ch.length;i++){

			if(s1ch[i]=='A'||s1ch[i]=='E'||s1ch[i]=='I'||s1ch[i]=='O'||s1ch[i]=='U'||
			   s1ch[i]=='a'||s1ch[i]=='e'||s1ch[i]=='i'||s1ch[i]=='o'||s1ch[i]=='u'){
				vowels++;
			}
			else{
				consonants++;
			}

		}

		System.out.println("Vowels: "+vowels+"  Consonants: "+consonants);
	}
}