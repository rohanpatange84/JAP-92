/*
✅ Q12. Sort Words by Length

Problem: Sort words based on their length (shortest to longest).

Input: hello i am java developer

Output: i am java hello developer
*/

public class Example12{


	public static String sortWordsByLength(String str){

		String newStr[]=str.split(" ");

		for(int i=0;i<newStr.length;i++){
			for(int j=0;j<newStr.length-1;j++){
				if(newStr[j].length()>newStr[j+1].length()){

					String temp=newStr[j];
					newStr[j]=newStr[j+1];
					newStr[j+1]=temp;
				}
			}
		}

		for(int i=0;i<newStr.length;i++){
			System.out.print(newStr[i]+" ");
		}

		String newS="";

		int cnt=newStr.length-1;

		for(int i=0;i<newStr.length;i++){
			if(i<newStr.length-1){
				newS+=newStr[i]+" ";

			}else{
				newS+=newStr[i];
			}
		}

		return newS;

	}

	public static void main(String[] args) {
		
		String str="hello i am java developer";

		System.out.println("Sort Wort by length: "+sortWordsByLength(str));
	}
}