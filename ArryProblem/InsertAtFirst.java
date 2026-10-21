public class InsertAtFirst{

	public static int[] insertAtFirst(int arr[],int num){

	int newArr[]=new int[arr.length+1];

	for(int i=0;i<newArr.length;i++){
		if(i==0){
			newArr[i]=num;
		}else{
			newArr[i]=arr[i-1];
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

		int newArr[]=insertAtFirst(arr,num);

		printArr(arr);
		printArr(newArr);


	}
}