public class InsertAtLast{

	public static int[] insertAtLast(int arr[],int num){

		int newArr[]=new int[arr.length+1];

		for(int i=0;i<newArr.length;i++){
			if(i==newArr.length-1){
				newArr[i]=num;
			}else{
				newArr[i]=arr[i];
			}
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
		int arr[]={10,20,30,40,50};
		int num=99;

		int newArr[]=insertAtLast(arr,num);

		printArr(arr);
		printArr(newArr);
	}
}