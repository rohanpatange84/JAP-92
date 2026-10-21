public class DeletFirstEle{

	public static int[] deletFirstEle(int arr[]){

		int newArr[]=new int[arr.length-1];

		for(int i=0;i<newArr.length;i++){
			newArr[i]=arr[i+1];
		}

		return newArr	;
	}

	public static void printArr(int arr[]){

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	
		int arr[]={10,20,30,40,50};
		int newArr[]= deletFirstEle(arr);
		printArr(arr);
		printArr(newArr	);
	}
}