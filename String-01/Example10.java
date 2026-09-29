//  Write a Java  program to toggle the case of each character of a string.  

public class Example10{
	public static void main(String[] args) {
		
		String name="RoHan";

		char namech[]=name.toCharArray();

		for(int i=0;i<namech.length;i++){
			if(namech[i]>='A'&&namech[i]<='Z'){
				namech[i]=(char)(namech[i]+32);
			}
			else if(namech[i]>='a'&&namech[i]<='z'){
				namech[i]=(char)(namech[i]-32);
			}

			}

			 for(char n:namech){
				System.out.print(n+"");
			}

		
	}
}