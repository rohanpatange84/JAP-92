// Write a Java  program to find the total number of alphabets, digits or special characters in a string.

public class Example11{
	public static void main(String[] args) {
		
		String name="Ro12@$HaKHGYUn";

		char namech[]=name.toCharArray();

		int charcter=0;
		int number=0;
		int spchar=0;

		for(int i=0;i<namech.length;i++){
			if(namech[i]>='A'&&namech[i]<='Z'||namech[i]>='a'&&namech[i]<='z'){
				charcter++;
			}
			else if(namech[i]>='0' &&namech[i]<='9'){
				number++;
				
			}
			else{
				spchar++;
			}

			}

			 System.out.println("Character: "+charcter+"   Number: "+number+"  Special charchter: "+spchar);

		
	}
}