public class DeletLastEle{

	public static int[] deletLastEle(int arr[]){

		int newArr[]=new int[arr.length-1];

		for(int i=0;i<newArr.length;i++){
			newArr[i]=arr[i];
		}

		return newArr;
	}	 

	public static void printArr(int arr[]){

		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
			
			int arr[] = {10,20,30,40,50};

			int newArr[]=deletLastEle(arr);

			printArr(arr);
			printArr(newArr);


	}
}	