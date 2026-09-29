public class Example07{
	public static void main(String[] args) {
		
		String name="R0HAN";

		char namech[]=name.toCharArray();

		for(int i=0;i<namech.length;i++){
			for(char ch ='A';ch<='Z';ch++){
				if(namech[i]==ch){
					namech[i]=ch.toLowerCase();
				}
			}
		}
	}
}