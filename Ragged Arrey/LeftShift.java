public class LeftShift{

	public  static void leftShift(int arr[]){
		int temp=arr[0];

		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1)
				arr[i]=temp;
			else
				arr[i]=arr[i+1];
		}
	}
	public static void printArre(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50};

		System.out.println("---------before left revese----------");
		printArre(arr);

		leftShift(arr);

		System.out.println("---------after left revese----------");
		printArre(arr);


	}
}