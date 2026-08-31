public class ex8{
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50};
		int firstdigit=arr[0];
		
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		

		arr[arr.length-1]=firstdigit;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}