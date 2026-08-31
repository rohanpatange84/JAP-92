public class ex7{
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50};
		int length=arr.length;

		int newarr[]=new int[length];
		newarr[4]=arr[0];
		for(int i=0;i<arr.length-1;i++){
			
		   newarr[i]=arr[i+1];


		}

		for(int i=0;i<newarr.length;i++){
			System.out.print(" "+newarr[i]);
		}
	}
}