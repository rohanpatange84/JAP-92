public class StringEx{

	public static String bubbleSort(String str){
		char newstr[]=str.toCharArray();

		int n=newstr.length;

		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(newstr[j]>newstr[j+1]){
					char temp=newstr[j];
					newstr[j]=newstr[j+1];
					newstr[j+1]=temp;
				}

			}
		}

		return new String(newstr);


	}

	public static void main(String[] args) {
		

		String str="international";


		System.out.println("Sorten String :"+bubbleSort(str));
	}
}