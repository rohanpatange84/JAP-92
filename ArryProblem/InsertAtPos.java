public	class InsertAtPos{

	public static int[] insertAtPos(int arr[],int num, int position){

		int newArr[]=new int[arr.length+1];
		int k=0;


		for(int i=0;i<newArr.length;i++){
			if(i==position-1){
				newArr[i]=num;
			}else{
				newArr[i]=arr[k++];
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
		int position=4;

		int newArr[]=insertAtPos(arr,num,position);

		printArr(arr);
		printArr(newArr);
	}
}