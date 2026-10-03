/*
✅ Q8. Sort All Characters Alphabetically

Problem: Sort characters of string alphabetically.

Input: international

Output: aaeiilnnnortt
*/

public class Example08{


	public static char[] swap(char arr[],int i,int j){

		int temp=arr[i];

		arr[i]=arr[j];
		arr[j]=(char)temp;

		return arr;
	}


	public static String sortCharacter(String str){
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){

				if(arr[j]<arr[i]){
					swap(arr,i,j);
					
				}
			}
		}

		String newStr=new String(arr);

		return newStr;
	}


	public static void main(String[] args) {
		

		String str="international";

		System.out.println(sortCharacter(str));
	}
}