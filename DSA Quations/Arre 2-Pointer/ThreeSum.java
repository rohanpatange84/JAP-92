public class Difference{

	public static void difference(int arr[], int diff){

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]-arr[j]==diff){
					System.out.print(arr[i]+" "+arr[j]);
					System.out.println();

					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		

		int arr[]=new int[]{1, 3, 5, 8, 10};
		int diff = 5;

		findTrget(arr,diff);


	}
}