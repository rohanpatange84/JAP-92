//  Write a Java  program to convert lowercase string to uppercase.

public class Example07{
	public static void main(String[] args) {
		
		String name="rohan";

		char namech[]=name.toCharArray();

		for(int i=0;i<namech.length;i++){
			if(namech[i]>='a'&&namech[i]<='z'){
				namech[i]=(char)(namech[i]-32);
			}

			}

			 for(char n:namech){
				System.out.print(n+"");
			}

		
	}
}