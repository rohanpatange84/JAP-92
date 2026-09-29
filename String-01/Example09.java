//  Write a Java  program to convert  string  uppercase to lowercase

public class Example09{
	public static void main(String[] args) {
		
		String name="ROHAN";

		char namech[]=name.toCharArray();

		for(int i=0;i<namech.length;i++){
			if(namech[i]>='A'&&namech[i]<='Z'){
				namech[i]=(char)(namech[i]+32);
			}

			}

			 for(char n:namech){
				System.out.print(n+"");
			}

		
	}
}