public class DeletEleAt{

	public static int[] deletAt(int arr[],int position){
		int newArr[]= new int[arr.length-1];
		int k=0;

		for(int i=0;i<arr.length;i++){
			if(i==position-1){
				continue;
			}else{
				newArr[k++]=arr[i];
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
		int position = 3;

	

		int newArr[]=deletAt(arr,position);

			printArr(arr);
				printArr(newArr);

	}
}