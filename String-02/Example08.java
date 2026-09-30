//   Write a Java  program to find the lowest frequency character in a string.


public class Example08{

	public static void lowestFrequency(String str){

		int ans=0;
		int frequency=0;
		for(int i=0;i<str.length();i++){
			int cnt=0;
			frequency=0;
			for(int j=0;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					cnt++;
					frequency++;
				}
			}
			
			if(ans<cnt){
				ans=i;
			}
		}
		System.out.println("Highest Frequency character: '"+str.charAt(ans)+"'");
		System.out.println("Frequency : "+frequency);
	
	}

	public static void main(String[] args) {
		
		String str = "Banana";

		lowestFrequency(str);

		
	}
}